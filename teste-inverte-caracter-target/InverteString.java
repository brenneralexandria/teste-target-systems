import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String entrada = sc.nextLine();

        // Converte a string em um array de caracteres
        char[] chars = entrada.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Itera sobre o array de caracteres
        while (left < right) {
            // Troca os caracteres nas posições left e right
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Incrementa left e decrementa right para continuar a iteração
            left++;
            right--;
        }

        // Cria uma nova string a partir do array de caracteres invertido
        String invertida = new String(chars);

        // Imprime a string invertida na tela
        System.out.println("A palavra invertida é: " + invertida);
    }
}