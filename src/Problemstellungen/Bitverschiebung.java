package Problemstellungen;

public class Bitverschiebung
{
	public static void main(String[] args)
	{
		moveBits(1, 32);
	}

	public static void moveBits(int to_move, int limit)
	{
		for (int i = 1; i < limit + 1; i++)
		{
			int moved = to_move << i;
			System.out.printf("%d << %d = %,d\n", to_move, i, moved);
		}
	}
}
