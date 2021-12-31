package Funktionale_Programmierung;

public class ProzentualeErhoehung
{
    public static void main(String[]args)
{

        System.out.println("Soll: 3.69 Ist: " + erhoeheBetrag(2.46F, 50));
        System.out.println("Soll: 3.0 Ist: " + erhoeheBetrag(3, 0));
        System.out.println("Soll: 0.0 Ist: " + erhoeheBetrag(0, 90));
        System.out.println("Soll: 23.54 Ist: " + erhoeheBetrag(17.7F, 33));
        System.out.println("Soll: 23.81 Ist: " + erhoeheBetrag(17.9F, 33));

        System.out.println(erhoeheBetrag(100.5f,10));
    }

    public static float erhoeheBetrag(float zahl, int prozentsatz)
{
        float ergebnis = (((zahl + (zahl * (float)prozentsatz / 100)))*100 + 0.5f);
        ergebnis = ((int)ergebnis);
        return (ergebnis/100);

    }
}
