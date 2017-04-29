package VideoPoker;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		FileHandler cardsInput = new FileHandler("./src/videoPoker/card-file.txt");
	
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
		
		deck.shuffle();
		
//		Card pul = new Card("3H");
//		pul = deck.getOneCard(0);
//		pul.printCard();
//		

		
		Hand draw = new Hand(deck,5);
		draw.printHand();
		System.out.println("Updating hold 2,3,1");
		int[] c = {2,3,1};
		draw.updateHold(c);
		//draw.printHold();
		System.out.println("Updating hand");
		draw.updateHand();
		draw.printHand();
		//deck.shuffle();
		draw.renewHand(deck);
		draw.printHand();
		
		System.out.println("Printing Deck");
		/* Print for deck */
		for (Card k : deck.getDeck())
		{
			k.printCard();
		}
		
		
	}
}
