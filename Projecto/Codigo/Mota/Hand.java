package VideoPoker;

public class Hand {
	private Card[] hand = new Card[10];
	private int[] hold = new int[10];
	public Hand(Deck deck){
		int i=0;
		for(Card x : this.hand){
		//	hand[i]=deck.getOneCard();
			i++;
		}
		
		
		
	}
}
