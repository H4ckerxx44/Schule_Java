package Übungen.Funktionale_Programmierung;

public class Farbe
{

    public static void main(String[] args)
        {
        System.out.println(invertiere(0000000));
        System.out.println(invertiere(10128255));
        System.out.println(gibNaechsteFarbe(10011013));
        System.out.println(gibNaechsteFarbe(10128255));
        System.out.println(gibNaechsteFarbe(255255));
        System.out.println(gibNaechsteFarbe(255255255));
    }

    static int invertiere(int rgb)
{
        int r = rgb / 1000000;
        int g = (rgb / 1000) % 1000;
        int b = rgb % 1000;
        r = 255 - r;
        g = 255 - g;
        b = 255 - b;
        return ((r * 1000 + g) * 1000 + b);
    }

    static int gibNaechsteFarbe(int rgb)
{
        int r = rgb / 1000000;
        int g = (rgb / 1000) % 1000;
        int b = rgb % 1000;

        b = b+1;
        int rest = b / 256;
        b = b % 256;

        g = g + rest;
        rest = g / 256;
        g = g % 256;

        r = r + rest;
        r = r % 256;
        return ((r * 1000 + g) * 1000 + b);
    }
}

