package Rationale_Zahlen;

/**
 * Diese Klasse gibt Code-Beispiele für rationale Zahlen.
 * <ul>
 * <li>Notation von Werten der Gleitkomma-Typen im Quellcode</li>
 * <li>Anwendung von einigen Operatoren</li>
 * </ul>
 */
public class RationaleZahlen
{

    /**
     * Gibt konstante Werte und Berechnungen für Gleitkommatypen auf dem
     * Bildschirm aus.
     *
     * @param args wird nicht verwendet
     */
    public static void main(String[] args)
    {

        /*
         * Konstanten vom Typ double
         */
        System.out.println(500.0);
        System.out.println(500d);
        System.out.println(0.5);
        System.out.println(-500.6);
        System.out.println(5E-2);  // 0.05
        System.out.println(0.5E3);  // 500.0
        System.out.println(4.711E3);  // 4711.0

        /*
         * Konstanten vom Typ float
         */
        System.out.println(500F);
        System.out.println(0.5F);
        System.out.println(4.711E10F);
        System.out.println(47110000000F);
        System.out.println();

        /*
         * Division zweier Gleitkommazahlen.
         */
        System.out.println(5.0 / 3.0);

        /*
         * Addition zweier Gleitkommazahlen, die mathematisch eine ganze Zahl
         * ergibt. Java liefert bei Verknüpfung zweier Gleitkommazahlen immmer
         * eine Gleitkommazahl.
         */
        System.out.println(1.5 + 2.5);

        /*
         * Das gleiche bei der Subtraktion und Multiplikation.
         */
        System.out.println(356.5 - 56.5);
        System.out.println(0.25 * 4.0);

        /*
         * Das mathematisch korrekte Ergebnis dieser Berechnungen ist im
         * Datentyp float nicht darstellbar. Der erste Ausdruck liefert den Wert
         * infinity, der zweite -infinity.
         */
        System.out.println(1.1E20F * 1.1E20F);
        System.out.println(-1.1E20F * 1.1E20F);

        /*
         * Gleitkommadivision durch 0.0 liefert infinity oder -infinity, je nach
         * Vorzeichen der Operanden.
         */
        System.out.println(4.0 / 0.0);

        /*
         * Restwertoperator ist auch für Gleitkommazahlen anwendbar. Aber das
         * Ergebnis muss nicht mathematisch exakt sein.
         */
        System.out.println(2.8 % 0.5);

        /*
         * Arithmetik mit Gleitkommazahlen kann zu Ergebnissen führen, die vom
         * mathematisch korrekten Ergebnis abweichen. Alle folgenden Ausdrücke
         * sollten 0 ergeben.
         */
        System.out.println(0.1 + 0.1 + 0.1 - 0.3);
        System.out.println(1000f - 1f / 0.001f);
        System.out.println(100000d - 1d / 0.00001);
    }
}