package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula19 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazio()); //true
        System.out.println(fila.getTamanho()); // 0
    }

}
