package Übungen.Imperative_Programmierung;

public class decreasing_num
{

	public static void main(String[] args)
	{
		System.out.println(isDecreasing(4321));
		System.out.println(isDecreasing(865431));
		System.out.println(isDecreasing(433321));
		System.out.println(isDecreasing(766544321));
		System.out.println(isDecreasing(764213));
	}

	public static boolean isDecreasing(int num)
	{

		int i = num;

		while (i > 9)
		{
			if (i % 10 <= i / 10 % 10)
			{
				i = i / 10;
			} else
			{
				return false;
			}
		}
		return true;
	}
}
