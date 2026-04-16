package ejercicio1;

public abstract class Libro {

    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    abstract double calcularMonto(int diasAlquilados, double monto);

    abstract int puntosNuevoLanzamiento(int diasAlquilados);
}

