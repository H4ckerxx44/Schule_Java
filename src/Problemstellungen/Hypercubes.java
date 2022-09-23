package Problemstellungen;

public class Hypercubes
{
	public static void main(String[] args)
	{
		int lim = 5;
		for (int i = 3; i < lim + 1; i++)
		{
			System.out.printf("%s dim cube(a=x) has %s vertices\n", i, nCubeVertices(i));
			System.out.printf("%s dim cube(a=x) has %s edges\n", i, nCubeEdges(i));
			System.out.printf("%s dim cube(a=x) has %s faces\n", i, nCubeFaces(i));
			System.out.printf("%s dim cube(a=5) has %s surface RandomStuff.area\n", i, nCubeSurfaceArea(5, i));
			System.out.printf("%s dim cube(a=5) has %s volume\n", i, nCubeVolume(5, i));
		}
	}

	public static double nCubeVertices(int dimension)
	{
		return Math.pow(2, dimension);
	}

	public static double nCubeEdges(int dimension)
	{
		return Math.pow(2, dimension - 1) * dimension;
	}

	public static double nCubeFaces(int dimension)
	{
		return Math.pow(2, dimension - 3) * (dimension - 1) * dimension;
	}

	public static double nCubeSurfaceArea(double a, int dimension)
	{
		return 2 * dimension * Math.pow(a, dimension - 1);
	}

	public static double nCubeVolume(double a, int dimension)
	{
		return Math.pow(a, dimension);
	}
}
