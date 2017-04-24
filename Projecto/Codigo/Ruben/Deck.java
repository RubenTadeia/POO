package videoPoker;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	
	
	public Deck(){
		/** For a regular Deck with 52 Cards */
		char ranks[] = {'2', '3', '4', '5', '6', '7', '8', '9', 'T'
				, 'J', 'Q','K','A'};
		
		char suits[] = {'h','c','s','d'};
		
		String auxiliarCard;
		
		for (char i : suits){
			for(char j : ranks){
				auxiliarCard = Character.toString(i) +
						Character.toString(j);
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

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
}
