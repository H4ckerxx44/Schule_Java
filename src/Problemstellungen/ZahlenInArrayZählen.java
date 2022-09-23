package Problemstellungen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ZahlenInArrayZählen
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = genArray(1000, 6);
		scoreNums(a);
	}

	public static void scoreNums(ArrayList<Integer> arrlis)
	{
		int lowest = getLowestNumber(arrlis);
		int highest = getHighestNumber(arrlis);

		for (int i = lowest; i < highest + 1; i++)
		{
			int occurrences = Collections.frequency(arrlis, i);
			System.out.printf("%s occurs %s times\n", i, occurrences);
		}
	}

	public static ArrayList<Integer> genArray(int length, int bound)
	{
		ArrayList<Integer> ret = new ArrayList<>();

		Random r = new Random();

		for (int i = 0; i < length; i++)
		{
			ret.add(r.nextInt(bound));
		}

		return ret;
	}

	public static int getHighestNumber(ArrayList<Integer> array)
	{
		array.sort(null);
		return array.get(array.size() - 1);
	}

	public static int getLowestNumber(ArrayList<Integer> array)
	{
		array.sort(null);
		return array.get(0);
	}
}
