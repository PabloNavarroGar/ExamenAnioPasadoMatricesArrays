package HerenciaYConversin_Impli_Expli;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Moneda extends Azar {

    public Moneda() {
        super(2);
    }

    // DEVUELVE UN RANDOM DEL 1 y 2
    @Override
    public int lanzar() {
        return new Random().nextInt(1,this.getPosibilidades() + 1);
    }

}
