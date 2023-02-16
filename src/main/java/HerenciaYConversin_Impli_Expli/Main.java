package HerenciaYConversin_Impli_Expli;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvaro
 */
public class Main {

    public static void main(String[] args) {

        // CON LISTA
        List<Azar> lista = new ArrayList<>();

        // CONVERSION IMPLICITA
        lista.add(new Moneda());
        lista.add(new Dado());

        // CONVERSION EXPLICITA CON FOR EACH PQ LA LISTA ES DE AZAR Y NO PUEDE ACCEDER A LOS METODOS DE DADO
        for (Azar a : lista) {

            // METODO DE AZAR
            System.out.println("Lanzamiento: " + a.lanzar());

            // METODO ESPECIFICO DE DADO
            if (a instanceof Dado) {      // SI a ES UN DADO
                ((Dado) a).metododDado(); // AL PONER a. TE HACE EL CASTING SOLO
            }

        }
    }
}
