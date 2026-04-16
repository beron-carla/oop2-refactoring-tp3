package ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public double calcularMonto(int diasAlquilados, double monto) {
        return this.libro.calcularMonto(diasAlquilados, monto);
    }

    public int puntosNuevoLanzamiento(int diasAlquilados) {
        return this.libro.puntosNuevoLanzamiento(diasAlquilados);
    }
}