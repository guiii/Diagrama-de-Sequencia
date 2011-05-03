package diagramasequencia;

/**
 *
 * @author guilhermepontes
 */
public class Combustivel {
    public double preco;

    public Combustivel(){

    }

    public Combustivel entrarPreco(double p){
        this.preco = p;
        return this;
    }
}
