package ejercicio5;

public class Drama extends Actuacion{
    public Drama(String nombreEvento, int numeroEspectadores) {
        super(nombreEvento, numeroEspectadores);
    }

    @Override
    public float calcularMonto() {
        float monto = 40000;
        if (this.numeroEspectadores() > 30) {
            monto += 1000 * (numeroEspectadores() - 30);
        }
        return monto;
    }

    @Override
    public float calcularCreditos() {
        float creditos = Math.max(this.numeroEspectadores() - 30, 0);
        return creditos;
    }
}
