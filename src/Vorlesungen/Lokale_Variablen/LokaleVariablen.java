package Lokale_Variablen;

/**
 * Der Zweck dieser Klasse ist, Code-Beispiele für die Deklaration und Zuweisung
 * von lokalen Variablen sowie ihre Anwendung in Ausdrücken zu zeigen.
 */
public class LokaleVariablen
{

    /**
     * Führt Berechnungen durch und gibt die Ergebnisse auf dem Bildschirm aus.
     *
     * @param args wird nicht verwendet
     */
    public static void main(String[] args)
    {

        /*
         * Diese Klasse hat keinen anwendungsorientierten Zweck, sondern dient
         * lediglich dazu, den Umgang mit lokalen Variablen zu veranschaulichen.
         * Dies spiegelt sich auch in der Kommentierung wider. Die Kommentare
         * erläutern die verwendeten Anweisungen.
         */

        /*
         * Deklaration lokaler Variablen
         */
        int fahrenheit;
        int celsius;

        /*
         * Deklaration lokaler Variablen mit gleichzeitiger Wertzuweisung
         */
        int anzahl = 1000;

        /*
         * Belegung der Variablen durch Zuweisung
         */
        fahrenheit = 40;
        celsius = (fahrenheit - 32) * 5 / 9;

        /*
         * Variablen können innerhalb von Ausdrücken verwendet werden. Die
         * Variable fahrenheit besitzt den Wert, mit dem sie zuletzt belegt
         * wurde (hier also 40).
         */
        System.out.println(celsius);
        System.out.println((fahrenheit - 32) * 5 / 9);

        /*
         * Einer Variablen kann mehr als einmal ein Wert zugewiesen werden.
         */
        fahrenheit = 20;

        /*
         * Gleicher Ausdruck wie oben, jedoch hat die Variable fahrenheit nun
         * den Wert 20. Deshalb hat der gesamte Ausdruck einen anderen Wert.
         */
        System.out.println((fahrenheit - 32) * 5 / 9);

        /*
         * Wert der Variablen anzahl viermal um 50% erhöhen. Wert nach jeder
         * Erhöhung ausgeben.
         */
        anzahl = anzahl * 3 / 2;
        System.out.println(anzahl);
        anzahl = anzahl * 3 / 2;
        System.out.println(anzahl);
        anzahl = anzahl * 3 / 2;
        System.out.println(anzahl);
        anzahl = anzahl * 3 / 2;
        System.out.println(anzahl);

        /*
         * Beispiel für Typunverträglichkeit zwischen Variable und Ausdruck in
         * einer Zuweisung.
         */
        // anzahl = true;
    }
}