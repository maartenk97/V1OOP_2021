package week1.les1.opdracht5;

public class Student {
    private String naam;
    private int studentNummer;

    public Student(String naam, int studentNummer)
    {
        this.naam = naam;
        this.studentNummer = studentNummer;

    }

    public String getNaam() {
        return naam;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int nwStudentNummer)
    {
        studentNummer = nwStudentNummer;
    }

    public String toString() {
        String s = "Deze student heet" + " " + naam + "en heeft nummer:" + " " + studentNummer;
        return s;
    }
}
