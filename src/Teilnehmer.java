public class Teilnehmer extends Dozent{
    //Teilnehmer extends Dozent - das nicht doppel Code benutzt wird
    Teilnehmer(String name, String idNummer){
        super(name, idNummer);
    }
    Teilnehmer(String name, String idNummer, int nummer){
        super(name, idNummer, nummer);
    }

    public String toString(){
        return "Teinehmer: " + name + ". ID nummer: " + idNummer +".";
    }
}
