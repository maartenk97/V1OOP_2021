package week1.les2.werkcollege;

public class Main {
    public static void main(String[] arg){
        Product pr1 = new Product("iPad", "1234AB", 614.00);
        pr1.setBTW(19.0);
        System.out.println(pr1.getBTW());
        System.out.println(pr1.getPrijs());
        System.out.println(pr1.btwBedrag());
        System.out.println(pr1);
    }
}
