package ejercicio5;

public abstract class Actuacion {

    private String nombreEvento;
    private int numberoEspectadores;

    protected Actuacion(String nombreEvento, int numberoEspectadores) {
        this.nombreEvento = nombreEvento;
        this.numberoEspectadores = numberoEspectadores;
    }
    public abstract float calcularMonto();
    public abstract float calcularCreditos();

    public String nombreEvento(){
        return this.nombreEvento;
    }
    public int numeroEspectadores(){
        return this.numberoEspectadores;
    }
}