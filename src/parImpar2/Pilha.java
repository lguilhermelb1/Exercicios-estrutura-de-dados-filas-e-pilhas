/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parImpar2;

/**
 *
 * @author Luis Guilherme
 */
public class Pilha {

    private No topo;
    private int qtd;

    public Pilha() {
        this.topo = null;
        qtd = 0;
    }   //Construtor

    public int getQtd() {
        return qtd;
    }

    //Adiciona número na pilha
    public void push(Object n) {
        No novo = new No(n);
        novo.prox = topo;
        topo = novo;
        qtd++;
    }

    //Remove número da pilha
    public Object pop() {
        if (!vazia()) {
            No a = topo;
            topo = topo.prox;
            a.prox = null;
            return a.dados;
        }
        qtd--;
        return null;
    }

    //Mostra topo da pilha
    Object peek() {
        return topo.dados;
    }

    //Impressão da pilha
    public String imprimirPilha() {
        No atual = topo;
        String msg = "";
        if (vazia()) {
            msg = "A lista está vazia";
        } else {
            while (atual != null) {
                msg += atual.dados.toString() + " ";
                atual = atual.prox;
            }
        }
        return msg;
    }

    public boolean existe(int n) {
        String msg = "";
        No atual = this.topo;
        while((atual != null) && (!atual.dados.equals(n))){
            atual = atual.prox;
        }
        return false;
    }

    //Checa se a pilha está vazia
    public boolean vazia() {
        return (topo == null);
    }

}
