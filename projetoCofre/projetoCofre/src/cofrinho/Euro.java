package cofrinho;

import java.util.Objects;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    @Override
    void info() {
        System.out.print("Euro");
    }

    @Override
    double converter() {
        return this.valor * 6.20;
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
