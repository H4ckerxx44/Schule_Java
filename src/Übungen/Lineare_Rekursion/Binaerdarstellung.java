package Lineare_Rekursion;

public class Binaerdarstellung
{

    public static void main(String[] args)
{
        System.out.println(gibWertVonBinaer(0));
        System.out.println(gibWertVonBinaer(111010100));
        System.out.println(gibWertVonBinaer(1101));
        System.out.println(gibWertVonBinaer(10001101));
    }

    public static int gibWertVonBinaer(long binaerdarstellung)
{
        return (int)((binaerdarstellung <= 1)
                ? binaerdarstellung
                : (gibWertVonBinaer(binaerdarstellung/10)*2 + binaerdarstellung%10));
    }
}
