package videoPoker;

import java.util.ArrayList;

public class MainTestes {
	public static void main(String[] args){
		
		ArrayList<String> cardsVector = new ArrayList<String>();;
		FileHandler fileHandler = new FileHandler("./src/videoPoker/newFile.txt");
		
		cardsVector = fileHandler.getCardsVector();
		Deck deck = new Deck(cardsVector);
		
		Hand hand = new Hand(deck.getDeck());
		
		Analyser analyser = new Analyser(hand.getHand());
		
		Strategy strategy = new Strategy(hand.getHand(),analyser.getCheckerResult());
				
		strategy.holdPositionCorrector();
		
		for (Card b : strategy.getHandSorted()){
			System.out.println(b.getRank()+b.getSuit());
		}
		
		for (int a : strategy.getIndicesToHold()){
			System.out.println("a = " + a);
		}
		
	}		
}