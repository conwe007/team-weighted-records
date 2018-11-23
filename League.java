import java.io.File;
import java.util.Scanner;

public class League
{
	private Team[] league;
	private Game[] game;

	public League()
	{
		league = new Team[32];
		game = new Game[256];
		File file;
		Scanner input;

		try
		{
			file = new File("NFL.txt");
			input = new Scanner(file).useDelimiter(",|\\n");

			for(int i = 0; i < 32; i++)
			{
				league[i] = new Team(input.next());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			file = new File("NFL.txt");
			input = new Scanner(file).useDelimiter(",|\\n");

			String winner_name = "";
			Team winner_team = null;
			String loser_name = "";
			Team loser_team = null;

			for(int i = 0; i < 256; i++)
			{
				winner_name = input.next();
				for(int w = 0; w < 32; w++)
				{
					if(league[w].getName().equals(winner_name))
					{
						winner_team = league[w];
						break;
					}
				}

				loser_name = input.next();
				for(int l = 0; l < 32; l++)
				{
					if(league[l].getName().equals(loser_name))
					{
						loser_team = league[l];
						break;
					}
				}

				game[i] = new Game(winner_team, loser_team);
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

		output += "\n";

		for(int i = 0; i < 256; i++)
		{
			output += (game[i].toString() + "\n");
		}

		return output;
	}
}