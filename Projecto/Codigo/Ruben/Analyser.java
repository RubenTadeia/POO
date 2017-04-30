package videoPoker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Analyser {

	/* Draw differs from the hand because
	 * draw has only 5 cards instead of 10 */
	private List<Card> draw = new ArrayList<>();

	/* Get an ArrayList of size 10 */
	public Analyser (List<Card> hand){
		for (int i=0; i < hand.size() ;i++){
			this.draw.add(hand.get(i));
		}
	}
	
	public List<Card> getDraw() {
		return draw;
	}

	public void setDraw(List<Card> draw) {
		this.draw = draw;
	}

	public void sorting (){
		draw.sort(new Comparator<Card>(){

			@Override
			public int compare(Card a, Card b) {
				
				/** Return 1 if true - Meaning A bigger than B 
				 *  Return -1 if true - Meaning A smaller than B */
				return a.getValue()>b.getValue()? 1:-1;
			}
		});	
	}
	
	public boolean checkFlush()
	{
		/* Need a new name for this variable */
		/** This gets the first card's suit that is in the draw*/
		String iterationSuit = draw.get(0).getSuit();
		
		for (int i = 1; i< this.draw.size(); i++)
		{
			if(!iterationSuit.equals(draw.get(i).getSuit())){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkStraight()
	{
		/* Need a new name for this variable */
		/** This gets the first card's suit that is in the draw*/
		int iterationValue = draw.get(0).getValue();
		
		for (int i = 1; i < this.draw.size(); i++ , iterationValue++)
		{
			if(iterationValue != draw.get(i).getValue()-1 && 
					draw.get(3).getValue() != draw.get(4).getValue() - 9){
				/** This OR in the if , is to see if the A is in the end
				 * with a 5 preceding him*/
				return false;
			}
		}
		return true;
	}
	
	public boolean checkPair()
	/** This method checks if there is at least a pair of Jacks or Higher */
	{
		/* Need a new name for this variable */
		int iterationValue = draw.get(0).getValue();
		
		for (int i = 1; i < this.draw.size(); i++)
		{
			if(iterationValue == draw.get(i).getValue() && iterationValue >= 10){
				return true;
			}
			iterationValue = draw.get(i).getValue();
		}
		return false;
	}
	
	public boolean check2Pairs()
	/** This method checks if there is at least a pair */
	{
		int numberOfPairs = 0;
		/* Need a new name for this variable */
		int iterationValue = draw.get(0).getValue();
		
		for (int i = 1; i < this.draw.size(); i++)
		{
			if(iterationValue == draw.get(i).getValue()){
				numberOfPairs++;
			}
			
			if(numberOfPairs == 2)
			{
				if (iterationValue != draw.get(i-2).getValue()){
					return true;	
				}
			}
			iterationValue = draw.get(i).getValue();
		}
		return false;
	}
	
	public boolean checkThree()
	/** This method checks if there is at least a three of a kind */
	{
		int checkPair = 1;
		/* Need a new name for this variable */
		int iterationValue = draw.get(0).getValue();
		
		for (int i = 1; i < this.draw.size(); i++)
		{
			if(iterationValue == draw.get(i).getValue()){
				checkPair++;
			}
			else{
				checkPair = 1;
			}
			if (checkPair == 3)
			{
				return true;
			}
			iterationValue = draw.get(i).getValue();
		}
		return false;
	}
	
	public boolean checkPoker()
	/** This method checks if we have a poker. 4 of a kind */
	{
		int checkTriplePair = 1;
		/* Need a new name for this variable */
		int iterationValue = draw.get(0).getValue();
		
		for (int i = 1; i < this.draw.size(); i++)
		{
			if(iterationValue == draw.get(i).getValue()){
				checkTriplePair++;
			}
			else{
				checkTriplePair = 1;
			}
			if (checkTriplePair == 4)
			{
				return true;
			}
			iterationValue = draw.get(i).getValue();
		}
		return false;
	}
	
	public int getCheckerResult(){
		
		/** This is the integer that we will
		 *  return from this function. Depending
		 *  on its value, we result we have on our hand */
		int analyseResult;
		
		/* Check Flush */
		if (checkFlush())
		{
			analyseResult = 4;
		}
		
		/* Check Straight */
		else if (checkStraight())
		{
			analyseResult = 3;
		}
		
		/* Check at least one Pair */
		else if (checkPair())
		{
			analyseResult = 0;
		}
		
		else{ /** Enters here if nothing goes right
		meaning that  */
			analyseResult = 9;
		}
		return analyseResult;
		
	}
	
}
