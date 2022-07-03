public class Rechner
{
	public static void main(String[] args)
	{
		System.out.println(String.format("%s, %s", est(1L), 1));
		System.out.println(String.format("%s, %s", est(12L), 12));
		System.out.println(String.format("%s, %s", est(123L), 123));
		System.out.println(String.format("%s, %s", est(1234L), 1234));
		System.out.println(String.format("%s, %s", est(12345L), 12345));
		System.out.println(String.format("%s, %s", est(123456L), 123456));
		System.out.println(String.format("%s, %s", est(1234567L), 1234567));
		System.out.println(String.format("%s, %s", est(12345678L), 12345678));
		System.out.println(String.format("%s, %s", est(123456789L), 123456789));
	}

	public static long est(Long income)
	{
		long y = (income - 9984) / 10000;
		long z = (income - 14926) / 10000;

		if (income <= 9984)
		{
			return 0;
		}

		if ((income < 14926) && (income > 9985))  // 9.985 - 14.926
		{
			return (long) (y * (1008.70 * y + 1400));
		}

		if ((income < 58596) && (income > 14926)) // 14.927 - 58.596
		{
			return (long) ((206.43 * z + 2397) * z + 938.24);
		}

		if ((income < 277825) && (income > 58597)) // 58.597 - 277.825
		{
			return (long) (0.42 * income - 9267.53);
		}
		else // 277.826+
		{
			return (long) (0.45 * income - 17602.28);
		}
	}
}

