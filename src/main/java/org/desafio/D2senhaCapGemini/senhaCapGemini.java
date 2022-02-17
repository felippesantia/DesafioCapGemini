package org.desafio.senhaCapGemini;

import java.io.*;
import java.util.*;


public class senhaCapGemini {

    public static void senhaForte(String input) {
        // Verificar a presença dos caracteres obrigatórios
        int n = input.length();


        boolean minusculos = false,
                maiusculos = false,
                digitos = false,
                caracterSpec = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i))
                minusculos = true;
            if (Character.isUpperCase(i))
                maiusculos = true;
            if (Character.isDigit(i))
                digitos = true;
            if (set.contains(i))
                caracterSpec = true;
        }

        // Força da Senha
        System.out.print("\n Crie sua senha baseada nos seguintes critérios:\n" +
                "Mínimo 6 caracteres.\n" +
                "Mínimo 1 digito.\n" +
                "Mínimo 1 letra em minúsculo.\n" +
                "Mínimo 1 letra em maiúsculo.\n" +
                "Mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+- \n");
        if (minusculos && maiusculos && digitos && caracterSpec
                && (n >= 6))
            System.out.print("Senha forte e possui todos os caracteres obrigatórios");
        else
            System.out.print(" Senha fraca, favor digitar novamente");
    }

    // Chamada Main
    public static void main(String[] args) {

        String senha = "Ya3";
        if (senha.length() < 6) {
            // Número de caracteres que faltam para a senha possuir 6
            int caracteresFaltando = 6 - senha.length();

            System.out.print("Sua senha é " + senha);

            System.out.println("\n Senha fraca, faltam " + caracteresFaltando + " caracteres para senha segura!");

            senhaForte(senha);
        }
    }
}