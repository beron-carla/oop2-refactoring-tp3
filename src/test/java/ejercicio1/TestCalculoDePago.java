package ejercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculoDePago {
    @Test
    public void testeaCalculoDePagoLibroRegular(){
        Libro elTunel = new LibroRegular("El Túnel");
        Libro antesDelFin = new LibroRegular("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente cliente = new Cliente("Carla");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        assertEquals(10.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }

}
