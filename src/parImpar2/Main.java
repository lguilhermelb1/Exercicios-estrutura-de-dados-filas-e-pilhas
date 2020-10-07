/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parImpar2;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila filaPar = new Fila();
        Fila filaImpar = new Fila();
        Numero f;

        f = new Numero();
        System.out.println("\nInserindo na pilha, digite 0 para parar:");
        f.setNum(l.nextInt());

        if (f.getNum() != 0) {
            if (f.getNum() % 2 == 0) {
                filaPar.inserir(f);         //Se for par
                pilha.push(f.getNum());
            } else {
                filaImpar.inserir(f);       //Se for impar
                pilha.push(f.getNum());
            }
            while (f.getNum() != 0) {
                f = new Numero();
                System.out.println("\nInserindo na pilha:");
                f.setNum(l.nextInt());
                if (f.getNum() % 2 == 0) {
                    filaPar.inserir(f);         //Se for par
                    pilha.push(f.getNum());
                } else {
                    filaImpar.inserir(f);       //Se for impar
                    pilha.push(f.getNum());
                }
            }
        }
        pilha.pop();
        System.out.println("Pilha: " + pilha.imprimirPilha());
        System.out.println("Fila par: " + filaPar.imprimir());
        System.out.println("Fila ímpar: " + filaImpar.imprimir());
    }
}
