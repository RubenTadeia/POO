package videoPoker;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	
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
	
	public Deck(String[] cardsVector){
		/** For a deck considering that a file is provided */
		
	}
	
	public List<Card> getDeck() {
		return deck;
	}

	public List<Card> getOneCard() {
		return deck;
	}
	
	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
}
