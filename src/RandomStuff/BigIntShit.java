package RandomStuff;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class BigIntShit
{

	public BigIntShit()
	{

	}

	void blabl()
	{
		BigInteger num = BigInteger.valueOf(2);
		for (int expo = 1; expo < 8193; expo++)
		{
			if (expo % 2 == 0)
			{
				BigInteger res = BigInteger.TWO.pow(expo);
				System.out.printf("2^%s = %s\n", expo, res);
			}
		}
	}

	void zehnerPotenz() throws IOException
	{
		PrintWriter wr = new PrintWriter("E:\\java-10er-potenz.md", StandardCharsets.UTF_8);
		wr.println("# BigInteger 10^i");
		wr.println();

		long lim = 2147483647;
		for (int i = 0; i < lim ; i++)
		{
			if (i % 10_000 == 0)
			{
				System.out.printf("%s reached\n", i);
			}

			BigInteger res = BigInteger.TEN.pow(i);
			wr.printf("10^%s = %s \n", i, res);
		}
	}
}
