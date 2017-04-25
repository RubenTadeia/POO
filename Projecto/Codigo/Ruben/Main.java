package videoPoker;

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
		
		/* Print for deck */
		for (Card c : deck.getDeck())
		{
			c.printCard();
		}
		
		
	}
}
