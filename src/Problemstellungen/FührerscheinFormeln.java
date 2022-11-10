package Problemstellungen;

public class FührerscheinFormeln
{
	public static void main(String[] args)
	{
		double speed = 1420.45;
		int step_size = 50;

		double iter_limit = speed + step_size;
		for (int i = 0; i < iter_limit; i += step_size)
		{
			double r = reaktionsweg(i);
			double b = bremsweg(i);
			double a = anhalteweg(i);
			double g = gefahrenbremsung(i);
			System.out.printf("V=%d; Reaktionsweg: %,.2f | Bremsweg: %,.2f | Anhalteweg: %,.2f | Gefahrenbremsung: %,.2f\n", i, r, b, a, g);
		}
	}

	public static double reaktionsweg(double v)
	{
		return (v / 10) * 3;
	}

	public static double bremsweg(double v)
	{
		return Math.pow((v / 10), 2);
	}

	public static double anhalteweg(double v)
	{
		return reaktionsweg(v) + bremsweg(v);
	}

	public static double gefahrenbremsung(double v)
	{
		return reaktionsweg(v) + (bremsweg(v) / 2);
	}

}
