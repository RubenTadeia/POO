package videoPoker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	private int cardsNumber;
	private String[] cardsVector;
	
	public FileHandler(String inputFile){
		String cardsLine = "";

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			   String line = null;
			   while ((line = br.readLine()) != null) {
				   cardsLine = cardsLine.concat(line);
			   }
			   this.cardsVector = cardsLine.split(" ");
			   
			   this.cardsNumber = cardsVector.length;
			   
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


	public String[] getCardsVector() {
		return cardsVector;
	}


	public void setCardsNumber(int cardsNumber) {
		this.cardsNumber = cardsNumber;
	}


	public void setCardsVector(String[] cardsVector) {
		this.cardsVector = cardsVector;
	}

	/** Just for testing */
	public void printCards()
	{
		for (String line : this.cardsVector)
		{
			System.out.println(line);
		}
	}
}
