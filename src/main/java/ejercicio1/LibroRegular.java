package ejercicio1;

public class LibroRegular extends Libro {

    public static final int MONTO_BASE_LIBRO_REGULAR = 2;
    public static final int DIAS_MINIMO_REGULARES = 2;
    public static final double COEFICIENTE_MONTO_REGULARES = 1.5;

    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMonto(int diasAlquilados, double monto) {
        monto += MONTO_BASE_LIBRO_REGULAR;
        if (diasAlquilados > DIAS_MINIMO_REGULARES) {
            monto += (diasAlquilados - DIAS_MINIMO_REGULARES) * COEFICIENTE_MONTO_REGULARES;
        }
        return monto;
    }

    @Override
    int puntosNuevoLanzamiento(int diasAlquilados) {
        return 0;
    }
}
