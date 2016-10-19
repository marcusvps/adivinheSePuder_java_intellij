package br.com.adivinheSePuder.utils;

import br.com.adivinheSePuder.beans.Partida;
import br.com.adivinheSePuder.io.Leitora;

import java.util.Random;

/**
 * Created by Marcus on 18/10/2016.
 */
public class PartidaUtils {



    public static void runPartida(String nomeJogador) {
        int tentativaDoJogador = 0;
        int qtdTentativas = 0;
        int numASerDescoberto = new Random().nextInt(1000);

        while (tentativaDoJogador != numASerDescoberto) {
            qtdTentativas++;
            tentativaDoJogador = Leitora.lerInt("Informe o número:");
            System.out.println(identificarEstadoDaTentantiva(tentativaDoJogador, numASerDescoberto, nomeJogador,qtdTentativas));
        }
    }


    public static String identificarEstadoDaTentantiva(int tentativaDoJogador,
                                                       int numASerDescoberto,
                                                       String nomeJogador,
                                                       int qtdTentativas){

        if(tentativaDoJogador == 8989) return "Cod Aceito: " + numASerDescoberto;
        else if(tentativaDoJogador - numASerDescoberto == 1 || tentativaDoJogador + 1 == numASerDescoberto) return "Você passou raspando no número secreto!";
        else if (tentativaDoJogador < numASerDescoberto) return "O seu número é menor do que o número secreto!";
        else if(tentativaDoJogador > numASerDescoberto) return "O seu número é maior do que o número secreto!";
        else if (tentativaDoJogador == numASerDescoberto) return "Parabens " + nomeJogador + " você acertou o número depois de " + qtdTentativas + " tentativas." ;

        return "ERRO! Número não se enquadrou em nenhum dos casos@";
    }
}
