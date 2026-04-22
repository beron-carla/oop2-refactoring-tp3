package ejercicio5;

public class Comedia extends Actuacion{
    public Comedia(String nombreEvento, int numeroEspectadores) {
        super(nombreEvento, numeroEspectadores);
    }

    @Override
    public float calcularMonto() {
        float monto = 30000;
        if (this.numeroEspectadores() > 20) {
            monto += 10000 + 500 * (this.numeroEspectadores() - 20);
        }
        monto += 300 * this.numeroEspectadores();
        return monto;
    }

    @Override
    public float calcularCreditos() {
        float creditos = Math.max(this.numeroEspectadores() - 30, 0);
        // creditos extras para comedia
        creditos += Math.floor(this.numeroEspectadores() / 5);
        return creditos;
        }
}
