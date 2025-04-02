package cofrinho;

import java.util.Objects;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    void info() {
        System.out.print("Dolar");
    }

    @Override
    double converter() {
        return this.valor * 5.30;
    }

    @Override
    double getValor() {
        return this.valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }
}
