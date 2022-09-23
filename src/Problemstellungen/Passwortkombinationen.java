package Problemstellungen;

import java.util.HashMap;
import java.util.Map;

public class Passwortkombinationen
{
	public static void main(String[] args)
	{
		double combinations = calculateCombinations("Donaudampfschifffahrtsblablablal!43498");

		System.out.printf("%,.0f", combinations);
	}

	public static double calculateCombinations(String password)
	{
		String[] lowercase_arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] uppercase_arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] digits_arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] punctuation_arr = {"!", "'", "#", "$", "%", "&", "\"", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^", "_", "`", "{", "|", "}", "~"};

		Map<String, Integer> possibleShit = new HashMap<String, Integer>();

		for (String c : lowercase_arr)
		{
			if (password.contains(c))
			{
				possibleShit.put("lowercase", lowercase_arr.length);
				break;
			}
		}

		for (String c : uppercase_arr)
		{
			if (password.contains(c))
			{
				possibleShit.put("uppercase", uppercase_arr.length);
				break;
			}
		}

		for (String c : digits_arr)
		{
			if (password.contains(c))
			{
				possibleShit.put("digits", digits_arr.length);
				break;
			}
		}

		for (String c : punctuation_arr)
		{
			if (password.contains(c))
			{
				possibleShit.put("punctuation", punctuation_arr.length);
				break;
			}
		}

		int possibleChars = 0;
		for (Map.Entry<String, Integer> has_shit : possibleShit.entrySet())
		{
			possibleChars += has_shit.getValue();
		}

		System.out.println(possibleChars);

		return Math.pow(possibleChars, password.length());
	}
}
