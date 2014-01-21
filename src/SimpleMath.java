import acm.program.*;

public class SimpleMath extends ConsoleProgram 
{
	public void run()
	{
		do 
		{
			int numNums = readInt("How many nums?: ");
			int sum = 0; 
					
			for (int i = 0; i < numNums; i++)
			{
				sum += readInt("Enter Num" + (i+1) + ": ");
			}
			println("Sum: " + sum);
		}
		while(playAgain());
		
		println("Goodbye! :(");
	}
	
	public boolean playAgain()
	{
		String playAgain = readLine("Want to play again? Y or N: ").toLowerCase().trim();
		return (playAgain.equals("y"));
	}
}
