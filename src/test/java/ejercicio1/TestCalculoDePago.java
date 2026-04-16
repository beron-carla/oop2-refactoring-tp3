package ejercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculoDePago {
    @Test
    public void testeaCalculoDePagoLibroRegular(){
        Libro libroRegular1 = new LibroRegular("El Túnel");
        Libro libroRegular2 = new LibroRegular("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(libroRegular1);
        CopiaLibro antesDelFinCopia = new CopiaLibro(libroRegular2);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente cliente = new Cliente("Carla");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(10.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    public void testeaCalculoDePagoLibroInfantiles(){
        Libro libroInfantil1 = new LibroInfantiles("El Túnel");
        Libro libroInfantil2 = new LibroInfantiles("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(libroInfantil1);
        CopiaLibro antesDelFinCopia = new CopiaLibro(libroInfantil2);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente cliente = new Cliente("Carla");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(6.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    public void testeaCalculoDePagoLibroNuevoLanzamiento(){
        Libro libroNuevoLanzamiento1 = new LibroNuevoLanzamiento("El Túnel");
        Libro libroNuevoLanzamiento2 = new LibroNuevoLanzamiento("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(libroNuevoLanzamiento1);
        CopiaLibro antesDelFinCopia = new CopiaLibro(libroNuevoLanzamiento2);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente cliente = new Cliente("Carla");
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(24.0, resultado[0]);
        assertEquals(4, resultado[1]);
    }
}
