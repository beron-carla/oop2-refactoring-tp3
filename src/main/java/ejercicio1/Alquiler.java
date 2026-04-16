package ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }



    public double calcularMonto(double monto) {
        return this.copia.calcularMonto(this.diasAlquilados, monto);
    }

    public int puntosNuevoLanzamiento() {
        return this.copia.puntosNuevoLanzamiento(this.diasAlquilados);
    }
}