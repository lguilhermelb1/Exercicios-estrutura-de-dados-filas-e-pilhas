/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunosNotas;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    //Menu da lista
    public static char menu() {
        String msg;
        System.out.println("\n1 para cadastrar aluno");
        System.out.println("2 para cadastrar nota");
        System.out.println("3 para calcular média de um aluno");
        System.out.println("4 para mostrar alunos sem nota");
        System.out.println("5 para excluir aluno");
        System.out.println("6 para excluir nota");
        System.out.println("7 para fechar o programa");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        Aluno aluno;
        Nota nota;
        int numero;
        double n;
        char opcao;

        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                    System.out.println("\nNome do aluno:");
                    aluno = new Aluno();
                    aluno.setNumero(pilha.getQtd() + 1);
                    aluno.setNome(l.next());
                    pilha.push(aluno);
                    break;
                case '2':
                    System.out.println("\nDigite o numero e depois a nota do aluno: ");
                    numero = l.nextInt();
                    if (numero == pilha.getQtd() || numero < pilha.getQtd() && numero > 0) {
                        n = l.nextDouble();
                        nota = new Nota();
                        nota.setNumero(numero);
                        nota.setNota(n);
                        System.out.println("\nNota cadastrada");
                        fila.inserir(nota);
                    } else {
                        System.out.println("\nAluno não cadastrado");
                    }
                    break;
                case '3':
                    System.out.println("Digite o número do aluno parar ver a média");
                    numero = l.nextInt();
                    if (numero == pilha.getQtd() || numero < pilha.getQtd() && numero > 0) {
                        System.out.println("Todos os alunos possuem notas");
                    } else{
                        
                    }
                    break;
                case '4':
                    numero = pilha.getQtd();
                    if (numero == pilha.getQtd() || numero < pilha.getQtd() && numero > 0) {
                        System.out.println("Todos os alunos possuem notas");
                    } else{
                        
                    }
                    break;
                case '5':
                    if (pilha.vazia()) {
                        System.out.println("\nA pilha está vazia");
                    } else {
                        System.out.println("\nRemovendo aluno");
                        pilha.pop();
                    }
                    break;
                case '6':
                    if (pilha.vazia()) {
                        System.out.println("\nA fila está vazia");
                    } else {
                        System.out.println("\nRemovendo nota");
                        fila.remover();
                    }
                    break;
                case '7':
                    System.out.println("\nDesligando programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while (opcao != '7');
        System.exit(0);
    }
}
