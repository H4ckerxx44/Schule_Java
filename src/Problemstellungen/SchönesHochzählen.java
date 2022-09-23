package Problemstellungen;

public class SchönesHochzählen
{
	public static void main(String[] args) throws InterruptedException
	{
		counting("Hallo Welt!", 86.0, 100);
	}

	public static void counting(String msg, double limit, int sleep) throws InterruptedException
	{
		for (double i = 0; i < limit + 1; i++)
		{
			double perc = (i / limit) * 100;

			String template = String.format("%s | %,.0f (%,.5f%%)", msg, i, perc);
			System.out.println(template);

			Thread.sleep(sleep);
		}
	}
}
