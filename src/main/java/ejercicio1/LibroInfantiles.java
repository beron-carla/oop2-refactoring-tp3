package ejercicio1;

public class LibroInfantiles extends Libro{

    public static final double MONTO_BASE_INFANTILES = 1.5;
    public static final int MINIMO_DIAS_INFANTILES = 3;
    public static final double COEFICIENTE_MONTO_INFANTILES = 1.5;

    public LibroInfantiles(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMonto(int diasAlquilados, double monto) {
        monto += MONTO_BASE_INFANTILES;
        if (diasAlquilados > MINIMO_DIAS_INFANTILES)
            monto += (diasAlquilados - MINIMO_DIAS_INFANTILES) * COEFICIENTE_MONTO_INFANTILES;
        return monto;
    }

    @Override
    int puntosNuevoLanzamiento(int diasAlquilados) {
        return 0;
    }
}
