package net.whenriquelsh.cofrinho.Moedas;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 6.0; //Supondo que 1 Euro é igual a 6 Reais
    }

    @Override
    public double converterParaDolar() {
        return valor * 1.18; //Supondo que 1 Euro é igual a 1.18 Dólares
    }

    @Override
    public double converterParaEuro() {
        return valor;
    }

    @Override
    public double converterParaReal() {
        return converter();
    }

    @Override
    public String getTipo() {
        return "Euro";
    }
}


