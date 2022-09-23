package Übungen.Endrekursion;

public class VerschiedeneZiffern
{
    public static void main(String[] args)
    {
        System.out.println(anzahlZiffern(13236,0));
    }

    public static int anzahlZiffern(int n)
    {
        return (anzahlZiffern(n,0));

    }

    public static int anzahlZiffern(int zahl, int zwischenspeicher)
    {
            return zahl == 0
                    ? zwischenspeicher
                    : gibAnzahl(zahl, zahl%10) == 1
                            ? anzahlZiffern(zahl/10, zwischenspeicher+1)
                            : anzahlZiffern(zahl/10, zwischenspeicher);
       }

    public static int gibAnzahl(long zahl1, int zahl2)
    {
        return zahl1 < 10
                ? zahl1 == zahl2
                    ? 1
                    : 0
                : zahl1 % 10 == zahl2
                    ? 1 + gibAnzahl(zahl1/10, zahl2)
                    : gibAnzahl(zahl1/10, zahl2);
    }
}

