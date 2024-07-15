public class Main {
    public static void main(String[] args) {
        Teilnehmer jana = new Teilnehmer("Jana", "123456");
        System.out.println(jana);
        Dozent paul = new Dozent("Paul", "987654");
        System.out.println(paul);
        //Teilnehmer/Dozent kann man mit Java-kurs Nummer aufrufen - wenn sie/er teilnimmt,
        // leitet wird println aus Parent Class - JavaKurs aufgerufen mit Method isJavaKurs
        //und wird die Kurs Nummer dort gezeigt
        Dozent paulina = new Dozent("Paulina", "987654", 111111);
        System.out.println(paulina);
        paulina.isJavaKurs();
    }
}
