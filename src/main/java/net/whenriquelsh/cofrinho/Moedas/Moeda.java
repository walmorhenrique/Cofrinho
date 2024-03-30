package net.whenriquelsh.cofrinho.Moedas;

public abstract class Moeda {
    public double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converter();
    public abstract double converterParaDolar();
    public abstract double converterParaEuro();
    public abstract double converterParaReal();
    public abstract String getTipo();

    public String info() {
        return "Tipo: " + getTipo() + ", Valor: " + valor;
    }
}

