package Funktionale_Programmierung;

/**
 * Diese Klasse enthält Methoden zur Betrags- und Minimumberechnung.
 * Der eigentliche Zweck dieser Klasse ist jedoch, Beispiele für
 * die Definition und Anwendung statischer Methoden zu geben.
 *
 * Hinweis: Die Namen der Methoden entsprechen nicht der
 * Konvention, Verbformen zu verwenden. betrag und minimum
 * sind aber in der Mathematik eingeführte Bezeichnungen
 * für Funktionen, sodass auch hier diese Begriffe verwendet
 * werden.
 */
public class StatischeMethoden
{

    /**
     * Berechnet den Betragswert einer ganzen Zahl.
     *
     * @param n  ganze Zahl, deren Betrag berechnet wird
     * @return Betrag von n
     */
    public static int betrag(int n)
    {

//        int betragswert;
//        System.out.println("aktueller Parameter n = " + n);
//        betragswert = (n >= 0) ? n : -n;
//        System.out.println("Ergebnis = " + betragswert);
//        return betragswert;

        /* Obige Realisierung mit Bildschirmausgaben hat
         * nur den Zweck, den aktuellen Parameter und
         * den Ergebniswert zu verdeutlichen. Im "echten Leben"
         * sähe die Realisierung der Methode so aus:
         */
        return (n >= 0) ? n : -n;
    }

    /**
     * Berechnet das Minimum von zwei ganzen Zahlen.
     *
     * @param a  erstes Argument
     * @param b  zweites Argument
     * @return Minimum der Zahlen a und b
     */
    public static int minimum(int a, int b)
    {

        return (a <= b) ? a : b;
    }

    /**
     * Berechnet das Minimum von drei ganzen Zahlen.
     *
     * @param a  erstes Argument
     * @param b  zweites Argument
     * @param c  drittes Argument
     * @return Minimum der Zahlen a, b und c
     */
    public static int minimum(int a, int b, int c)
    {

        /* Berechnetes Minimum aller drei Parameter.
         */
        int min;

        /* Ermittlung des Minimums von a und b
         */
        min = (a <= b) ? a : b;

        /* Minimum aller drei Werte ist der kleinere der beiden
         * Werte c und min
         */
        return (c <= min) ? c : min;

        /* Da es eine Methode zur Bestimmung des Minimums von ZWEI
         * ganzen Zahlen gibt (Überladung!), kann man das Minimum
         * von DREI Zahlen alternativ und kürzer auch so realisieren:
         */
//        return minimum(minimum(a, b), c);
    }

    /**
     * Führt beispielhafte Berechnungen aus und gibt die
     * Ergebnisse auf dem Bildschirm aus.
     *
     * @param args  wird nicht verwendet
     */
    public static void main(String[] args)
    {

        int a = -3;

        double quotient = betrag(a) / (double) betrag(a + 1);
        System.out.println(quotient);

        quotient = Math.abs(a) / (double) Math.abs(a + 1);
        System.out.println(quotient);

        System.out.println(minimum(2, 4));

        System.out.println(minimum(2, 4, 4 + a));
    }
}