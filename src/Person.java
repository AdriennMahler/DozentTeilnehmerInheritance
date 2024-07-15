public class Person {
     String name;
     String idNummer;
     boolean javaKurs;
     int javaKursNummer;

     public Person(String name, String idNummer){
         this.name=name;
         this.idNummer=idNummer;
     }
    public Person(String name, String idNummer, boolean javaKurs, int javaKursNummer){
        this.name=name;
        this.idNummer=idNummer;
        this.javaKurs=javaKurs;
        this.javaKursNummer=javaKursNummer;
    }
    public String toString(){
        return "Name: " + name + ". ID nummer: " + idNummer +".";
    }

    public void javaKurs(){
     System.out.println("Java-Kurs Nummer: " + javaKursNummer);
    }
}
