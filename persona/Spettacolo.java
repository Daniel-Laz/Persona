package persona;

public class Spettacolo {
    private String titolo;
    private String compagnia;
    private String dataOra;
    private double costo;
    private Persona[] posti = new Persona[100];
    private int nPersone;

    public String toString(){
        return "'"+titolo+"' - "+compagnia+" - "+dataOra;
    }

    public Spettacolo(String titolo, String compagnia, String dataOra, double costo){
        this.titolo = titolo;
        this.compagnia = compagnia;
        this.dataOra = dataOra;
        this.costo = costo;
    }

    public boolean prenota (Persona p){
        if (nPersone< posti.length){
            posti[nPersone]=p;
            nPersone++;
            return true;
        }
        return false;
    }

    public String elenco(){
        String out="";
        for (int i = 0; i<nPersone;i++){
            out += posti[i].toString()+"\n";
        }
        return out;
    }

    public int getPostiDisponibili(){
        return posti.length-nPersone;
    }

    public double costoBiglietto(Persona p){
        if (p instanceof Studente || p instanceof Professore){
            return costo*0.90;
        }else{ return costo; }
    }
}
