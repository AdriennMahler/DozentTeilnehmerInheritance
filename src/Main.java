public class Main {
    public static void main(String[] args) {
        Teilnehmer jana = new Teilnehmer("Jana", "123456");
        System.out.println(jana);
        Dozent paul = new Dozent("Paul", "987654");
        System.out.println(paul);
        Dozent paulina = new Dozent("Paulina", "987654", true,  111111);
        System.out.println(paulina);
        paulina.javaKurs();
        Teilnehmer mary = new Teilnehmer("Mary", "267439", false, 234571);
        System.out.println(mary);
        Teilnehmer andreas = new Teilnehmer("Andreas","982537", true, 20999653);
        System.out.println(andreas);
    }
}
