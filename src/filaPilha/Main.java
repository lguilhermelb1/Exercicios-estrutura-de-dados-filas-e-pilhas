/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaPilha;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    //Menu da lista
    public static char menu() {
        String msg;
        System.out.println("\n1 para inserir na pilha");
        System.out.println("2 para inserir na fila");
        System.out.println("3 para remover da pilha");
        System.out.println("4 para remover da fila");
        System.out.println("5 para exibir relatório");
        System.out.println("6 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        int n;
        char opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                    if (pilha.getQtd() < 5) {
                        while (pilha.getQtd() < 5) {
                            System.out.println("\nInserindo na pilha");
                            n = l.nextInt();
                            pilha.push(n);
                        }
                    } else {
                        System.out.println("\nPilha cheia");
                    }
                    break;
                case '2':
                    if (fila.getQtd() < 5) {
                        while (fila.getQtd() < 5) {
                            System.out.println("\nInserindo na fila");
                            n = l.nextInt();
                            fila.inserir(n);
                        }
                    } else {
                        System.out.println("\nFila cheia");
                    }
                    break;
                case '3':
                    if (pilha.vazia()) {
                        System.out.println("\nA pilha está vazia");
                    } else {
                        System.out.println("\nRemovendo da pilha");
                        pilha.pop();
                    }
                    break;
                case '4':
                    if (pilha.vazia()) {
                        System.out.println("\nA fila está vazia");
                    } else {
                        System.out.println("\nRemovendo da fila");
                        fila.remover();
                    }
                    break;
                case '5':
                    System.out.println("\nNúmeros: " + pilha.imprimirPilha() + fila.imprimir());
                    System.out.println("\nPilha: " + pilha.imprimirPilha());
                    System.out.println("\nFila: " + fila.imprimir());
                    break;
                case '6':
                    System.out.println("\nDesligando programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while (opcao != '6');
        System.exit(0);
    }
}
