package net.whenriquelsh.cofrinho;

import net.whenriquelsh.cofrinho.Moedas.Moeda;
import java.util.ArrayList;

public class Cofrinho {
    private final ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        for (Moeda m : listaMoedas) {
            if (m.getTipo().equals(moeda.getTipo())) {
                m.valor += (moeda.valor);
                return;
            }
        }
        listaMoedas.add(moeda);
    }

    public boolean remover(String tipo, double valor) {
        for (Moeda m : listaMoedas) {
            if (m.getTipo().equals(tipo)) {
                m.valor -= valor;
                if (m.valor <= 0) {
                    listaMoedas.remove(m);
                }
                return false;
            }
        }
        return false;
    }

    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            System.out.println(moeda.info());
        }
    }

    public double totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }

    public double totalConvertidoPara(String tipo) {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            if (moeda.getTipo().equals(tipo)) {
                total += moeda.valor;
            } else switch (tipo) {
                case "Dolar" -> total += moeda.converterParaDolar();
                case "Euro" -> total += moeda.converterParaEuro();
                case "Real" -> total += moeda.converterParaReal();
            }
        }
        return total;
    }
}
