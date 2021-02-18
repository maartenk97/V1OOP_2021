package week2.les4.collegeopdracht;

public class Rekening {
    private int nummer;
    private double saldo = 0.0;
    private Klant rekeninghouder;			// associatie naar Klant

    public Rekening(int nr) {
        nummer = nr;
    }

    public void setRekeninghouder(Klant k) {
        rekeninghouder = k;
    }

    public Klant getRekeninghouder() {
        return rekeninghouder;
    }

    public double getSaldo() { return saldo; }
    public int getNummer()   { return nummer; }

    public void stort(double bedrag) {
        saldo = saldo + bedrag;
    }

    public void neemOp(double bedrag) {
        saldo = saldo - bedrag;
    }

    public String toString() {
        return "Op rekening " + nummer + " staat " + saldo;
    }

}
