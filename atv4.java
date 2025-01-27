package Ativ;
/*
    Desafio 2 - Médio: Jogo de Adivinhação
    Problema:
        Escreva um programa que simule um jogo de adivinhação. O programa deve
        gerar um número aleatório entre 1 e 100, e o usuário terá que adivinhar esse
        número. Para cada palpite, o programa deve informar se o número correto é
        maior, menor ou se o usuário acertou.
        Requisitos:
        • Gere um número aleatório entre 1 e 100.
        • Permita que o usuário dê palpites até acertar o número.
        • Para cada palpite, informe se o número correto é maior ou menor do que
        o informado pelo usuário.
        • Quando o usuário acertar, exiba uma mensagem de vitória e o número de
        tentativas.
    Dica:
        • Use estruturas de repetição (loops) e condições (if/else).
*/

import javax.swing.JOptionPane;

public class atv4 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100 + 1);
        int palpite, tentativas = 0;
        boolean acertou = false;
        
        while (!acertou) {
            palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 100:"));
            tentativas++;
            
            if (palpite == num) {
                acertou = true;
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + num + " em " + tentativas + " tentativas.");
            } else if (palpite < num) {
                JOptionPane.showMessageDialog(null, "O número correto é maior do que " + palpite + ".");
            } else {
                JOptionPane.showMessageDialog(null, "O número correto é menor do que " + palpite + ".");
            }
        }    
    }      
}
