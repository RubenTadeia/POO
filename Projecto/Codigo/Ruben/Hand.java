package videoPoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	private List<Card> hand = new ArrayList<>();
	private boolean[] hold;
	
	public Hand(List<Card> deck, int numberOfCards)
	/** This variable numberOfCards means  */
	{
		int cardsToPlay = numberOfCards;
		this.hold = new boolean[cardsToPlay];
		for(int i=0;i<cardsToPlay;i++)
		{
		  	this.hand.add(deck.get(i));
			this.hold[i] = false;
		}
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public boolean[] getHold() {
		return hold;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public void setHold(boolean[] hold) {
		this.hold = hold;
	}

	public void printHand()
	{		
		System.out.println("player's hand size: "+ this.hand.size());
		System.out.print("player's hand : ");
		for(int i=0;i<hold.length;i++)
		{
			hand.get(i).printCard();
		}
		System.out.println("");
	}
	
	public void updateHand()
	{		
		int swapPoint = hold.length;
		for(int i=0;i<hold.length;i++){
			if(this.hold[i]==false)
			{
				Collections.swap(hand, i, swapPoint);
				hand.remove(hold.length);
			}
		}
	}
	
	public void updateHold(int [] setTrue){
	/** This method sets the Hold Vector to trues
	 *  considering the inputs given*/
		if(setTrue.length == 0)
		{
			return;
		}
		for(int i=0;i<setTrue.length;i++)
		{
			hold[setTrue[i]]=true;
		}
	}
	
	public void renewHand(Deck deck){
			for(int i=0;i<hold.length;i++)
			{
				hand.set(i, deck.getOneCard(hand.size()+i));
				if(i<hand.size()/2){
					hold[i]=false;
				}
			}
		}
		
		public void printHold(){
			for(int i=0;i<hold.length;i++) 
			{
				System.out.println(hold[i]);
			}
		}
	}
