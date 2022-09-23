package Problemstellungen;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplikateAusArrayEntfernen
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 2, 2, 5, 6, 3, 2, 44, 66, 99, 77, 33, 22, 55};
		System.out.println(Arrays.toString(a));

		ArrayList<Integer> withoutDupes = removeDuplicate(a);
		System.out.println(withoutDupes);
	}

	public static ArrayList<Integer> removeDuplicate(int[] arr)
	{
		ArrayList<Integer> k = new ArrayList<>();
		for (int i : arr)
		{
			if (!(k.contains(i)))
			{
				k.add(i);
			}
		}
		return k;
	}
}
