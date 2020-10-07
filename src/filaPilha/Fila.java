/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaPilha;

/**
 *
 * @author Luis Guilherme
 */
public class Fila {
    private No primeiro;
    private No ultimo;
    private int qtd;
    
    public Fila(){
        this.primeiro = null;
        this.ultimo = null;
        this.qtd = 0;
    }       //Construtor

    public int getQtd() {
        return qtd;
    }
    
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
        qtd++;
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
    
    //Remove da fila
    public void remover() {
        if (!vazia()) {
            this.primeiro = this.primeiro.prox;
            qtd--;
        }
    }
    
    //Checa se é vazia
    public boolean vazia() {
        return (this.primeiro == null);
    }

}
