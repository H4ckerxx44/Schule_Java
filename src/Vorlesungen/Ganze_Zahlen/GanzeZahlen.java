package Ganze_Zahlen;

/**
 * Diese Klasse gibt Code-Beispiele für ganze Zahlen und Zeichenketten.
 * <ul>
 * <li>Notation ganzer Zahlen im Quellcode</li>
 * <li>Anwendung von Operatoren auf ganzen Zahlen</li>
 * <li>Notation von Zeichenketten im Quellcode</li>
 * <li>Anwendung des Verkettungsoperators für Zeichenketten</li>
 * </ul>
 */
public class GanzeZahlen
{

    /**
     * Gibt konstante Werte und Berechnungen für ganze Zahlen und Zeichenketten
     * auf dem Bildschirm aus.
     *
     * @param args wird nicht verwendet
     */
    public static void main(String[] args)
        {

        /*
         * Konstanten vom Typ int, Dezimaldarstellung
         */
        System.out.println(0);
        System.out.println(4711);
        System.out.println(2_000_000_000);
        System.out.println(-4925);
        System.out.println();  // bewirkt Ausgabe einer Leerzeile

        /*
         * Konstanten vom Typ int, Binärdarstellung
         */
        System.out.println(0b0);
        System.out.println(0b110);
        System.out.println(0b1111_1111_1111_1111_1111_1111_1111_1111);
        System.out.println(-0b1111_1111_1111_1111_1111_1111_1111_1111);
        System.out.println();

        /*
         * Konstanten vom Typ int, Oktaldarstellung
         */
        System.out.println(00);
        System.out.println(0715);
        System.out.println(-052);
        System.out.println();

        /*
         * Konstanten vom Typ int, Hexadezimaldarstellung
         */
        System.out.println(0x0);
        System.out.println(0x1F);
        System.out.println(-0xA5);
        System.out.println();

        /*
         * Konstanten vom Typ long
         */
        System.out.println(4711L);
        System.out.println(9_876_543_210L);
        System.out.println(020000000000L);  // oktal
        System.out.println(-0x14L);  // hexadezimal
        System.out.println();

        /*
         * Konstanten vom Typ char
         */
        System.out.println('a');
        System.out.println('\'');
        System.out.println('"');
        System.out.println('\\');
        System.out.println();

        /*
         * Arithmetische Operatoren
         */
        System.out.println(5 / 3 * 3);

        /*
         * Der Ergebnistyp des Operators + für zwei Argumente des Typs int ist
         * ebenfalls int. Das mathematisch korrekte Ergebnis dieser Addition ist
         * im Datentyp int nicht darstellbar. Es kommt zu einem Überlauf.
         */
        System.out.println(2_000_000_000 + 1_000_000_000);
        System.out.println();

        /*
         * Bitweise Operatoren
         */
        System.out.println(0b11010 & 0b01100);
        System.out.println(0b11010 | 0b01100);
        System.out.println(0b11010 ^ 0b01100);
        System.out.println(26 & 12);
        System.out.println(26 | 12);
        System.out.println(26 ^ 12);
        System.out.println((26 ^ 0xFFFFFFFF) + 1);
        System.out.println();

        /*
         * Konstanten vom Typ String
         */
        System.out.println("a");
        System.out.println("Zeichenfolge");
        System.out.println("Gibt's hier noch 3,5\"-Disketten?");
        System.out.println("1. Zeile\n2. Zeile");  // Zeilenumbruch
        System.out.println("1. Spalte\t2. Spalte");  // Tabulator
        System.out.println();

        /*
         * Operator zur Verkettung von Zeichenketten
         */

        /*
         * Verkettung: Beachten Sie bei diesem geschachtelten Ausdruck die
         * Klammerung (3 + 6), damit zuerst die Summe berechnet wird, ehe die
         * Verkettung ausgeführt wird. Nehmen Sie die Klammern weg und
         * beobachten Sie den Unterschied.
         */
        System.out.println("es ist gleich " + (3 + 6) + ":" + 90 / 2 + " Uhr");
        System.out.println();

        /*
         * Konstanten vom Typ boolean
         */
        System.out.println(false);
        System.out.println(true);
    }
}