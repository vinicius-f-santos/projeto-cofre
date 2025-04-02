package cofrinho;

import java.util.Objects;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    abstract void info();
    abstract double converter();
    abstract double getValor();

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
