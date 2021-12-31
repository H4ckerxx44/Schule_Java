package Rekursion;

/**
 * Der Zweck dieser Klasse ist es, Code-Beispiele für baumrekursiv definierte Methoden
 * zu geben.
 */
public class Baumrekursion
{

    /**
     * Liefert das n-te Element der Fibonacci-Folge.
     *
     * @param n Index der Fibonacci-Folge, dessen Wert geliefert wird
     * @return Element der Fibonacci-Folge mit dem angegebenen Index
     */
    public static int fib(int n)
    {

//        System.out.println("n = " + n);
//        int fibonacciWert = (n <= 1)
//                            ? n
//                            : fib(n - 2) + fib(n - 1);
//
//        System.out.println("fib(n) = " + fibonacciWert);
//        return fibonacciWert;

        return (n <= 1)
                ? n
                : fib(n - 2) + fib(n - 1);
    }

    /**
     * Liefert Anweisung, um im Spiel „Türme von Hanoi“ eine Anzahl Scheiben von
     * einem Platz zu einem anderen zu bewegen.
     *
     * @param anzahl Anzahl Scheiben, die bewegt werden
     * @param start Zahl zwischen 1 und 3, die den Platz angibt, auf dem anfangs
     * die Scheiben liegen
     * @param ziel Zahl zwischen 1 und 3, die den Platz angibt, auf dem am Ende
     * die Scheiben liegen sollen. Es wird davon ausgegangen, dass beide
     * Platznummern verschieden sind.
     * @return Anwensung zum Bewegen der Scheiben
     */
    public static String bewegeScheiben(int anzahl,
                                        int start, int ziel)
    {

        int zwischenplatz = 6 - start - ziel;
        return anzahl == 0
                ? ""
                : bewegeScheiben(anzahl - 1, start, zwischenplatz)
                + "Bewege Scheibe von " + start
                + " nach " + ziel + "\n"
                + bewegeScheiben(anzahl - 1, zwischenplatz, ziel);
    }

    /**
     * Liefert die Anzahl Ziffern einer Zahl.
     *
     * @param zahl
     * @return Ziffern der Zahl
     */
    public static int gibLaenge(long zahl)
    {

        return zahl < 10
                ? 1
                : gibLaenge(zahl / 10) + 1;
    }

    /**
     * Liefert die hinteren Ziffern einer Zahl als neue Zahl.
     *
     * @param zahl Zahl, deren hintere Ziffern als neue Zahl geliefert werden
     * @param laenge Anzahl der hinteren Ziffern
     * @return hintere Ziffern der übergebenen Zahl als neue Zahl
     */
    public static long gibEnde(long zahl, int laenge)
    {

        return laenge == 1
                ? zahl % 10
                : 10 * gibEnde(zahl / 10, laenge - 1) + zahl % 10;
    }

    /**
     * Entfernt die hinteren Ziffern einer Zahl und liefert die resultierende
     * Zahl.
     *
     * @param zahl
     * @param laenge Anzahl Ziffern, die „abgeschnitten“ werden
     * @return Zahl nach Abschneiden der hinteren Ziffern
     */
    public static long entferneEnde(long zahl, int laenge)
    {

        return laenge == 0
                ? zahl
                : entferneEnde(zahl / 10, laenge - 1);
    }

    /**
     * Liefert die Ziffern einer Zahl angeordnet in einem ausgeglichenen Baum.
     * <ul>
     * <li>Die mittlere Ziffer wird die Wurzel. Ist die Anzahl der Ziffern
     * geradzahlig und gibt es somit keine mittlere Ziffer, wird die Ziffer
     * links der Mitte zur Wurzel.</li>
     * <li>Die Ziffern links davon werden nach gleicher Art zum linken Teilbaum,
     * die Ziffern rechts davon zum rechten Teilbaum.</li>
     * <li>Teilbäume werden durch Klammern eingeschlossen und der resultierende
     * Baum als Zeichenkette repräsentiert.</li>
     * </ul>
     *
     * @param zahl
     * @return Baumdarstellung der Ziffern der übergebenen Zahl
     */
    public static String gibAlsBaum(long zahl)
    {

        int laenge = gibLaenge(zahl);
        return zahl < 10
                ? "" + zahl
                : zahl < 100
                ? zahl / 10 + "(" + zahl % 10 + ")"
                : "(" + gibAlsBaum(entferneEnde(zahl, laenge / 2 + 1)) + ")"
                + entferneEnde(zahl, laenge / 2) % 10
                + "(" + gibAlsBaum(gibEnde(zahl, laenge / 2)) + ")";
    }

    /**
     * Führt die Methoden dieser Klasse mit beispielhaften Parametern aus und
     * gibt die Ergebnisse auf dem Bildschirm aus.
     *
     * @param args wird nicht verwendet
     */
    public static void main(String[] args)
    {

        System.out.println(fib(10));

        System.out.println(bewegeScheiben(10, 1, 3));

        System.out.println(gibAlsBaum(1));
        System.out.println(gibAlsBaum(12));
        System.out.println(gibAlsBaum(123));
        System.out.println(gibAlsBaum(1234567));
        System.out.println(gibAlsBaum(12345678));
        System.out.println(gibAlsBaum(123456789));
    }
}