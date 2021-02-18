package week2.les4.collegeopdracht;

public class Main {
    public static void main(String[] arg) {
        // maak 2 objecten aan van klasse Klant:
        Klant k1 = new Klant("Maarten Kenemans", "Fruinplantsoen 16", "Utrecht");
        Klant k2 = new Klant("Julian Heiligers", "Tulpstraat 4", "Utrecht");

        // we maken nu voor elk Klant-object een Rekening-object aan:
        Rekening r1 = new Rekening(123456678);
        Rekening r2 = new Rekening(987654321);

        // en maken vervolgens de koppeling:
        k1.setMijnRekening(r1);
        k2.setMijnRekening(r2);


        // storten kan nu alleen via de rekeninghouder
        k1.getMijnRekening().stort(1000);
        k2.getMijnRekening().stort(2000);

        System.out.println(k1);
        System.out.println(k1.getMijnRekening());
        System.out.println(k2);
        System.out.println(k1.getMijnRekening());

    }


}
