package Ativ;
/*
    Desafio 1 - Fácil: Cálculo de Média Simples
    Problema:
        Escreva um programa que receba três notas de um aluno e calcule a média
        simples dessas notas. O programa deve exibir a média e dizer se o aluno foi
        aprovado (média maior ou igual a 7) ou reprovado (média menor que 7).
        Requisitos:
        • Use estruturas de controle de fluxo (como if/else).
        • O programa deve solicitar três números (notas entre 0 e 10).
        • Calcule a média simples e exiba o resultado com uma mensagem de
        aprovação ou reprovação.
*/

import javax.swing.JOptionPane;

public class atv1 {
    public static void main(String[] args){
        float nota1,nota2,nota3,media;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
        media = (nota1 + nota2 + nota3) / 3;
        if(media >= 7){
            JOptionPane.showMessageDialog(null, "Aprovado! Média: " + media);
        }else{
            JOptionPane.showMessageDialog(null, "Reprovado! Média: " + media);
        }

    }
}
