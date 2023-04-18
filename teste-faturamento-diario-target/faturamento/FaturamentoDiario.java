package faturamento;

public class FaturamentoDiario {
    private final int dia;
    private final double valor;

    public FaturamentoDiario(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public double getValor() {
        return valor;
    }
}