public class Dozent extends Person{

    Dozent(String name, String idNummer){
        super(name, idNummer);
    }

    public Dozent(String name, String idNummer, boolean javaKurs, int javaKursnummer){
        super(name, idNummer, javaKurs, javaKursnummer);
    }

   public String toString(){
        if (javaKurs){
        return "Dozent: " + name + ". ID nummer: " + idNummer + ". Leitet Java-Kurs: " + javaKursNummer;
        }else{
        return "Dozent: " + name + ". ID nummer: " + idNummer;
        }

    }

}
