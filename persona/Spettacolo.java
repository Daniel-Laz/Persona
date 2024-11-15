package persona;

public class Spettacolo {
    private String titolo;
    private String compagnia;
    private String dataOra;
    private float costo;
    private Persona[] posti = new Persona[100];
    private int nPersone;

    public Spettacolo(String titolo, String compagnia, String dataOra, float costo){
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

    public float costoBiglietto(Persona p){
        if (p instanceof Studente || p instanceof Professore){
            return (float) (costo*0.90);
        }else{ return costo; }
    }
}
