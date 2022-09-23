package Übungen.Funktionale_Programmierung;

/**
 * Diese Klasse berechnet und zeigt ob eine Zahl die Wurzel einer anderen Zahl ist.
 */
public class Wurzeltest
{
    /**
     * Ruft die Methoden auf.
     * @param args wird nicht verwendet, dient nur zum Ausführen
     */
    public static void main(String[]args)
{
        System.out.println("soll: true ist: " + istWurzel(0, 0));
        System.out.println("soll: true ist: " + istWurzel(5, 25));
        System.out.println("soll: false ist: " + istWurzel(-5, 25));
        System.out.println("soll: true ist:" + istWurzel(1_000_000_000, 1_000_000_000_000_000_000L));
        System.out.println("soll: false ist: " + istWurzel(4, 15));
        System.out.println("soll: false ist: " + istWurzel(4, 17));
    }

    /**
     * Diese Methode berechnet und zeigt ob eine Zahl die Wurzel einer anderen Zahl ist.
     * @param zahl1 Zahl * 2 zum berechnen der Wurzel
     * @param zahl2 Quadratzahl (weil wir Wurzel berechnen moechten)
     * @return ob zahl1 die Wurzel von zahl2 ist
     */

    @SuppressWarnings("SimplifiableConditionalExpression")

    public static boolean istWurzel(int zahl1, long zahl2)
{
        return((zahl1 >= 0)
            ? ((long) zahl1 * zahl1 == zahl2)
            : false);
    }
}