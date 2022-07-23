package RandomStuff;

public class SchoolStuff
{
	int x = 4;

	enum Level
	{
		LOW,
		MEDIUM,
		HIGH,
		CRITICAL
	}
	public static void main(String[] args)
	{
		System.out.println(v(CustomConstants.M_sun, CustomConstants.AU, CustomConstants.AU));
		System.out.println(mischtemperatur(4.22, 400, 70, 4.22, 50, 22));
		System.out.println(mischtemperatur(4.22, 450, 64, 4.22, 50, 22));


		System.out.println(v(15000, 500, 6));

	}

	public static double randomNum(int min, int max)
	{
		double random = Math.random() * (max - min + 1) + min;
		return random;
	}

	public static void emptyVase(int flowersInVase)
	{
		if (flowersInVase > 0)
		{
			// take one flower and
			System.out.printf("Took %s flower out, %s remaining\n", 1, flowersInVase);
			emptyVase(flowersInVase - 1);
		}
		else
		{
			System.out.println("Done");
		}
	}

	public static int summation(int k)
	{
		if (k > 0)
		{
			return k + summation(k - 1);
		}
		else
		{
			return 0;
		}
	}

	public static int summationl(int k)
	{
		return ((k * k) + k) / 2;
	}

	public static double x_hours_on_y_days(int wattage, double hours_per_day, int days_a_year, double price_per_kwh)
	{
		double usage_wh = wattage * hours_per_day * days_a_year;
		double usage_kwh = usage_wh / 1000;
		double price = usage_kwh * price_per_kwh;
		return price;
	}

	public static void repeatStringNTimes(String message, int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.printf("%s | %d\n", message, i);
		}
	}

	public static boolean isPrime(int num)
	{
		if (num <= 1)
		{
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static int[] fibonacci(int num)
	{
		int[] fib = new int[num];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i < num; i++)
		{
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}

	public static int wasser_erhitzen(int menge, double zieltemp, double starttemp, int heizleistung)
	{
		return (int) ((menge * (zieltemp - starttemp) * 4186) / heizleistung);
	}

	public static double mischtemperatur(double wk1, double mass1, double temp1, double wk2, double mass2, double temp2)
	{
		double t = (((mass1 * wk1 * temp1) + (mass2 * wk2 * temp2)) / ((mass1 * wk1) + (mass2 * wk2)));
		return t;
	}

	public static double v(double parent_mass, double r, double sma_of_body)
	{
		double res = Math.sqrt(CustomConstants.G * parent_mass * ((2 / r) - (1 / sma_of_body)));
		return res;
	}

	public static void datatypes()
	{
		// Integer types
		byte test_byte1 = -128; // from -128 to 127
		byte test_byte2 = 127; // from -128 to 127

		short test_short = 5000; // from -32768 to 32767
		int test_int = 5; // from -2147483648 to 2147483647
		long test_long_int = 9_223_372_036_854_775_807L; //  from -9223372036854775808 to 9223372036854775807

		// Floating point types
		float test_float = 5.99f; // from 3.4e−038 to 3.4e+038
		double test_double = 19.99d; // from 1.7e−308 to 1.7e+308

		// Scientific numbers
		float f1 = 35E3f;
		double d1 = 12E4d;

		// Booleans
		boolean test_boolean = true;

		// Text types
		char test_char = 'D';
		String test_string = "Dennis";

		// Arrays
		String[] names = {"Dennis", "Indra", "Ash"};
		int[] nums_1d = {0, 1, 2};
		int[][] nums_2d = {{0, 1, 2}, {3, 4, 5}};
		int[][][] nums_3d = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
	}
}
