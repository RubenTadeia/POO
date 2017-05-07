package videoPoker;

import java.util.ArrayList;

public class MainTestes {
	public static void main(String[] args){
		
		ArrayList<String> cardsVector = new ArrayList<String>();;
		FileHandler fileHandler = new FileHandler("./src/videoPoker/newDeck.txt");
		
		cardsVector = fileHandler.getCardsVector();
		Deck deck = new Deck(cardsVector);
		
		Hand hand = new Hand(deck.getDeck());
		
		System.out.println("Hand Bellow");
		hand.printHand();
		
		Analyser analyser = new Analyser(hand.getHand());
		analyser.sorting();
		
		System.out.println("Analyser Bellow");
		analyser.printDraw();
		
		
		hand.updateHand();
		System.out.println("Hand Bellow");
		hand.printHand();
		analyser.updateDraw(hand.getHand());
		System.out.println("Analyser Bellow");
		analyser.printDraw();
		
		System.out.println("Checker Result "+ analyser.getCheckerResult());
		System.out.println("Hand Result "+ analyser.printHandResult());
	}		
}