/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunosNotas;

/**
 *
 * @author Luis Guilherme
 */
public class Fila {
    
    private Nota n;
    private No primeiro;
    private No ultimo;
    
    public Fila(){
        this.primeiro = null;
        this.ultimo = null;
    }       //Construtor
    
    //Inserir na fila
    public void inserir(Object a) {
        No novoNo = new No(a);
        
        if (vazia()) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.prox = novoNo;
            this.ultimo = novoNo;
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
    
    //Checa se existe
    public boolean existe(int n){
        No atual = this.primeiro;
        while((atual != null) && (!atual.dados.equals(n))){
            atual = atual.prox;
        }
        return false;
    }
    
    //Remove da fila
    public void remover() {
        if (!vazia()) {
            this.ultimo = this.ultimo.prox;
        }
    }
    
    //Checa se é vazia
    public boolean vazia() {
        return (this.primeiro == null);
    }
}
