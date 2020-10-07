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
public class Fila {
    
    private No primeiro;
    private No ultimo;
    
    public Fila(){
        this.primeiro = null;
        this.ultimo = null;
    }       //Construtor
    
    //Inserir na fila
    public void inserir(Numero n) {
        No novoNo = new No(n);
        if (this.vazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.prox = novoNo;
        }
        this.ultimo = novoNo;
    }
    
    //Imprimir fila
    public String imprimir() {
        String msg = "";
        if (vazia()) {
            msg = "A fila está vazia";
        } else {
            No atual = this.primeiro;
            while (atual != null) {
                msg += atual.dados + " ";
                atual = atual.prox;
            }
        }
        return msg;
    }
    
    //Checa se é vazia
    public boolean vazia() {
        return (this.primeiro == null);
    }
}
