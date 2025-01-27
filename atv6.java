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
public class atv6 {
    public static void main(String[] args) {
        String palavra = "Ame a ema";
        palavra = palavra.toLowerCase().replaceAll("[^a-z]", "");
        String invertida = new StringBuilder(palavra).reverse().toString();
        if (palavra.equals(invertida)) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
