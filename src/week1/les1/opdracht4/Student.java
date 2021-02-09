package week1.les1.opdracht4;

public class Student {
    private String naam;

    public Student(String naam)
    {
        this.naam = naam;

    }
    public String getNaam() {
        return naam;
    }
    public String toString() {
        String s = "Deze student heet" + " " + naam;
        return s;
    }
}
