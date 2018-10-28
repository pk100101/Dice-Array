
public class DiceArray 
{
	public static void main (String [] args)
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int [] values = new int [13];
		for (int i=0; i<1000; i++) 
		{
			int sum = die1.roll() + die2.roll();			
			values [sum] ++;
		}
		System.out.println("You rolled a 2 " + values [2] + " times");
		System.out.println("You rolled a 3 " + values [3] + " times");
		System.out.println("You rolled a 4 " + values [4] + " times");
		System.out.println("You rolled a 5 " + values [5] + " times");
		System.out.println("You rolled a 6 " + values [6] + " times");
		System.out.println("You rolled a 7 " + values [7] + " times");
		System.out.println("You rolled an 8 " + values [8] + " times");
		System.out.println("You rolled a 9 " + values [9] + " times");
		System.out.println("You rolled a 10 " + values [10] + " times");
		System.out.println("You rolled a 11 " + values [11] + " times");
		System.out.println("You rolled a 12 " + values [12] + " times");
		
		
	}
}
