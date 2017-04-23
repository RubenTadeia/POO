package VideoPoker;
import java.lang.String;

public class Card {
	private String rank;
	private String suit;
	
	Card(String[] k){
		this.rank = k[0];
		this.suit = k[1];
	}
	public String getRank(){
		return this.rank;
	}
	
	public String getSuit(){
		return this.suit;
	}
	
	public void setCard(String[] k){
		this.rank = k[0];
		this.suit = k[1];
	}
	@Override
	public String toString(){
		return this.rank +this.suit;
	} 
}
