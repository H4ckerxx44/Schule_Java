package Endrekursion;

public class ZahlUmdrehen
{
    public static void main(String[] args)
    {
        System.out.println(dreheUm(0L,0L));
        System.out.println(dreheUm(1L,0L));
        System.out.println(dreheUm(81L,0L));
        System.out.println(dreheUm(155L,0L));
        System.out.println(dreheUm(1234067890L,0L));
    }

    public static long dreheUm(long n)
{
        return dreheUm(n,0);
    }

    public static long dreheUm(long umdrehzahl, long zwischenspeicher)
    {
        return umdrehzahl == 0
                ? zwischenspeicher
                : dreheUm(umdrehzahl / 10, zwischenspeicher * 10 + umdrehzahl % 10);
        }
    }




