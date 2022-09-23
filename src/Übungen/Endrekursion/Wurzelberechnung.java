package Übungen.Endrekursion;
import java.lang.Math;



public class Wurzelberechnung
{

    public static void main(String[] args)
{
        System.out.println(wurzel(9, 0.001, 1));
    }

    public static double wurzel(double x, double epsilon)
    {

        return wurzel(x, epsilon);
    }

    public static double wurzel(double x, double epsilon, double r_n)
    {
        double next = (r_n + (x / r_n)) * 0.5;
        return (Math.abs(r_n - next) <= epsilon)
                ? next
                : wurzel(x, epsilon, next);
    }

}


