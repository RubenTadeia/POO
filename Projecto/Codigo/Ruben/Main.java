package videoPoker;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		FileHandler cardsInput = new FileHandler("./src/videoPoker/newDeck.txt");
	
		/* Test for FileHandler */
		/**cardsInput.printCards();*/
		
		ArrayList<String> cardsVector = new ArrayList<String>();

		cardsVector = cardsInput.getCardsVector();
		Deck deck = new Deck(cardsVector);
		
		/* Another test - Card Class */
		/**for(String line : cardsVector){
			Card card = new Card(line);*/
			/* Just for testing my friend */
			/**card.printCard();
		}*/
		
		//deck.shuffle();
		
		/* Print for deck */
		/**for (Card c : deck.getDeck())
		{
			c.printCard();
		}*/
	
		/** This second argument integer 5
		 * 	is the number of Cards to remove from the deck. It is here
		 *  so the professor can change it in cause of having will to do it */
		Hand hand = new Hand(deck.getDeck());
		
		/* Print for Hand */
		/**hand.printHand();*/
		
		/** Holds card number 2 and number 4 */
		
		/** Functions to test the hand */
		/*int[] indexToHold = {2,4};
		
		hand.updateHold(indexToHold);
		
		hand.updateHand();
		
		hand.renewHand(deck.getDeck());
		
		hand.printHand(); */
		
		/* Print for hand before the analyser */
		/**for (int it = 0; it < 5; it ++)
		{
			hand.getHand().get(it).printCard();
		}*/
		
		Analyser analyser = new Analyser(hand.getHand());
		
		analyser.sorting();
		
		/* Print for hand before the analyser */
		/**for (Card d : hand.getHand())
		{
			d.printCard();
		}*/
		
		/** analyser.printDraw();*/
		
		int analyseResult = analyser.getCheckerResult();
		/** System.out.println(analyseResult);*/
		
		Prizes prizes = new Prizes();
		
		int reward = prizes.getRewardValue(5, analyseResult, analyser.getDraw());
		System.out.println("reward is = " + reward);
		
	}
}