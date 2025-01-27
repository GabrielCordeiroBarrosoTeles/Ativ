package Ativ;
/*
    Desafio 2 - Médio: Números Primos
    Problema:
        Escreva um programa que receba um número inteiro positivo e verifique se ele
        é um número primo. Um número primo é aquele que só pode ser dividido por 1
        e por ele mesmo.
        Requisitos:
        • Use estruturas de repetição (loops) e controle de fluxo.
        • O programa deve receber um número inteiro positivo.
        • Exiba "Primo" se o número for primo e "Não é primo" caso contrário.
    Dicas:
        • Um número primo tem exatamente dois divisores: 1 e ele mesmo.
        • Verifique os divisores de 2 até a raiz quadrada do número para otimizar a
        verificação.
*/

import javax.swing.JOptionPane;

public class atv3 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
            // Verificar se o número é positivo
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro positivo.");
            } else if (num == 1 || num == 0) {
                JOptionPane.showMessageDialog(null, num+" não é primo"); // 1 não é primo
            } else {
                boolean ehPrimo = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break; 
                    }
                }
                if (ehPrimo) {
                    JOptionPane.showMessageDialog(null, num+" é um número Primo");
                } else {
                    JOptionPane.showMessageDialog(null, num+" não é primo");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número inteiro.");
        }        
    }    
}
