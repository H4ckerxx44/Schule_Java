package Problemstellungen;

import java.util.Arrays;
import java.util.Random;

public class NiedrigsteHöchsteZahlInArray
{
	public static void main(String[] args)
	{
		int[] a = genArray(550, 100000000);
		System.out.println(getLowestNumber(a));
		System.out.println(getHighestNumber(a));
	}

	// Schlauer Lösungsweg
	public static int getHighestNumber_smart(int[] array)
	{
		int[] k = array.clone();
		Arrays.sort(k);
		return k[k.length - 1];
	}

	// Schlauer Lösungsweg
	public static int getLowestNumber_smart(int[] array)
	{
		int[] k = array.clone();
		Arrays.sort(k);
		return k[0];
	}

	// Iterativer Lösungsweg
	public static int getLowestNumber(int[] array)
	{
		int max = 0;

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}

	// Iterativer Lösungsweg
	public static int getHighestNumber(int[] array)
	{
		int min = 0;

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}

		}
		return min;
	}

	public static int[] genArray(int size, int bound)
	{
		Random rd = new Random();
		int[] r = new int[size];

		for (int i = 0; i < r.length; i++)
		{
			r[i] = rd.nextInt(bound);
		}
		return r;
	}
}
