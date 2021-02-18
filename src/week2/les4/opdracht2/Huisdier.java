package week2.les4.opdracht2;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;

    public Huisdier(String naam, String ras){
        this.naam = naam;
        this.ras = ras;
        this.gewicht = 0.0;

    }
    public String getNaam(){
        return naam;
    }
    public String getRas(){
        return ras;
    }
    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg.";

    }

}
