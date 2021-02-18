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
        if (gehuurdeAuto == null) {
            System.out.println("er is geen auto bekend");
        } else {
            this.gehuurdeAuto = gehuurdeAuto;
        }
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
        return (aantalDagen * gehuurdeAuto.getPrijsPerDag()) - huurder.getKorting();
    }
    public String toString(){
        return gehuurdeAuto + System.lineSeparator() +
                huurder + System.lineSeparator() +
                "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }


}
