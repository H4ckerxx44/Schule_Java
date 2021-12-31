package Vorlesungen.Imperative_Programmierung;

/**
 * Diese Klasse veranschaulicht die Verwendung von Kontrollstrukturen.
 */
public class Kontrollstrukturen
{

    /**
     * Veranschaulicht die Geltungsbereiche von lokalen Variablen. Im Beispiel
     * wird ein Block unmittelbar innerhalb eines anderen Blocks verwendet. Dies
     * dient nur der Veranschaulichung der Geltungsbereiche und sollte in der
     * Praxis vermieden werden. Die Schachtelung von Blöcken soll nur in
     * Verbindung mit Schleifen und if-Anweisungen erfolgen.
     */
    public static void testeGeltungsbereiche()
    {

        /*
         * Deklaration einer Variablen im äußeren Block.
         */
        int aussen = 10;
        {
            /*
             * Deklaration einer Variable im inneren Block.
             */
            int innen = 5;

            System.out.println("Wert der inneren Variable: " + innen);
            System.out.println("Wert der äußeren Variable: " + aussen);

            /*
             * Wert der außerhalb deklarierten Variablen ändern.
             */
            aussen = 15;
        }

        /*
         * Eine Variable hat den Wert, der zuletzt zugewiesen wurde, unabhängig
         * davon, in welchem Block die Zuweisung erfolgte.
         */
        System.out.println("Wert der äußeren Variable: " + aussen);

        /*
         * Zugriff auf Variable aus innerem Block ist hier nicht möglich. Der
         * Geltungsbereich der Variablen ist auf den inneren Block beschränkt.
         */
        // System.out.println("Wert der inneren Variable: " + innen);
    }

    /**
     * Liefert den Wert eines römischen Ziffernsymbols.
     *
     * @param roemischeZiffer römisches Ziffernsymbol
     * @return Wert des übergebenen Symbols oder -1, wenn das übergebene Zeichen
     *         kein gültiges römisches Ziffernsymbol ist
     */
    public static short gibRoemischenZiffernwert1(char roemischeZiffer)
    {

        short wert;

        if ((roemischeZiffer == 'I') || (roemischeZiffer == 'i'))
        {
            wert = 1;
        }
        else if ((roemischeZiffer == 'V') || (roemischeZiffer == 'v'))
        {
            wert = 5;
        }
        else if ((roemischeZiffer == 'X') || (roemischeZiffer == 'x'))
        {
            wert = 10;
        }
        else if ((roemischeZiffer == 'L') || (roemischeZiffer == 'l'))
        {
            wert = 50;
        }
        else if ((roemischeZiffer == 'C') || (roemischeZiffer == 'c'))
        {
            wert = 100;
        }
        else if ((roemischeZiffer == 'D') || (roemischeZiffer == 'd'))
        {
            wert = 500;
        }
        else if ((roemischeZiffer == 'M') || (roemischeZiffer == 'm'))
        {
            wert = 1000;
        }
        else
        {
            wert = -1;
        }

        return wert;
    }

    /**
     * Liefert den Wert eines römischen Ziffernsymbols.
     *
     * @param roemischeZiffer römisches Ziffernsymbol
     * @return Wert des übergebenen Symbols oder -1, wenn das übergebene Zeichen
     *         kein gültiges römisches Ziffernsymbol ist
     */
    public static short gibRoemischenZiffernwert2(char roemischeZiffer)
    {

        short wert;

        switch (roemischeZiffer)
        {
            case 'I':
            case 'i':
                wert = 1;
                break;
            case 'V':
            case 'v':
                wert = 5;
                break;
            case 'X':
            case 'x':
                wert = 10;
                break;
            case 'L':
            case 'l':
                wert = 50;
                break;
            case 'C':
            case 'c':
                wert = 100;
                break;
            case 'D':
            case 'd':
                wert = 500;
                break;
            case 'M':
            case 'm':
                wert = 1000;
                break;
            default:
                wert = -1;
        }

        return wert;
    }

    /**
     * Berechnet die Summe der Quadrate aller Zahlen im angegebenen Intervall.
     *
     * @param untereGrenze untere Intervallgrenze
     * @param obereGrenze  obere Intervallgrenze
     * @return Summe der Quadrate
     */
    public static long summeQuadrate(int untereGrenze, int obereGrenze)
    {

        long summe = 0;

        int i = untereGrenze;
        System.out.println("i = " + i + ", summe = " + summe);
        while (i <= obereGrenze)
        {
            summe = summe + i * i;
            i = i + 1;
            System.out.println("i = " + i + ", summe = " + summe);
        }
        System.out.println("i = " + i);

        /*
         * oder mit for-Schleife:
         */
//        for (int i = untereGrenze; i <= obereGrenze; i = i + 1)
//        {
//            summe = summe + i * i;
//        }
//        System.out.println("i = " + i);

        return summe;
    }

    /**
     * Prüft, ob ein Wort einen Großbuchstaben zwischen A und Z enthält.
     *
     * @param wort Wort, das geprüft wird
     * @return
{@code true} genau dann, wenn das Wort einen Großbuchstaben
     *         enthält
     */
    public static boolean enthaeltGrossbuchstaben(String wort)
    {

        int i = 0;

        /*
         * Solange über die Zeichen des Worts iterieren, wie noch kein
         * Großbuchstabe aufgetreten ist.
         */
        while ((i < wort.length())
                && !(wort.charAt(i) >= 'A' && wort.charAt(i) <= 'Z'))
        {
            i++;
        }
        return (i < wort.length());
    }

    /**
     * Prüft, ob die Häufigkeit eines bestimmten Zeichens in einer Zeichenkette
     * oberhalb einer bestimmten Grenze liegt.
     *
     * @param wort               Zeichenkette
     * @param zeichen            Zeichen, dessen Häufigkeit untersucht wird
     * @param mindesthaeufigkeit Untergrenze für die Häufigkeit
     * @return
{@code true} genau dann, wenn die Häufigkeit des Zeichens größer
     *         oder gleich der Mindesthäufigkeit ist
     */
    public static boolean enthaeltZeichen(String wort,
                                          char zeichen, int mindesthaeufigkeit)
    {

        int haeufigkeit = 0;

//        int i = 0;
//        while (i < wort.length())
//        {
//            if (wort.charAt(i) == zeichen)
//            {
//                haeufigkeit++;
//            }
//            i++;
//        }

//        int i = 0;
//        while (i < wort.length() && haeufigkeit < mindesthaeufigkeit)
//        {
//            if (wort.charAt(i) == zeichen)
//            {
//                haeufigkeit++;
//            }
//            i++;
//        }

        /*
         * Nicht so gute Realisierung: Häufigkeit insgesamt zählen und dann mit
         * Untergrenze vergleichen.
         */
//        for (int i = 0; i < wort.length(); i = i + 1)
//        {
//            if (wort.charAt(i) == zeichen)
//            {
//                haeufigkeit++;
//            }
//        }

        /*
         * Besser: nur solange zählen, wie die gezählte Häufigkeit noch
         * unterhalb der Grenze liegt.
         */
        for (int i = 0; i < wort.length() && haeufigkeit < mindesthaeufigkeit;
             i = i + 1)
        {
            if (wort.charAt(i) == zeichen)
            {
                haeufigkeit++;
            }
        }

        return haeufigkeit >= mindesthaeufigkeit;
    }

    /**
     * Liefert die Binärdarstellung der übergebenen Zahl.
     *
     * @param zahl Zahl, deren Binärdarstellung berechnet wird
     * @return Binärdarstellung bestehend aus den Zeichen 0 und 1
     */
    public static String gibBinaerdarstellung(long zahl)
    {

        String binaerdarstellung = "";

        do
        {
            long rest = zahl % 2;
            zahl = zahl / 2;

            /*
             * Ziffer an Anfang der Binärdarstellung setzen
             */
            binaerdarstellung = rest + binaerdarstellung;

        } while (zahl > 0);

        return binaerdarstellung;
    }

    /**
     * Gibt alle Teilwörter des übergebenen Worts aus.
     *
     * @param wort Wort, dessen Teilwörter ausgegeben werden
     */
    public static void zeigeAlleTeilwoerter(String wort)
    {

        /*
         * Alle Teilwortlängen beginnend von der Gesamtlänge bis 1 durchlaufen.
         */
        for (int laenge = wort.length(); laenge > 0; laenge = laenge - 1)
        {

            /*
             * Alle möglichen Startpositionen für Teilwörter der jeweiligen
             * Länge durchlaufen. Entsprechendes Teilwort ausgeben.
             */
            for (int index = 0; index <= wort.length() - laenge; index++)
            {
                System.out.println(wort.substring(index, index + laenge));
            }
        }
    }

    /**
     * @param args wird nicht verwendet
     */
    public static void main(String[] args)
    {

        testeGeltungsbereiche();

        /*
         * Beispiel für mehrfache Alternativ-Anweisung
         */
        System.out.println(gibRoemischenZiffernwert1('C'));

        /*
         * Beispiel für einfache while- oder for-Schleife
         */
        System.out.println(summeQuadrate(2, 5));

        /*
         * Beispiel für while-Schleife mit Konjunktion von Bedingungen.
         */
        System.out.println(enthaeltGrossbuchstaben("abcYdef"));

        /*
         * Beispiel für while- und for-Schleife mit Konjunktion von zwei
         * Bedingungen.
         */
        System.out.println(enthaeltZeichen("Gelsenkirchen", 'e', 3));
        System.out.println(enthaeltZeichen("Gelsenkirchen", 'e', 4));

        /*
         * Beispiel für switch-Anweisung
         */
        System.out.println(gibRoemischenZiffernwert2('i'));

        /*
         * Beispiel für do-while-Schleife
         */
        System.out.println(gibBinaerdarstellung(260));

        /*
         * Beispiel für geschachtelte Schleifen
         */
        zeigeAlleTeilwoerter("ANANAS");
    }
}