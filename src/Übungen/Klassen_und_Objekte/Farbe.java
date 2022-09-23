package Übungen.Klassen_und_Objekte;

public class Farbe
{

	private final int r;
	private final int g;
	private final int b;

	public Farbe(int r, int g, int b)
	{

		this.r = r;
		this.g = g;
		this.b = b;
	}

	public Farbe gibInvertierteFarbe(Farbe farbe)
	{

		return new Farbe(255 - this.r, 255 - this.g, 255 - this.b);
	}

	public Farbe gibNaechsteFarbe(Farbe farbe)
	{

		return new Farbe((this.r + 1) % 256, (this.g + 1) % 256, (this.b + 1) % 256);
	}

	public String gibAlsText(Farbe farbe)
	{
		return "(" + this.r + "," + this.g + "," + this.b + ")";
	}
}

