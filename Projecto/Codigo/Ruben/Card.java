package videoPoker;

public class Card {
	private String rank;
	private String suit;
	
	public Card(String card){
		this.rank = card.substring(0,1);
		this.suit = card.substring(1);
	}

	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setCard(String[] cardsVector){
		setRank(cardsVector[0]);
		setSuit(cardsVector[1]);
	}
	@Override
	public String toString(){
		return "The card is " + this.rank + this.suit;
	}
}
