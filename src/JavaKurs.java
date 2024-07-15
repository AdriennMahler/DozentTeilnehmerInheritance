public class JavaKurs {
    protected int nummer;

    //leere Konstruktor für Teilnehmer/Dozent Konstruktor ohne Java Kurs Nummer
    JavaKurs(){}

    JavaKurs(int nummer){
        this.nummer=nummer;
    }
    //instance Method für Teilnehmer/Dozent Java Kurs
    public void isJavaKurs(){
    System.out.println("Java-Kurs nummer : " + nummer);
    }

    public String toString(){
        return "Java-Kurs nummer : " + nummer;
    }
}
