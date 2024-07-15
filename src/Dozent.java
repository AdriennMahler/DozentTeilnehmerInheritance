public class Dozent extends JavaKurs{

    protected String name;
    protected String idNummer;
    //ein Konstruktor ohne Java Nummer Kurs für Dozenten die keine Java leiten
    public Dozent(String name, String idNummer){
        this.name=name;
        this.idNummer=idNummer;
    }
    //ein Konstruktor mit Java Nummer Kurs für Dozenten die Java leiten
    public Dozent(String name, String idNummer, int nummer){
        super(nummer);
        this.name=name;
        this.idNummer=idNummer;
    }

    public String toString(){
        return "Dozent: " + name + ". ID nummer: " + idNummer + ".";
    }
}
