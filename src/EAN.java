public class EAN
{
	public static void main(String[] args)
	{
		String code = "978312733381";

		long f = check_for(code);
		long w = check_while(code);

		w += 100;

		System.out.println(f);
		System.out.println(w);



		assert f == w;
	}

	public static long check_for(String ean_code)
	{
		if (ean_code.length() != 12)
		{
			System.out.println("Invalid Code.");
			return 0;
		}
		else
		{
			long multiplikator;
			long zahl;
			long pruefueng = 0;
			boolean eins = false;

			long nummer = Long.parseLong(ean_code);

			for (int i = 0; i < ean_code.length(); i++)
			{
				zahl = nummer % 10;
				if (eins)
				{
					multiplikator = 1;
					eins = false;
				}
				else
				{
					multiplikator = 3;
					eins = true;
				}
				nummer = nummer / 10;
				pruefueng = pruefueng + (zahl * multiplikator);
			}

			pruefueng = 10 - (pruefueng % 10);

			if (pruefueng == 10)
			{
				pruefueng = 0;
			}
			System.out.println(pruefueng);
			return pruefueng;
		}
	}

	public static long check_while(String ean_code)
	{
		long multiplikator;
		long zahl;
		long pruefueng = 0;
		boolean eins = false;

		int durchlauf = 0;
		int laenge = ean_code.length();
		long nummer = Long.parseLong(ean_code);

		while (durchlauf < laenge)
		{
			zahl = nummer % 10;
			if (eins)
			{
				multiplikator = 1;
				eins = false;
			}
			else
			{
				multiplikator = 3;
				eins = true;
			}
			nummer = nummer / 10;
			pruefueng = pruefueng + (zahl * multiplikator);
			durchlauf += 1;
		}

		pruefueng = 10 - (pruefueng % 10);

		if (pruefueng == 10)
		{
			pruefueng = 0;
		}
		System.out.println(pruefueng);
		return pruefueng;
	}
}

