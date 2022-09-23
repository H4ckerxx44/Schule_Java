package Problemstellungen;

import java.util.ArrayList;
import java.util.Arrays;

public class ListenSplitten
{
	public static void main(String[] args)
	{
		int[] k = new int[30];
		ArrayList<int[]> splitted = chunk(k, 8);
		for (int[] ints : splitted)
		{
			System.out.println(Arrays.toString(ints));
		}
	}

	public static ArrayList<int[]> chunk(int[] arrayToSplit, int chunkSize)
	{
		ArrayList<int[]> chunks = new ArrayList<>();
		int a = 1;

		for (int i = 0; i < arrayToSplit.length; i += chunkSize)
		{
			// Math.min da i + chunkSize außerhalb des Arrays liegen kann, sollte das der Fall sein,
			// wird auf die Array-Länge zurückgegriffen, da das Ende des chunks sonst außerhalb
			// des arrays liegen würde
			// wenn i + chunksize > länge des arrays, ist das ende der "sub liste" das ende das ursprünglichen
			// arrays
			int to = Math.min(arrayToSplit.length, i + chunkSize);

			int from = i;
			System.out.printf("iteration %s | we take element %s to %s | doing %s steps\n", a, from, to, chunkSize);

			chunks.add(Arrays.copyOfRange(arrayToSplit, i, to));

			a += 1;
		}
		return chunks;
	}
}
