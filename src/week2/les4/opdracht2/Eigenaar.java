package week2.les4.opdracht2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String naam){
        this.naam = naam;
    }
    public void setGiroNr(int giroNr){
        this.giroNr = giroNr;
    }

    public int getGiroNr(){
        return giroNr;
    }
    public void setBeestje(Huisdier e){
        beestje = e;
    }

    public Huisdier getBeestje(){
        return beestje;
    }
    public String toString(){
        String s = naam + " heeft giro " + giroNr + "." + " En is het baasje van " + beestje;
        return s;

    }
}
