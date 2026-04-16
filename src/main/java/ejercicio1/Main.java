package ejercicio1;

public class Main {
    public static void main(String args[]) {
        LibroRegular elTunel = new LibroRegular("El Túnel");
        LibroRegular antesDelFin = new LibroRegular("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente cliente = new Cliente("Javier");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
    }
}