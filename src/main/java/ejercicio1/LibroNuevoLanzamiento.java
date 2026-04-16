package ejercicio1;

public class LibroNuevoLanzamiento extends Libro{

    public static final int COEFICIENTE_MONTO_NUEVO_LANZAMIENTO = 3;
    public static final int MINIMO_DIAS_PUNTOS_FRECUENTES = 1;
    public static final int PUNTO = 1;

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMonto(int diasAlquilados, double monto) {
        monto += diasAlquilados * COEFICIENTE_MONTO_NUEVO_LANZAMIENTO;
        return monto;
    }

    @Override
    int puntosNuevoLanzamiento(int diasAlquilados) {

        return diasAlquilados > MINIMO_DIAS_PUNTOS_FRECUENTES ? 1 : 0;
    }
}
