/*
    Desafio 3 - Difícil: Sequência de Fibonacci com Limite
    Problema:
            Escreva um programa que gere a sequência de Fibonacci até um limite fornecido
            pelo usuário. A sequência de Fibonacci começa com 0 e 1, e cada número
            subsequente é a soma dos dois anteriores.
            Requisitos:
            • O programa deve pedir ao usuário para fornecer um número limite.
            • A sequência de Fibonacci deve ser exibida até que o próximo número a
            ser gerado seja maior que o limite dado.
    Dicas:
        • Use uma estrutura de repetição para gerar os números da sequência.
        • Certifique-se de que o loop pare quando o próximo número da sequência
        ultrapassar o limite.
*/

import javax.swing.JOptionPane;

public class atv5 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, proximo,limite = 0;

        limite = Integer.parseInt(JOptionPane.showInputDialog("Digite um número limite:"));
        StringBuilder sequencia = new StringBuilder("Sequência de Fibonacci até " + limite + ":\n");
        
        sequencia.append(num1).append(", ").append(num2);

        proximo = num1 + num2;

        while (proximo <= limite) {
            sequencia.append(", ").append(proximo);
            num1 = num2;
            num2 = proximo;
            proximo = num1 + num2;
        }
        JOptionPane.showMessageDialog(null, sequencia.toString());
    }
}



