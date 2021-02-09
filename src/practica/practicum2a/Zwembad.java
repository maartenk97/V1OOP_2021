package practica.practicum2a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    private double inhoud;

    public Zwembad(double breedte, double lengte, double diepte){
        this.breedte = breedte;
        this.breedte = lengte;
        this.breedte = diepte;
    }
    public double getBreedte(){
        return breedte;
    }
    public double getLengte(){
        return lengte;
    }
    public double getDiepte(){
        return diepte;
    }
    public void setBreedte(double breedte){
        this.breedte = breedte;
    }
    public void setLengte(double lengte){
        this.lengte = lengte;
    }
    public void setDiepte(double diepte){
        this.diepte = diepte;
    }
    public void inhoud(){
        inhoud = breedte * lengte * diepte;
    }
    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " +
                lengte + " meter lang, en " + diepte + " meter diep";
    }
}
