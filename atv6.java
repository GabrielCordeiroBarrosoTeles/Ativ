package Ativ;
/*
    Desafio 3 - Difícil: Validador de Palíndromo
    Problema:
        Escreva um programa que verifique se uma palavra ou frase é um palíndromo.
        Um palíndromo é uma palavra ou frase que pode ser lida da mesma forma de
        trás para frente, ignorando espaços, acentos e pontuação.
        Requisitos:
        • Receber do usuário uma palavra ou frase.
        • O programa deve remover espaços, pontuação e converter todas as letras
        para minúsculas para realizar a verificação.
        • Exiba "É palíndromo" se for o caso, ou "Não é palíndromo" caso contrário.

    Dicas:
        • Você pode precisar usar funções para remover caracteres especiais e
        converter para minúsculas.
        • Use loops ou funções próprias da linguagem escolhida para verificar se a
        palavra/frase é igual quando lida de trás para frente.
*/

import javax.swing.JOptionPane;
// nesse codigo eu comentei algumas partes pra na hora da leitura ficar mais facil a compressão :))
public class atv6 {
    public static void main(String[] args) {
         String entrada = JOptionPane.showInputDialog("Digite uma palavra ou frase para verificar se é um palíndromo:");

         // Verifica se a entrada não é nula e não está vazia após remover espaços
            // trim(): Remove os espaços em branco no início e no final da string.
            // isEmpty(): Verifica se a string está vazia após remover os espaços. caso tenha espaço  ou esteja fazia ela retorna true, e se tiver algo retorna false.
        if (entrada != null && !entrada.trim().isEmpty()) {
        // Converte a entrada para minúsculas e remove qualquer caractere que não seja uma letra de 'a' a 'z'
                // toLowerCase(): Converte todos os caracteres da string para minúsculas.
                // replaceAll(): Substitui todas as ocorrências de um padrão especificado por um valor. O padrão é passado como uma expressão regular.
                // "[^a-z]": Expressão regular que seleciona qualquer caractere que não seja uma letra (de 'a' a 'z') e o substitui por uma string vazia.
             String palavra = entrada.toLowerCase().replaceAll("[^a-z]", "");
 
             // Inverte a string processada para verificar se ela é igual à original
                // reverse(): Inverte os caracteres da string.
                // toString(): Converte o objeto StringBuilder de volta para uma string após a inversão.
             String invertida = new StringBuilder(palavra).reverse().toString();
 
             // Compara a string original com a invertida e exibe o resultado usando JOptionPane
             if (palavra.equals(invertida)) {
                 JOptionPane.showMessageDialog(null, "É palíndromo");  
             } else {
                 JOptionPane.showMessageDialog(null, "Não é palíndromo");  
             }
        } else {
             JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite uma palavra ou frase.");
        }
    }
}

