package videoPoker;

public class Statistic {
	private int[] stats;
	private float gainPercentage;
	private int initialCredit;
	
	public int[] getStats() {
		return stats;
	}
	
	public int getInitialCredit() {
		return initialCredit;
	}
	
	public void setStats(int[] stats) {
		this.stats = stats;
	}
	
	public void setInitialCredit(int initialCredit) {
		this.initialCredit = initialCredit;
	}
	
	public Statistic(int playerInitialCredit)
	{
		stats = new int[12];
		
		for (int i = 0; i < 12 ; i++){
			stats[i] = 0;
		}
		this.initialCredit = playerInitialCredit;
		this.setGainPercentage(0);
	}
	
	public void updateStats(int analyseResult , int playerActualCredit)
	{
		stats[analyseResult]++;
		stats[10]++;
		stats[11] = playerActualCredit;
		this.setGainPercentage((playerActualCredit / initialCredit )*100);
	}
	
	public void printStats()
	{
		int lenght = getLenght();
		/* First Column of Results */
		System.out.print("+---------------------+");
		System.out.println("----------------------+");
		System.out.print("|         Hand        |");
		System.out.println("          Nb          |");
		System.out.print("----------------------+");
		System.out.println("----------------------+");
		System.out.print("|   Jacks Or Better   |");
		System.out.println("          "+stats[0]+"           |");
		System.out.print("|   Two Pair          |");
		System.out.println("                      |");
		System.out.print("|   Three of a Kind   |");
		System.out.println("                      |");
		System.out.print("|   Straight          |");
		System.out.println("                      |");
		System.out.print("|   Flush             |");
		System.out.println("                      |");
		System.out.print("|   Full House        |");
		System.out.println("                      |");
		System.out.print("|   Four of a Kind    |");
		System.out.println("                      |");
		System.out.print("|   Straigh Flush     |");
		System.out.println("                      |");
		System.out.print("|   Royal Flush       |");
		System.out.println("                      |");
		System.out.print("|   Other             |");
		System.out.println("                      |");
		System.out.print("----------------------+");
		System.out.println("----------------------+");
		System.out.print("|   Total             |");
		System.out.println("                      |");
		System.out.print("----------------------+");
		System.out.println("----------------------+");
		System.out.print("|   Credit            |");
		System.out.println("                      |");
		System.out.print("----------------------+");
		System.out.println("----------------------+");	
	}
	
	/* Lenght Of the Table 
	 * Hardcoded TODO */
	public int getLenght(){ 
		int lenght = 0;
		int auxiliar;
		for (int i = 0; i < 12 ; i++){
			auxiliar = String.valueOf(this.stats[i]).length();
			if (lenght < auxiliar)
			{
				lenght = auxiliar;
			}
		}
		
		if (lenght < String.valueOf(this.initialCredit).length())
		{
			lenght = String.valueOf(this.initialCredit).length();
		}
		if (lenght < String.valueOf(this.gainPercentage).length())
		{
			lenght = String.valueOf(this.gainPercentage).length();
		}
		
		System.out.println("here " + lenght);
		
		return lenght;
	}
	
	public static String padRight(String s, int n) {
	     return String.format("%1$-" + n + "s", s);  
	}

	public static String padLeft(String s, int n) {
	    return String.format("%1$" + n + "s", s);  
	}

	
	public float getGainPercentage() {
		return gainPercentage;
	}

	public void setGainPercentage(float gainPercentage) {
		this.gainPercentage = gainPercentage;
	}
	
}
