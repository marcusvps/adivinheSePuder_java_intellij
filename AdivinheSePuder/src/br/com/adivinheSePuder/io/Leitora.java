package br.com.adivinheSePuder.io;

import java.util.Scanner;

/**
 * Created by Marcus on 18/10/2016.
 */
public class Leitora {

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }


    public static int lerInt(String mensagem) {
        System.out.println(mensagem);
        return lerInt();
    }


    public static String lerString() {
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String mensagem) {
        System.out.println(mensagem);
        return lerString();
    }

    public static String lerString(String mensagem, String mensagemErro) {
        String textoLido;
        do {
            textoLido = lerString(mensagem);
            if (textoLido.isEmpty()) {
                System.out.println(mensagemErro);
            }
        } while (textoLido.isEmpty());

        return textoLido;
    }
}
