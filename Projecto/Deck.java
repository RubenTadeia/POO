package VideoPoker;
import java.util.Random;

public class Deck {
	Card[] deck;
	int head;
	
	public Deck(int size){
		this.deck = new Card[size];
		this.head = 0;
	}
	
	public Card getNewCard(){
		Card t = this.deck[head];
		this.head++;
		return t;
	}
	
	public void insertNewCard(String[] k){
		this.deck[head].setCard(k); 
		this.head++;
	}
	
	public void shuffle(){
		//index declaration
		int i0=0,i1=0;
		//Random number 
		Random ran = new Random();
		//Strings to contain card description
		String[] temp = new String[2];
		String[] temp1 = new String[2];
		//Shuffle (Can be changed to a number in order to shuffle a determined number of times)
		for (int idx = 0; idx <= this.deck.length; ++idx){
		      i0 = ran.nextInt(this.deck.length);
		      i1 = ran.nextInt(this.deck.length);
		      //Card i0
		      temp[0] = deck[i0].getRank();
		      temp[1] = deck[i0].getSuit();
		      //Card i1
		      temp1[0] = deck[i1].getRank();
		      temp1[1] = deck[i1].getSuit();
		      //Switch
		      deck[i0].setCard(temp1);
		      deck[i1].setCard(temp);
		    }
	}
	
	public void printDeck(){
		for(int idx = 0; idx <= this.deck.length; ++idx){
			System.out.println("Card"+deck[idx].toString());
		}
	}
}
