package br.com.adivinheSePuder.beans;

import java.util.List;

/**
 * Created by Marcus on 18/10/2016.
 */
public class Jogo {

    private List<Partida> partidas;
    private int qtdDePartidasGanhas = 0;

    public List<Partida> getPartidas() {
        return partidas;
    }

    //-------------------------------------
    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    public int getQtdDePartidasGanhas() {
        return qtdDePartidasGanhas;
    }

    public void setQtdDePartidasGanhas(int qtdDePartidasGanhas) {
        this.qtdDePartidasGanhas = qtdDePartidasGanhas;
    }

    public Jogo(List<Partida> partidas) {
        this.partidas = partidas;
    }
}
