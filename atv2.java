package Ativ;
/*
    Desafio 1 - Fácil: Par ou Ímpar
    Problema:
        Escreva um programa que receba um número inteiro do usuário e determine se
        ele é par ou ímpar. O programa deve exibir uma mensagem informando o
        resultado.
        Requisitos:
        • Receber um número inteiro do usuário.
        • Verificar se o número é par ou ímpar (um número é par se o resto da
        divisão por 2 for zero).
        • Exibir "Par" se o número for par, e "Ímpar" se for ímpar.
*/

import javax.swing.JOptionPane;

public class atv2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número que você informou "+num+" é Par");
        }else {
            JOptionPane.showMessageDialog(null, "O número que você informou "+num+" é Ímpar");
        }
    }
}
