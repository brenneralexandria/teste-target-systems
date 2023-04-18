package src;

/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo
valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a
sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
definido no código;*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0, b = 1, c, numb; // declara as variáveis iniciais da sequência (a=0 e b=1)
        boolean encontrado = false; // declara uma variável boolean para indicar se o número foi encontrado na sequência

        Scanner scan = new Scanner(System.in); // cria um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite um número inteiro: ");
        numb = scan.nextInt(); // lê o número digitado pelo usuário

        // verifica se o número digitado é igual a 0 ou 1 (os dois primeiros números da sequência)
        if (numb == a || numb == b) {
            encontrado = true; // se sim, define a variável encontrado como verdadeira
        } else {
            // se não, começa a executar um loop para calcular a sequência de Fibonacci até encontrar um número igual ou maior ao número digitado pelo usuário
            while (b < numb) {
                c = a + b; // calcula o próximo número da sequência
                a = b; // atualiza o valor de a para o próximo cálculo
                b = c; // atualiza o valor de b para o próximo cálculo
                if (b == numb) { // se o próximo número for igual ao número digitado pelo usuário
                    encontrado = true; // define a variável encontrado como verdadeira
                    break; // sai do loop
                }
            }
        }

        // exibe a mensagem informando se o número pertence ou não à sequência de Fibonacci
        if (encontrado) {
            System.out.println(numb + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numb + " não pertence à sequência de Fibonacci.");
        }
    }
}