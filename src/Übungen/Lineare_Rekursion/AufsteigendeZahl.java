package Übungen.Lineare_Rekursion;

public class AufsteigendeZahl
{
	public static void main(String[] args)

	{
		System.out.println(istAufsteigend(1343));
		System.out.println(istAufsteigend(1334));
		System.out.println(istAufsteigend(25679));
		System.out.println(istAufsteigend(353217));
	}

	@SuppressWarnings("SimplifiableConditionalExpression")
	public static boolean istAufsteigend(int zahl)

	{
		return (zahl < 10)
				? true
				: istAufsteigend(zahl / 10) && ((zahl / 10) % 10 <= zahl % 10);
	}
}
