package week1.les2.werkcollege;

public class Product {
    private String productNaam;
    private String productCode;
    private double productPrijs;
    private double productBTW;

    public Product(String productNaam, String productCode, double productPrijs){
        this.productNaam = productNaam;
        this.productCode = productCode;
        this.productPrijs = productPrijs;

    }
    public void setBTW(double BTW){
        productBTW = BTW;
    }

    public void verhoogPrijsMet(double verhoogPrijsMet){
        productPrijs += verhoogPrijsMet;
    }
    public void setPrijs(double nwProductPrijs){
        productPrijs = nwProductPrijs;
    }
    public double getBTW(){
        return productBTW;
    }
    public double getPrijs(){
        return productPrijs;
    }
    public double btwBedrag(){
        double BtwBedrag = (productPrijs / 100) * productBTW;
        return BtwBedrag;
    }
    public String toString(){
        return "De productnaam is:" + productNaam + "en kost:" + System.lineSeparator() + productPrijs + "de btw over dit produt bedraagt:" +
                btwBedrag();
    }
}
