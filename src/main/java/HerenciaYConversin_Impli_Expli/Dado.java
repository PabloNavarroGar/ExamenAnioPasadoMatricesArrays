package HerenciaYConversin_Impli_Expli;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Dado extends Azar {

    public Dado() {
        super(6);
    }

    public Dado(int posibilidades) {
        super(posibilidades);
    }

    // METODO UNICO DE DADO
    public void metododDado(){
        System.out.println("Dado");
    }
    
    // DEVUELVE UN RANDOM DEL 1 AL 6
    @Override
    public int lanzar() {
        return new Random().nextInt(1, this.getPosibilidades() + 1);
    }

}
