
public class Dice 
{

	public int numRolls;
	
	
	public Dice ()
	{
		numRolls = 0;
	}
	
	public int roll()
	{
		numRolls++;
		int roll = (int)(Math.random() * 6+1);	
		return roll;
		
	}
	
	public int getNumRolls ()
	{
		return numRolls;
	}
}
