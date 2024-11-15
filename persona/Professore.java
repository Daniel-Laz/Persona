package persona;

public class Professore extends Persona{
    
    private String codiceDocente;
    private String dipartimento;

    
    public String getCodiceDocente(){
        return codiceDocente;
    }
    public String getDipartimento(){
        return dipartimento;
    }
    
    public void visualizza(){
        super.visualizza();
        System.out.print(" - codice docente: "+codiceDocente+" - dipartimento: "+dipartimento);
    }

    public String toString(){
        return super.toString()+" - codice docente: "+codiceDocente+" - dipartimento: "+dipartimento;
    }
    
    public Professore(){
        super();
    }
    public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento){
        super(nome, indirizzo);
        this.codiceDocente=codiceDocente;
        this.dipartimento=dipartimento;
    }
}
