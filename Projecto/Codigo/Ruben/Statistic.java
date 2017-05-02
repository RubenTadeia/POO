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
		
	}

	public float getGainPercentage() {
		return gainPercentage;
	}

	public void setGainPercentage(float gainPercentage) {
		this.gainPercentage = gainPercentage;
	}
	
}
