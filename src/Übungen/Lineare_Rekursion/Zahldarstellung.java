package Übungen.Lineare_Rekursion;

public class Zahldarstellung
{
    public static void main(String[] args)
{
        System.out.println(addiere(1001,11,2));
        System.out.println(addiere(11011,1110,2));
        System.out.println(addiere(210,11,2));
        System.out.println(addiere(773,0,8));
        System.out.println(addiere(0,107,8));
        System.out.println(addiere(773,107,8));
        System.out.println(addiere(773,1239,8));
        System.out.println(addiere(950,192,8));
        System.out.println(addiere(9145,882,10));
        System.out.println(addiere(11111111111L,1,2));
        System.out.println(addiere(323,133,4));
    }

    public static long addiere(long num1, long num2, long base)
{
        long b1 = uebersteigtBase(num1, base);
        long b2 = uebersteigtBase(num2, base);
        num1 = zuDezimalWandeln(b1 < 0 || b2 < 0 ? -1 : num1, base, 1);
        num2 = zuDezimalWandeln(b1 < 0 || b2 < 0 ? -1 : num2, base, 1);
        num1 = num1 + num2;
        return num1 < 0 ? -1 : zurueckWandeln(num1, base, 1);
    }

    public static long zuDezimalWandeln(long num, long base, long exponent)
{
        return base == 10 || num == 0
                    ? num
                    : num % 10 * exponent + zuDezimalWandeln(num / 10, base,exponent * base);
    }

    public static long zurueckWandeln (long num, long base, long pow10)
{
        return num == 0
                ? num
                : num % base * pow10 + zurueckWandeln(num/base, base, pow10*10);
    }

    public static long uebersteigtBase (long num, long base)
{
        return num == 0
                ? 1
                : num % 10 >= base
                    ? -1
                    : uebersteigtBase(num/10, base);
    }
}
