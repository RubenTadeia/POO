package VideoPoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	private int topCard;
	public Deck(){
		/** For a default Deck with 52 Cards */
		this.topCard = 0;
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
			System.out.println("that's the card " +s);
		}
	}
	
	public List<Card> getDeck() {
		return deck;
	}

	public Card getCard(int pila) {
		Card turn = deck.get( pila);
		return turn;
	}
	
	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	public void shuffle(){
		Collections.shuffle(this.deck);
	}
	

}

