package ejercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculoDePago {
    @Test
    public void testeaCalculoDePagoLibroRegular(){
        Libro libroRegular1 = new LibroRegular("Regular 1");
        Libro libroRegular2 = new LibroRegular("Regular 2");
        CopiaLibro libroRegular1Copia = new CopiaLibro(libroRegular1);
        CopiaLibro libroRegular2Copia = new CopiaLibro(libroRegular2);
        Alquiler alquilerLibroRegular1 = new Alquiler(libroRegular1Copia, 5);
        Alquiler alquilerLibroRegular2 = new Alquiler(libroRegular2Copia, 3);
        Cliente cliente = new Cliente("Carla");
        cliente.alquilar(alquilerLibroRegular1);
        cliente.alquilar(alquilerLibroRegular2);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(10.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    public void testeaCalculoDePagoLibroInfantiles(){
        Libro libroInfantil1 = new LibroInfantiles("Infantil 1");
        Libro libroInfantil2 = new LibroInfantiles("Infantil 2");
        CopiaLibro libroInfantil1Copia = new CopiaLibro(libroInfantil1);
        CopiaLibro libroInfantil2Copia = new CopiaLibro(libroInfantil2);
        Alquiler alquilerLibroInfantil1 = new Alquiler(libroInfantil1Copia, 5);
        Alquiler alquilerLibroInfantil2 = new Alquiler(libroInfantil2Copia, 3);
        Cliente cliente = new Cliente("Carla");
        cliente.alquilar(alquilerLibroInfantil1);
        cliente.alquilar(alquilerLibroInfantil2);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(6.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    public void testeaCalculoDePagoLibroNuevoLanzamiento(){
        Libro libroNuevoLanzamiento1 = new LibroNuevoLanzamiento("Nuevo lanzamiento 1");
        Libro libroNuevoLanzamiento2 = new LibroNuevoLanzamiento("Nuevo lanzamiento 2");
        CopiaLibro nuevoLanzamiento1Copia = new CopiaLibro(libroNuevoLanzamiento1);
        CopiaLibro nuevoLanzamiento2Copia = new CopiaLibro(libroNuevoLanzamiento2);
        Alquiler alquilerNuevoLanzamiento1 = new Alquiler(nuevoLanzamiento1Copia, 5);
        Alquiler alquilerNuevoLanzamiento2 = new Alquiler(nuevoLanzamiento2Copia, 3);
        Cliente cliente = new Cliente("Carla");
        cliente.alquilar(alquilerNuevoLanzamiento1);
        cliente.alquilar(alquilerNuevoLanzamiento2);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(24.0, resultado[0]);
        assertEquals(4, resultado[1]);
    }
}
