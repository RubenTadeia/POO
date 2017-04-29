package VideoPoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	int mode;
	public Deck(){
		/** For a default Deck with 52 Cards */
		
		char rank[] = {'2', '3', '4', '5', '6', '7', '8', '9', 'T'
				, 'J', 'Q','K','A'};
		
		char suit[] = {'H','C','S','D'};
		
		String auxiliarCard;
		
		for (char i : suit){
			for(char j : rank){
				auxiliarCard = Character.toString(j) + Character.toString(i);
				Card card = new Card(auxiliarCard);
				deck.add(card);
			}
		}
	}
	
	public Deck(ArrayList<String> cardsVector){
		/** For a deck considering that a file is provided */
		for(String s: cardsVector){
			Card card = new Card(s);
			deck.add(card);
		}
	}
	
	public List<Card> getDeck() {
		return deck;
	}

	public Card getOneCard(int indexOfCards) {
		return deck.get(indexOfCards);
	}
	
	public Card getOneCard(String c) {
		if(deck.get(0)== null){
			System.out.println("No more cards ");
			return null;
		}
		
		String suits,rank;
		suits = deck.get(0).getSuit();
		rank = deck.get(0).getRank();
		Card ret = new Card(rank+suits);
		deck.remove(0);
		return ret;
	}
	
	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	public void shuffle(){
		Collections.shuffle(this.deck);
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}
}
