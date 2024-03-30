package net.whenriquelsh.cofrinho.Moedas;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor; //Como é Real, não precisa converter.
    }

    @Override
    public double converterParaDolar() {
        return valor * 0.20; //Supondo que 1 Real é igual a 0.20 Dólares
    }

    @Override
    public double converterParaEuro() {
        return valor * 0.17; //Supondo que 1 Real é igual a 0.17 Euros
    }

    @Override
    public double converterParaReal() {
        return valor;
    }

    @Override
    public String getTipo() {
        return "Real";
    }
}

