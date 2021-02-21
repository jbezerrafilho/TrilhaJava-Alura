package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

  public Pilha(int capacidade) {
    super(capacidade);
  }

  public Pilha() {
    super();
  }

  public void empilha(T elemento){
    super.adiciona(elemento);
  }

}