package week2.les3.opdracht2;

public class TariefFabriek {
    public static void main(String[] arg) {
        try {
        BelastingTarieven b = new BelastingTarieven();
        b.produceerBelastingTarieven();
        System.out.println("Het werkt"); }
        catch (ArithmeticException ae) {
            System.out.println("Fout opgetreden: " + ae.getMessage());
        }
        }
}
