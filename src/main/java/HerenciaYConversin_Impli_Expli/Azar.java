package HerenciaYConversin_Impli_Expli;

/**
 *
 * @author alvaro
 */
public abstract class Azar {

    // ATRIB
    protected int posibilidades;    // CARAS DE LA MONEDA Y EL DADO

    // CONSTR
    public Azar(int posibilidades) {
        this.posibilidades = Math.abs(posibilidades);
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public abstract int lanzar();
}
