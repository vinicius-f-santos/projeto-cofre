package cofrinho;

import java.util.Objects;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    @Override
    void info() {
        System.out.print("Real");
    }

    @Override
    double converter() {
        return this.valor * 1;
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
