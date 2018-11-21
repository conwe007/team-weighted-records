import java.io.File;
import java.util.Scanner;

public class League
{
	private Team[] league;

	public League()
	{
		league = new Team[32];
		int i = 0;

		try
		{
			File file = new File("NFL.csv");
			Scanner input = new Scanner(file).useDelimiter(",");

			while(i < 30)
			{
				league[++i] = new Team(input.next());
				league[++i] = new Team(input.next());
				//input.nextLine();
				System.out.println(i);
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
			output += league[i].toString() + "\n";
		}

		return output;
	}
}