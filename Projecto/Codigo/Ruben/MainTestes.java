package videoPoker;

import java.util.ArrayList;

public class MainTestes {
	public static void main(String[] args){
		
		ArrayList<String> cardsVector = new ArrayList<String>();;
		FileHandler fileHandler = new FileHandler("./src/videoPoker/newDeck.txt");
		
		cardsVector = fileHandler.getCardsVector();
		Deck deck = new Deck(cardsVector);
		
		Hand hand = new Hand(deck.getDeck());
		
		Analyser analyser = new Analyser(hand.getHand());
	}		
}