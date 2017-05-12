package videoPoker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Strategy {
	private List<Card> handUnsorted = new ArrayList<>();
	private List<Card> handSorted = new ArrayList<>();
	private List<Integer> indicesToHold = new ArrayList<Integer>();
	private int analyserResult;
	
	public Strategy(List<Card> hand, int handResult){
		
		/** This integer comes from the function
		 *  getCheckerResult in the Analyser class */
		this.analyserResult = handResult;
		
		for (int i=0; i < 5; i++){
			this.handUnsorted.add(hand.get(i));
			this.handSorted.add(hand.get(i));
		}
		/** Sorts the hand */
		sorting();
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
	
	public void holdPositionCorrector()
	{
		gatherIndexToHold();
		
		for(int i = 0; i < this.indicesToHold.size(); i++){
			handSorted.get(indicesToHold.get(i));
			// matching between hands
			
		}
	}
	
	/* This method will gather the indices
	 * and store them in a integer vector
	 * we can later update the hold vector in the Hand Class */
	private void gatherIndexToHold(){
		
		this.indicesToHold.clear();
		
		/** Case 1 - Straight Flush, four of a kind, royal Flush*/
		if (analyserResult == 8){ /* Royal flush */
			holdAll();
			return;
		}
		else if (analyserResult == 7){ /* Straight Flush */
			holdAll();
			return;
		}
		else if (analyserResult == 6){ /* Poker */
			if(handSorted.get(0).getValue() == handSorted.get(1).getValue()){
				for(int i = 0; i < 4; i++){
					this.indicesToHold.add(i);
				}
			}
			else{
				for(int i = 1; i < 5; i++){
					this.indicesToHold.add(i);
				}
			}
			return;
		}
		
		/** Case 2 - 4 to a royal Flush */
		
		
	}
	
	private void holdAll(){
		for(int i = 0; i < 5; i++){
			this.indicesToHold.add(i);
		}
	}
	
	public List<Card> getHandUnsorted() {
		return handUnsorted;
	}

	public List<Integer> getIndicesToHold() {
		return indicesToHold;
	}

	public int getAnalyserResult() {
		return analyserResult;
	}

	public List<Card> getHandSorted() {
		return handSorted;
	}
}
