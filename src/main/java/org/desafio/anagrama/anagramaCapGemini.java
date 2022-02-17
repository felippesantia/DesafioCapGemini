package org.desafio.anagrama;

import java.io.*;
import java.util.*;

public class anagramaCapGemini {

    public static void main(String args[]) {

        // Palavras dadas
        stringtest("ovo");
        stringtest("alegria");
        stringtest("mamae");
        stringtest("ikpmo");

    }

    // Função que verifica se duas strings são anagramas uma da outra
    public static class Anagrama {

        // substrings que são anagramas entre si
        public String sub1;
        public String sub2;

        public Anagrama(String sub1, String sub2) {
            this.sub1 = sub1;
            this.sub2 = sub2;
        }

        public String toString() {
            return sub1 + " - " + sub2;
        }
    }

    // Lista todos as substrings que são anagramas entre si
    // retorna a lista com os pares de substrings
    public static ArrayList<Anagrama> anagramaLista(String string) {

        int len = string.length();

        // computar todas a substrings possiveis
        ArrayList<String> substrings = new ArrayList<String>();
        for (int start = 0; start < len; start++) {
            for (int end = start+1; end < len+1; end++) {
                String sub = string.substring(start, end);
                substrings.add(sub);
            }
        }

        // listar os diferentes pares de substrings que são anagramas
        ArrayList<Anagrama> anagramas = new ArrayList<Anagrama>();
        for (int i = 0; i < substrings.size(); i++) {
            for (int j = i+1; j < substrings.size(); j++) {
                String sub1 = substrings.get(i);
                String sub2 = substrings.get(j);
                if (isAnagrama(sub1, sub2)) {
                    anagramas.add(new Anagrama(sub1, sub2));
                }
            }
        }
        return anagramas;
    }




    // Contador e mapeador de letras dentro das strings
    public static HashMap<Character, Integer> countLetters(String str) {
        HashMap<Character, Integer> contad = new HashMap<Character, Integer>();
        for (Character c : str.toCharArray()) {
            contad.put(c, contad.getOrDefault(c, 0) + 1);
        }
        return contad;
    }

    // Verifica se duas strings são anagramas
    public static boolean isAnagrama(String str1, String str2) {
        HashMap<Character, Integer> contad1 = countLetters(str1);
        HashMap<Character, Integer> contad2 = countLetters(str2);
        return contad1.equals(contad2);
    }

    // Função Teste
    public static void stringtest(String string) {

        var lista = anagramaLista(string);
        System.out.println(string + ": " + lista.size() + " anagramas " + lista);
    }
}
