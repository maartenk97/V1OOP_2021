package practica.practicum4b;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){
    }
    public void setAantalDagen(int aantalDagen){
        this.aantalDagen = aantalDagen;
    }
    public int getAantalDagen(){
        return aantalDagen;
    }
    public void setGehuurdeAuto(Auto gehuurdeAuto) {
            this.gehuurdeAuto = gehuurdeAuto;
    }
    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }
    public void setHuurder(Klant k){
        huurder = k;
    }
    public Klant getHuurder(){
        return huurder;
    }
    public double totaalPrijs(){
        double totaalPrijsZonderKorting = aantalDagen * gehuurdeAuto.getPrijsPerDag();
        double kortingBerekenen;
        double totaalPrijsMetKorting;
        if (huurder == null){
            totaalPrijsMetKorting = totaalPrijsZonderKorting;
        }
        else {
            kortingBerekenen = totaalPrijsZonderKorting / 100 * huurder.getKorting();
            totaalPrijsMetKorting = totaalPrijsZonderKorting - kortingBerekenen;
        }
        return totaalPrijsMetKorting;
    }
    public String toString(){
        String s = "";
        String geenAuto = "er is geen auto bekend";
        String geenHuurder = "er is geen huurder bekend";
        if (gehuurdeAuto == null && huurder == null) {
            s = geenAuto + System.lineSeparator() + geenHuurder + System.lineSeparator() +
                    "aantal dagen: " + aantalDagen + " en dat kost " + 0.0;

        }
        else if (gehuurdeAuto == null) {
            s = geenAuto + System.lineSeparator() + getHuurder() + System.lineSeparator() +
                    "aantal dagen: " + aantalDagen + " en dat kost " + 0.0;

        }
        else if (huurder == null){
            s = getGehuurdeAuto() + System.lineSeparator() + geenHuurder + System.lineSeparator() +
                    "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
            ;

        }

        else {
            s = gehuurdeAuto + System.lineSeparator() +
                    huurder + System.lineSeparator() + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        }
        return s;

    }


}
