package VideoPoker;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){

		FileHandler cardsInput = new FileHandler("./src/VideoPoker/card-file.txt");
	
		/* Test for FileHandler */
		/** cardsInput.printCards();*/
		
		ArrayList<String> cardsVector = new ArrayList<String>();

		cardsVector = cardsInput.getCardsVector();
		Deck deck = new Deck();
		
		/** From File now*/ 
		//FileHandler s = new FileHandler("card-file.txt");

		ArrayList<String> cardsVector2 = new ArrayList<String>();
		cardsVector2 = cardsInput.getCardsVector();
		//é preciso converter para String para o Deck associar
		
		Deck deck2 = new Deck(cardsVector);
		
		/* Another test - Card Class */
		/**for(String line : cardsVector){
			Card card = new Card(line);*/
			/* Just for testing my friend */
			/**card.printCard();
		}*/
		
		/* Test for deck */
		for (Card c : deck2.getDeck())
		{
			c.printCard();
		}
	}
}