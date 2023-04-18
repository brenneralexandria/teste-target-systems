package distribuidora;

import faturamento.FaturamentoDiario;

public class Main {
    public static void main(String[] args) {
        FaturamentoDiario[] faturamento = new FaturamentoDiario[] {
                new FaturamentoDiario(1, 22174.1664),
                new FaturamentoDiario(2, 24537.6698),
                new FaturamentoDiario(3, 26139.6134),
                new FaturamentoDiario(4, 0.0),
                new FaturamentoDiario(5, 0.0),
                new FaturamentoDiario(6, 26742.6612),
                new FaturamentoDiario(7, 0.0),
                new FaturamentoDiario(8, 42889.2258),
                new FaturamentoDiario(9, 46251.174),
                new FaturamentoDiario(10, 11191.4722),
                new FaturamentoDiario(11, 0.0),
                new FaturamentoDiario(12, 0.0),
                new FaturamentoDiario(13, 3847.4823),
                new FaturamentoDiario(14, 373.7838),
                new FaturamentoDiario(15, 2659.7563),
                new FaturamentoDiario(16, 48924.2448),
                new FaturamentoDiario(17, 18419.2614),
                new FaturamentoDiario(18, 0.0),
                new FaturamentoDiario(19, 0.0),
                new FaturamentoDiario(20, 35240.1826),
                new FaturamentoDiario(21, 43829.1667),
                new FaturamentoDiario(22, 18235.6852),
                new FaturamentoDiario(23, 4355.0662),
                new FaturamentoDiario(24, 13327.1025),
                new FaturamentoDiario(25, 0.0),
                new FaturamentoDiario(26, 0.0),
                new FaturamentoDiario(27, 25681.8318),
                new FaturamentoDiario(28, 1718.1221),
                new FaturamentoDiario(29, 13220.495),
                new FaturamentoDiario(30, 8414.61)
        };

        double soma = 0;
        int diasComFaturamento = 0;
        double maiorFaturamento = Double.MIN_VALUE;
        double menorFaturamento = Double.MAX_VALUE;

        for (FaturamentoDiario f : faturamento) {
            double valor = f.getValor();

            // calcula a soma dos valores de faturamento para calcular a média
            if (valor > 0) {
                soma += valor;
                diasComFaturamento++;
            }

            // verifica o maior e o menor valor de faturamento
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }
            if (valor < menorFaturamento) {
                menorFaturamento = valor;
            }
        }

        // calcula a média dos valores de faturamento
        double media = soma / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (FaturamentoDiario f : faturamento) {
            double valor = f.getValor();
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }
        // imprime os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}