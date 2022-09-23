package Übungen.Klassen_und_Objekte;

public class RationaleZahl
{

    private long zahl;
    private long zaehler;
    private long nenner;

    public RationaleZahl(long zahl)
{
        this.zaehler = zahl;
        this.nenner = 1;
    }

    public RationaleZahl(long zaehler, long nenner)
{
        this.zaehler = zaehler;
        this.nenner = nenner;
        this.kuerzen();
    }

    public RationaleZahl addiere(RationaleZahl zahl){
        return new RationaleZahl(this.zaehler*zahl.nenner + zahl.zaehler*this.nenner, this.nenner*zahl.nenner);
    }

    public String gibAlsText(){
        return this.nenner == 1
                ? this.zaehler+" "
                : (this.zaehler+"/"+this.nenner);
    }

    public void kuerzen()
{

        long ggT = this.ggT(this.zaehler, this.nenner);
        this.zaehler = this.zaehler/ggT;
        this.nenner = this.nenner/ggT;
    }

    public long ggT(long zaehler, long nenner)
{
            return nenner == 0
                ? zaehler
                : ggT(nenner,zaehler % nenner);
    }
}


