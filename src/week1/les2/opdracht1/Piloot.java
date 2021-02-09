package week1.les2.opdracht1;

public class Piloot {
    private String naam;
    private int vlieguren;
    private double salaris;

    public Piloot(String naam){
        this.naam = naam;
    }

    public void setSalaris(double salaris){
        this.salaris = salaris;
    }

    public void verhoogVliegurenMet(int verhoogVlieguren){
        vlieguren += verhoogVlieguren ;
    }

    public double getVlieguren(){
        return vlieguren;
    }
    public double getSalaris(){
        return salaris;
    }
    public String toString(){
        return "Zonder vlieguren: " + naam + " heeft" + " " + vlieguren +  " gemaakt en verdient " + salaris +
                System.lineSeparator() + "Eerste piloot: " + naam + " heeft " + vlieguren + " gemaakt en verdient " + salaris +
                        System.lineSeparator() + System.lineSeparator() + "Vlieguren van tweede piloot: " + vlieguren + System.lineSeparator() +
                        "Salaris van tweede piloot: " + salaris + System.lineSeparator() +
                        "Tweede piloot: " + naam + " heeft " + vlieguren + " gemaakt en verdient " + salaris;
    }

}
