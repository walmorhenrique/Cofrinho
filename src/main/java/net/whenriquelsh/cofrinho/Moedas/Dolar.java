package net.whenriquelsh.cofrinho.Moedas;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converter() {
        return valor * 5.0; //Supondo que 1 Dólar é igual a 5 Reais
    }

    @Override
    public double converterParaDolar() {
        return valor;
    }

    @Override
    public double converterParaEuro() {
        return valor * 0.85; //Supondo que 1 Dólar é igual a 0.85 Euro
    }

    @Override
    public double converterParaReal() {
        return converter();
    }

    @Override
    public String getTipo() {
        return "Dolar";
    }
}

