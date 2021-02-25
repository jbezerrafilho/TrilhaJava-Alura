package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

//Converter um número decimal em qualquer base
public class Exer07 {
    public static void main(String[] args) {
        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10035);
        imprimeResultado(25, 16);
        imprimeResultado(10035, 9);
        imprimeResultado(10035, 16);

    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultado(int numero, int base) {
        System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        int resto;
        String numBinario = "";

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2; // numero = numero / 2;
        }

        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();
        }

        return numBinario;
    }

    public static String decimalQualquerBase(int numero, int base) {
        if (base > 16) {
            throw new IllegalArgumentException();
        }
        Stack<Integer> pilha = new Stack<>();
        int resto;
        String numBase = "";
        String bases = "0123456789ABCDEF";


        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }

        while (!pilha.isEmpty()) {
            numBase += bases.charAt(pilha.pop());
        }

        return numBase;
    }
}
