package practica.practicum3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPosistie;
    private Cirkel c;

    public Cirkel(int radius, int xPositie, int yPosistie){
        this.xPositie = xPositie;
        this.yPosistie = yPosistie;
        this.radius = radius;
        if (this.radius <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
            };
        }


    public String toString(){
       return "cirkel " + "(" + xPositie + "," + yPosistie + ") " + "met radius: " + radius;
    }
}
