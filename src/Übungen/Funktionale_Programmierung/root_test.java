package Übungen.Funktionale_Programmierung;

public class root_test
{
	public static void main(String[] args)
	{
		System.out.println(isRoot(2, 9));
	}

	public static boolean isRoot(int root, long num)
	{
		return root > 0 && (long) root * root == num;
	}
}
