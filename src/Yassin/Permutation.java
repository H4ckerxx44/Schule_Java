package Yassin;

import java.util.Arrays;

public class Permutation
{
	int[] zahlen;

	Permutation(int zahl)
	{
		this.zahlen = new int[zahl];

		for (int i = 0; i < zahl; i++)
		{
			this.zahlen[i] = i;
		}
	}

	public String gibAlsText()
	{
		String arrString = Arrays.toString(this.zahlen);

		arrString = arrString.replace(", ", "-");
		arrString = arrString.replace("[", "");
		arrString = arrString.replace("]", "");

		return arrString;
	}
}
