package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void adiconar(Moeda moeda) {
            if (moeda.getValor() <= 0) {
                System.out.println("---------------------------------------");
                System.out.println("Valor inválido!");
                System.out.println("---------------------------------------");
            }
            else {
                moedas.add(moeda);
                System.out.println("MOEDA ADICIONADA...");
            }
    }

    public void remover(Moeda moeda) {
        if (moedas.isEmpty()) {
            System.out.println("---------------------------------------");
            System.out.println("Lista vazia");
            System.out.println("---------------------------------------");
        }
        else if (!moedas.contains(moeda)) {
            System.out.println("---------------------------------------");
            System.out.println("Moeda não está na lista.");
            System.out.println("---------------------------------------");
        }
        else {
            moedas.remove(moeda);
            System.out.println("MOEDA REMOVIDA...");
        }
    }

    public void listarMoedas() {
        if (!moedas.isEmpty()) {
            System.out.println("---------------------------------------");
            System.out.println("--------------- Moedas ----------------");
            System.out.println("---------------------------------------");
            for (Moeda m : moedas) {
                m.info();
                System.out.println(" - " + m.getValor());
            }
            System.out.println("---------------------------------------");
        } else {
            System.out.println("---------------------------------------");
            System.out.println("Não há moedas na lista.");
            System.out.println("---------------------------------------");
        }
    }

    public void totalConvertido() {
        if (moedas.isEmpty()) {
            System.out.println("Não há valores para converter.");
        }
        else {
            double total = 0;
            for (Moeda m : moedas) {
                total += m.converter();
            }
            System.out.println("---------------------------------------");
            System.out.println("Total convertido: R$ " + String.format("%.2f", total));
            System.out.println("---------------------------------------");
        }
    }

    public ArrayList<Moeda> getMoedas() {
        return moedas;
    }
}