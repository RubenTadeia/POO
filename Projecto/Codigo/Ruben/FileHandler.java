package videoPoker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

	private int cardsNumber;
	private ArrayList<String> cardsVector;
	
	public FileHandler(String inputFile){
		String cardsLine = "";
		cardsVector = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			   String line = null;
			   while ((line = br.readLine()) != null) {
				   cardsLine = cardsLine.concat(line);
			   }
			   
			   String[] cardsWithSpaces = cardsLine.split(" ");
			   
			   for (String content : cardsWithSpaces){
				   if (content.length() == 2)
				   {
					   this.cardsVector.add(content);
				   }
			   }
			   
			   this.cardsNumber = cardsVector.size();
			   
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getCardsNumber() {
		return cardsNumber;
	}

	public void setCardsNumber(int cardsNumber) {
		this.cardsNumber = cardsNumber;
	}

	public ArrayList<String> getCardsVector() {
		return cardsVector;
	}

	public void setCardsVector(ArrayList<String> cardsVector) {
		this.cardsVector = cardsVector;
	}

	/** Just for testing */
	public void printCards()
	{
		for (String line : cardsVector){
			System.out.println(line);
	    }
	}
}
