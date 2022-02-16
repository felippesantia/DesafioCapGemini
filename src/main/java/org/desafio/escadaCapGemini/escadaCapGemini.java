package org.desafio.escadaCapGemini;

public class escadaCapGemini {

    public static void main(String[] args) {
        escada(6);

    }

    public final static void escada(int n){

        int tamanho = n;


        for (int altura = 1; altura <= tamanho; altura++) {
            for (int degrau = 1; degrau <= tamanho; degrau++) {
                if(tamanho-altura >= degrau)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println("");
        }
    }

}