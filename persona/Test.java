package persona;

public class Test {
    public static void main(String[] args){
        Spettacolo biancaNeve = new Spettacolo("bianca neve","iTeatranti","12 dicembre 2024 - 20:15",7.5);
        Persona p = new Persona("mauro","bergamo");
        Studente s = new Studente("alessio","bracca",43259,2009);
        Professore pr = new Professore("rosa","zogno","daw4b343f","matematica");
        if(biancaNeve.prenota(p)){
            System.out.println("prenotazione avvenuta con successo");
        }else{System.out.println("teatro pieno");}
        if(biancaNeve.prenota(s)){
            System.out.println("prenotazione avvenuta con successo");
        }else{System.out.println("teatro pieno");}
        if(biancaNeve.prenota(pr)){
            System.out.println("prenotazione avvenuta con successo");
        }else{System.out.println("teatro pieno");}
        System.out.println(biancaNeve.toString());
        System.out.println(biancaNeve.elenco());
        System.out.println(biancaNeve.getPostiDisponibili());

    }
}
