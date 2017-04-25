package videoPoker;

public class Card {
	private String suit;
	private int value;
	
	public Card(String card){
		
		if (card.substring(1).equals("H") || card.substring(1).equals("S") ||
				card.substring(1).equals("D") || card.substring(1).equals("C"))
		{
			this.suit = card.substring(1);
		}
		else
		{
			System.out.println(
					"Wrong type of suit... "
					+ "Strong with your Deck the force is not!");
		}
		
		String rank = card.substring(0,1);
		
		if (rank.equals("T"))
		{
			this.value = 10;	
		}
		else if (rank.equals("J")){
			this.value = 11;
		}
		else if (rank.equals("Q")){
			this.value = 12;
		}
		else if (rank.equals("K")){
			this.value = 13;
		}
		else if (rank.equals("A")){
			this.value = 14;
		}
		else if (Integer.parseInt(rank) >= 2 && 
				Integer.parseInt(rank) <= 9)
		{
			this.value = Integer.parseInt(rank);	
		}
		else
		{
			System.out.println(
					"Wront type of rank... "
					+ "Strong with your Deck the force is not!");	
		}
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void printCard(){
		System.out.println("Card Value - " + this.value + 
				" And the Suit - " + this.suit);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
