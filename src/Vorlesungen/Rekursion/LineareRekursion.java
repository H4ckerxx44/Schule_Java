package Vorlesungen.Rekursion;

/**
 * Der Zweck dieser Klasse ist es, Code-Beispiele für linear rekursiv definierte
 * Methoden zu geben.
 */
public class LineareRekursion
{

    /**
     * Liefert die Fakultät einer natürlichen Zahl <code>n</code>.
     *
     * @param n Zahl, für die die Fakultät berechnet wird; es muss gelten: n
     *          &gt;= 0
     * @return Fakultät von <code>n</code>
     */
    public static int fakultaet(int n)
    {

//        System.out.println("Parameter: " + n);
//        int fak = (n == 0) ? 1 : n * fakultaet(n - 1);
//        System.out.println("Ergebnis für " + n + ": " + fak);
//        return fak;

        return (n == 0)
                ? 1
                : n * fakultaet(n - 1);
    }

    /**
     * Liefert die Quersumme einer ganzen Zahl, d.h. die Summe ihrer
     * Ziffernwerte (bezogen auf die Dezimaldarstellung).
     *
     * @param zahl Zahl, deren Quersumme berechnet wird; es muss gelten: zahl
     *             &gt;= 0
     * @return Quersumme von <code>zahl</code>
     */
    public static int quersumme(int zahl)
    {

//        System.out.println("Parameter: " + zahl);
//        int qs = (zahl < 10)
//               ? zahl
//               : quersumme(zahl / 10) + (zahl % 10);
//        System.out.println("Ergebnis für " + zahl + ": " + qs);
//        return qs;

        /*
         * Die Quersumme einer Zahl ist gleich der Quersumme dieser Zahl ohne
         * die letzte Ziffer plus dem Wert der letzten Ziffer. zahl / 10 ergibt
         * die Zahl ohne die letzte Ziffer, zahl % 10 ergibt den Wert der
         * letzten Ziffer.
         */
        return (zahl < 10)
                ? zahl
                : quersumme(zahl / 10) + (zahl % 10);
    }

    /**
     * Liefert die Stellenzahl der übergebenen Zahl.
     *
     * @param zahl Zahl, deren Stellenanzahl berechnet wird
     * @return Stellenanzahl
     */
    public static int stellenanzahl(int zahl)
    {

        return (zahl < 10)
                ? 1
                : 1 + stellenanzahl(zahl / 10);
    }

    /**
     * Liefert die Summe aller Zahlen von startwert bis zielwert.
     *
     * @param startwert Wert, ab dem summiert wird
     * @param zielwert  Wert, bis zu dem summiert wird
     * @return Summe aller Zahlen von startwert bis zielwert
     */
    public static int summe(int startwert, int zielwert)
    {

        return (startwert > zielwert)
                ? 0
                : summe(startwert, zielwert - 1) + zielwert;
    }

    /**
     * Liefert den größten Ziffernwert in der Dezimaldarstellung von
     * <code>zahl</code>.
     *
     * @param zahl Zahl, deren größter Ziffernwert ermittelt wird; es muss
     *             gelten: zahl &gt;= 0
     * @return größter Ziffernwert
     */
    public static int gibGroessteZiffer(int zahl)
    {

        /*
         * Die größte Ziffer einer Zahl ist das Maximum ihrer letzten Ziffer und
         * der größten Ziffer der Zahl ohne die letzte Ziffer. zahl / 10 ergibt
         * die Zahl ohne die letzte Ziffer, zahl % 10 ergibt den Wert der
         * letzten Ziffer.
         */
        return (zahl < 10)
                ? zahl
                : Math.max(gibGroessteZiffer(zahl / 10), zahl % 10);
    }

    /**
     * Liefert die Summe der geraden Ziffern einer ganzen Zahl bezogen auf die
     * Dezimaldarstellung dieser Zahl.
     *
     * @param zahl Zahl, deren gerade Ziffern summiert werden; es muss gelten:
     *             zahl &gt;= 0
     * @return Summe der geraden Ziffern von <code>zahl</code>
     */
    public static int summeGeraderZiffern(int zahl)
    {

        /*
         * Die gesuchte Summe ist 0, wenn die Zahl 0 ist. Sonst wird Summe für
         * die Zahl ohne ihre letzte Ziffer ermittelt und die letzte Ziffer,
         * falls sie gerade ist, hinzuaddiert.
         */
        return (zahl == 0)
                ? 0
                : (zahl % 2 == 0)
                ? summeGeraderZiffern(zahl / 10) + (zahl % 10)
                : summeGeraderZiffern(zahl / 10);

    }

    /**
     * Gibt an, ob eine Zahl eine gerade Ziffer enthält.
     *
     * @param zahl Zahl, für die untersucht wird, ob sie eine gerade Ziffer
     *             enthält
     * @return genau dann
{@code true}, wenn die übergebene Zahl eine gerade
     *         Ziffer enthält
     */
    public static boolean enthaeltGeradeZiffer(int zahl)
    {

        /*
         * einfacher Fall: die Zahl ist einstellig; dann enthält die Zahl eine
         * gerade Ziffer, wenn die Zahl selbst gerade ist; nicht-einfacher Fall:
         * die Antwort muss true lauten, wenn die Zahl ohne die letzte Ziffer
         * eine gerade Ziffer enthält oder die letzte Ziffer gerade ist.
         */

        /*
         * Lösung mit bedingtem Ausdruck für nicht-einfachen Fall.
         */
//        return zahl < 10
//                ? zahl % 2 == 0
//                : enthaeltGeradeZiffer(zahl / 10)
//                    ? true
//                    : zahl % 2 == 0;

        /*
         * Lösung mit oder-Verknüpfung für nicht-einfachen Fall
         */
        return zahl < 10
                ? zahl % 2 == 0
                : enthaeltGeradeZiffer(zahl / 10) || zahl % 2 == 0;
    }

    /**
     * Führt die Methoden dieser Klasse mit beispielhaften Parametern aus und
     * gibt die Ergebnisse auf dem Bildschirm aus.
     *
     * @param args wird nicht verwendet
     */
    public static void main(String[] args)
    {

        System.out.println(fakultaet(3));  // erwartet: 6

        System.out.println(quersumme(3715));  // erwartet: 16

        System.out.println(stellenanzahl(4567));  // erwartet: 4

        System.out.println(summe(1, 4));  // erwartet: 10

        System.out.println(gibGroessteZiffer(4718));  // erwartet: 8

        System.out.println(summeGeraderZiffern(987654321));  // erwartet: 20

        System.out.println(enthaeltGeradeZiffer(135));  // erwartet: false
        System.out.println(enthaeltGeradeZiffer(13657));  // erwartet: true
    }
}