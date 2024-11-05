package persona;

public class TestPersona{
    public static void main(String[] args){
        Studente s = new Studente("giacomino", "bg", 543136, 2007);
        Professore p = new Professore("merrino", "me", "f4c7or10", "informatica(?)");
        Persona per = new Persona("marco", "bg");
        s.visualizza();
        p.visualizza();
        per.visualizza();
        s.setAnno(2006);
        System.out.print("\nmodifica");
        s.visualizza();
    }
}