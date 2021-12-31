package Vorlesungen.Klassen_und_Objekte;


/**
 * Diese Klasse dient dazu, Konstruktoren und Methoden der Klasse Rechteck zu
 * testen und deren Funktionsweise zu veranschaulichen.
 */
public class RechteckTest
{

    /**
     * Veranschaulicht die Funktionsweise der Konstruktoren der Klasse Rechteck.
     */
    public static void testeKonstruktoren()
    {

        /*
         * Variable des Typs Rechteck deklarieren. Die Variable kann durch
         * Zuweisungen mit Objekten der Klasse Rechteck belegt werden.
         */
        Rechteck r;

        /*
         * Der Variablen r ein Rechteck-Objekt zuweisen.
         */
        r = new Rechteck(2.5, 1.5);

        /*
         * Dasselbe mit dem anderen Konstruktor. Der alte Inhalt der Variablen r
         * wird überschrieben.
         */
        r = new Rechteck(1.5, 2, 3, 4);

        /*
         * Der Aufruf eines Konstruktors ist ein Ausdruck. Dieser Ausdruck kann
         * innerhalb anderer Ausdrücke verwendet werden, hier z.B. innerhalb des
         * Aufrufs der println-Methode verwendet. Wenn Sie diesen Code
         * ausführen, sehen Sie, dass die Ausgabe "komisch" aussieht. Wir werden
         * in OPR den Grund dafür kennenlernen.
         */
        System.out.println(new Rechteck(1, 2, 3, 4));

        /*
         * Versuch, einen Konstruktor mit zu wenigen Parametern aufzurufen.
         */
        // r = new Rechteck(1);
    }

    /**
     * Veranschaulicht Zugriffe auf Instanzmethoden der Klasse Rechteck.
     */
    public static void testeInstanzmethoden()
    {

        /*
         * Rechteck erzeugen und einer Variablen zuweisen.
         */
        Rechteck r = new Rechteck(1, 2, 3, 4);

        /*
         * Instanzmethode zur Berechnung der Fläche aufrufen.
         */
        System.out.println(r.gibFlaeche());

        /*
         * Hat die Instanzmethode einen anderen Ergebnistyp als void, handelt es
         * sich bei dem Aufruf um einen Ausdruck, der insbesondere innerhalb
         * anderer Ausdrücke verwendet werden kann.
         */
        System.out.println(2 * r.gibFlaeche() + 3);

        /*
         * Der Objektausdruck vor dem Punkt muss keine Variable sein. Es ist
         * jeder Ausdruck erlaubt, der ein entsprechendes Objekt als Wert
         * liefert. Aber: Typen müssen beachtet werden! Hat der Objektausdruck
         * den Typ T (wobei T eine Klasse ist), dann sind nur Instanzmethoden
         * rechts vom Punkt (.) zulässig, die in der Klasse T bekannt sind. Dies
         * heißt zunächst, die Instanzmethoden müssen in der Klasse T definiert
         * sein.
         */
        System.out.println(2 * (new Rechteck(1, 2, 3, 4)).gibFlaeche() + 3);

        /*
         * Aufruf der Methode um festzustellen, ob Rechteck einen Punkt enthält.
         */
        System.out.println(r.enthaeltPunkt(new Punkt(1.5, 3.5)));

        /*
         * Aufruf der Methode zum Verschieben eines Rechtecks. Beachte: bei
         * diesem Aufruf handelt es sich nicht um einen Ausdruck, da die
         * Instanzmethode keinen Ergebnistyp besitzt.
         */
        System.out.println(r.gibAlsString());
        r.verschiebe(2, 5);
        System.out.println(r.gibAlsString());

        /*
         * Zweites Rechteck erzeugen. Instanzmethode aufrufen, um daraus und dem
         * Rechteck in der Variablen r die Rechteckhülle zu erzeugen.
         */
        Rechteck r2 = new Rechteck(3.5, 4.5, 4.5, 9.5);
        Rechteck huelle = r.erzeugeHuelle(r2);
        System.out.println(huelle.gibAlsString());
    }

    /**
     * Veranschaulicht die Identität von Objekten.
     */
    public static void testeIdentitaet()
    {

        /*
         * Zwei Rechtecke erzeugen und verschiedenen Variablen zuweisen.
         */
        Rechteck r1 = new Rechteck(1, 2, 3, 4);
        Rechteck r2 = new Rechteck(1, 2, 3, 4);

        /*
         * Testausgabe, um Identität der Werte beider Variablen festzustellen.
         */
        System.out.println(r1 == r2);

        /*
         * Wert der Variablen r1 der Variablen r2 zuweisen.
         *
         * Zur Sprachregelung: ein Wert meint immer das Ergebnis der Auswertung
         * eines Ausdrucks. Es muss sich nicht um nummerische Werte handeln.
         */
        r2 = r1;

        /*
         * Testausgabe, um Identität der Werte beider Variablen festzustellen.
         */
        System.out.println(r1 == r2);
    }

    /**
     * Führt die Testmethoden aus und stellt die Testergebnisse auf dem
     * Bildschirm dar.
     *
     * @param args wird nicht verwendet
     */
    public static void main(String[] args)
    {

        testeKonstruktoren();
        testeInstanzmethoden();
        testeIdentitaet();
    }
}

