package br.com.adivinheSePuder.main;

import br.com.adivinheSePuder.beans.Partida;
import br.com.adivinheSePuder.io.Leitora;
import br.com.adivinheSePuder.utils.PartidaUtils;

/**
 * Created by Marcus on 18/10/2016.
 */


public class Main {

    public static void main(String[] args) {

        PartidaUtils.runPartida(Leitora.lerString("Por favor, informe o seu nome:", "ERRO! NOME EM BRANCO!"));
    }


}