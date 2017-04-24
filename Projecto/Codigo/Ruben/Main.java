package videoPoker;
public class Main {
	public static void main(String[] args){
		
		FileHandler cardsInput = new FileHandler("./src/videoPoker/card-file.txt");
	
		/* Just for testing my friend */
		/** cardsInput.printCards();*/
		
		String[] cardsVector = cardsInput.getCardsVector();
		
		/* Another test - Card Class */
		/**for(String line : cardsVector){
			Card card = new Card(line);
			System.out.println(card.toString());
		}*/
	}
}
