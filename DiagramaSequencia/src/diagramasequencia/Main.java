

package diagramasequencia;

/**
 *
 * @author guilhermepontes
 * @version 0.1
 */
public class Main {

   
    public static void main(String[] args) {
        Automovel golf = new Automovel();
        golf.entrarDistancia(200).entrarVolume(20);

        Combustivel comb = new Combustivel();
        comb.entrarPreco(2.67);
        golf.setCombustivel(comb).calDesempenho();

    }

}
