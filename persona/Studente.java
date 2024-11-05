package persona;

public class Studente extends Persona{
    private int matricola;
    private int anno;
    private static int ultimaMatricola = 0; //presuppongo sia static

    public int getMatricola(){
        return matricola;
    }
    public int getAnno(){
        return anno;
    }

    public void setAnno(int anno){
        this.anno=anno;
    }

    public void visualizza(){
        super.visualizza();
        System.out.print(" - matricola: "+matricola+" - anno: "+anno);
    }

    public Studente(){
        super();
    }

    public Studente(String nome,String indirizzo,int matricola,int anno){
        super(nome, indirizzo);
        this.matricola=matricola;
        this.anno=anno;
    }
}
