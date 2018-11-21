import java.io.File;
import java.util.Scanner;

public class League
{
	private Team[] league;

	public League()
	{
		league = new Team[32];

		try
		{
			File file = new File("NFL.txt");
			Scanner input = new Scanner(file).useDelimiter(",|\\n");

			for(int i = 0; i < 32; i++)
			{
				league[i] = new Team(input.next());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	public String toString()
	{
		String output = "";

		for(int i = 0; i < 32; i++)
		{
			output += (league[i].toString() + "\n");
		}

		return output;
	}
}