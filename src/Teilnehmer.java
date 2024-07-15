public class Teilnehmer extends Person {

    Teilnehmer(String name, String idNummer) {
        super(name, idNummer);
    }

    Teilnehmer(String name, String idNummer, boolean javaKurs, int javaKursnummer) {
        super(name, idNummer, javaKurs, javaKursnummer);
    }


    public String toString() {
        if (javaKurs) {
            return "Teinehmer: " + name + ". ID nummer: " + idNummer + ". Er/Sie auf Java-kurs: " + javaKursNummer + " teilnimmt";
        } else {
            return "Teinehmer: " + name + ". ID nummer: " + idNummer;
        }
    }
}