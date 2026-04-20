package ejercicio4;
public record Persona(String nombre, String apellido) {
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
