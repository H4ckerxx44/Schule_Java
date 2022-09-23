package Problemstellungen;

import java.math.BigDecimal;

public class Bitverschiebung
{
	public static void main(String[] args)
	{
		moveBits(2, 64);
	}

	public static void moveBits(int to_move, int limit)
	{
		for (int i = 0; i < limit; i++)
		{
			BigDecimal moved = BigDecimal.valueOf((long) to_move << i);
			System.out.printf("%d << %d = %,.0f\n", to_move, i, moved);
		}
	}
}
