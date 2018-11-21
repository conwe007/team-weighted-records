public class Game
{
	private Team winner;
	private Team loser;

	public Game()
	{
		winner = null;
		loser = null;
	}

	public Game(Team w, Team l)
	{
		winner = w;
		loser = l;
	}

	public Team getWinner()
	{
		return winner;
	}

	public void setWinner(Team w)
	{
		winner = w;
	}

	public Team getLoser()
	{
		return loser;
	}

	public void setLoser(Team l)
	{
		loser = l;
	}



	public String toString()
	{
		return "Winner:\t" + winner.getName() + "\tLoser:\t" + loser.getName();
	}
}