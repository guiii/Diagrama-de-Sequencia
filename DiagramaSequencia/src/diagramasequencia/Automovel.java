/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package diagramasequencia;

/**
 *
 * @author guilhermepontes
 */
public class Automovel {

    public double distancia;
    public double volume;
    public double desempenho;
    public Combustivel comb;

    public Automovel(){

    }

    public Automovel entrarDistancia(double d){
        this.distancia = d;
        return this;
    }

    public Automovel entrarVolume(double v){
        this.volume = v;
        return this;
    }

    public Automovel setCombustivel(Combustivel c){
        this.comb = c;
        return this;
    }

    public Automovel calDesempenho(){
        System.out.println(comb.preco + "/(" + this.distancia + "/"  + volume + ") = " + comb.preco / (this.distancia / volume));
        return this;
    }

}
