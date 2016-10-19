package br.com.adivinheSePuder.beans;

/**
 * Created by Marcus on 18/10/2016.
 */
public class Partida {

    static final int QTD_INICIAL_DE_DICAS = 3;

    private int codigo = 0001 ;
    private int numASerDescoberto = 0;
    private int qtdDeErros = 0;


    //--------------------------

    public Partida(int codigo, int numASerDescoberto) {
        this.codigo = codigo;
        this.numASerDescoberto = numASerDescoberto;
    }

    //--------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumASerDescoberto() {
        return numASerDescoberto;
    }

    public void setNumASerDescoberto(int numASerDescoberto) {
        this.numASerDescoberto = numASerDescoberto;
    }

    public int getQtdDeErros() {
        return qtdDeErros;
    }

    public void setQtdDeErros(int qtdDeErros) {
        this.qtdDeErros = qtdDeErros;
    }
}
