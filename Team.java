public class Team
{
	private String name;
	private double record_current;
	private double record_next;
	private Game[] schedule;
	private int index;

	public Team()
	{
		name = "empty";
		record_current = -1.0;
		record_next = -1.0;
		schedule = new Game[16];
		index = 0;
	}

	public Team(String n)
	{
		name = n;
		record_current = 0.0;
		record_next = 0.0;
		schedule = new Game[16];
		index = 0;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String n)
	{
		name = n;
	}

	public double getRecordCurrent()
	{
		return record_current;
	}

	public void setRecordCurrent(double c)
	{
		record_current = c;
	}

	public double getRecordNext()
	{
		return record_next;
	}

	public void setRecordNext(double n)
	{
		record_next = n;
	}

	public boolean isWinner(Game g)
	{
		if(g.getWinner().getName() == name)
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		return name + ":\t" + String.valueOf(record_current);
	}
}