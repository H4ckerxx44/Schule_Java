package Übungen.Lineare_Rekursion;

public class Zahlenspielerei
{
	public static void main(String[] args)
	{
		System.out.println(verkette(50, 50));
		System.out.println(verkette(3256, 5346346));

		System.out.println(enthaelt(4711, 1));
		System.out.println(enthaelt(4711, 2));
		System.out.println(enthaelt(789, 9));
		System.out.println(enthaelt(0, 0));

		System.out.println(gibAnzahl(0, 0));

		System.out.println(filter(1332, 3));
		System.out.println(filter(3333, 3));
		System.out.println(filter(1332, 4));
		System.out.println(filter(1000, 0));
		System.out.println(filter(1, 1));
		System.out.println(filter(0, 0));
		System.out.println(filter(0, 5));

	}

	public static long verkette(long zahl1, long zahl2)
	{
		return zahl2 < 10
				? zahl1 * 10 + zahl2
				: verkette(zahl1, zahl2 / 10) * 10 + zahl2 % 10;
	}

	public static boolean enthaelt(long zahl1, int zahl2)
	{
		return zahl1 % 10 == zahl2 || zahl1 != 0 && enthaelt(zahl1 / 10, zahl2);
	}

	public static int gibAnzahl(long zahl1, int zahl2)
	{
		return zahl1 >= 10
				? gibAnzahl(zahl1 / 10, zahl2) + (zahl1 % 10 == zahl2
				? 1
				: 0)
				: zahl1 == zahl2
				? 1
				: 0;
	}

	public static long filter(long zahl1, int zahl2)
	{
		return zahl1 > 0
				? zahl1 % 10 == zahl2
				? filter(zahl1 / 10, zahl2)
				: filter(zahl1 / 10, zahl2) * 10 + zahl1 % 10
				: 0;
	}
}