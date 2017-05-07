package videoPoker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Strategy {
	private List<Card> handUnsorted = new ArrayList<>();
	private List<Card> handSorted = new ArrayList<>();
	
	public Strategy(List<Card> hand){
		
		for (int i=0; i < 5; i++){
			this.handUnsorted.add(hand.get(i));
			this.handSorted.add(hand.get(i));
		}
		/** Sorts the hand */
		sorting();
	}
	public void updateHand( List<Card> l){
		this.handUnsorted = l;
	}
	private void sorting (){
		handSorted.sort(new Comparator<Card>(){

			@Override
			public int compare(Card a, Card b) {
				
				/** Return 1 if true - Meaning A bigger than B 
				 *  Return -1 if true - Meaning A smaller than B */
				return a.getValue()>b.getValue()? 1:-1;
			}
		});	
	}
	
	/* This method receives as parameter the sortedHold */
	public boolean[] holdPositionCorrector()
	{
		boolean hold[] = new boolean[5];
		
		/* The difference between the hold and sortedHold
		 * is that, the sortedHold contains the positions
		 * of the cards to change in he class Hand, but it
		 * considers that the cards are sorted in the Hand.
		 * The hold[] vector corrects the positions of the
		 * previous vector */
		int sortedHold[] = new int[5];
		
		sortedHold = gatherIndexToHold();
		
		for (int i = 0; i < 5 ; i++)
		{
			/* Enters here if sorted hold still
			 * has values of cards to hold */
			if (sortedHold[i] != 0){
				Card card = handSorted.get(sortedHold[i]);
				/** Now we will search for this
				 *  card in the unsorted hand */
				
				for (int j = 0; j < 5; j++)
			    {
			        if (card.equals(handUnsorted.get(j)))
			        {
			            hold[j] = true;
			        }
			    } 
				
			}
		}
		
		return hold;
	}
	
	/* This method will gather the indices
	 * and store them in a integer vector
	 * we can later update the hold vector in the Hand Class */
	private int[] gatherIndexToHold(){
		int sortedHold[] = new int[5];
		
		
		
		return sortedHold;
	}

	public List<Card> getHandUnsorted() {
		return handUnsorted;
	}

	public List<Card> getHandSorted() {
		return handSorted;
	}

	public void setHandUnsorted(List<Card> handUnsorted) {
		this.handUnsorted = handUnsorted;
	}

	public void setHandSorted(List<Card> handSorted) {
		this.handSorted = handSorted;
	}
}
