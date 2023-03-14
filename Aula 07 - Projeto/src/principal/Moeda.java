package principal;

import java.util.Objects;

public abstract class Moeda {
    private double valor;

    public Moeda(double valor){
        setValor(valor);
    }

    public void setValor(double valor){
        if(valor > 0){
            this.valor = valor;
        }
    }

    public double getValor(){
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(moeda.valor, valor) == 0;
    }

    public abstract String info();
    public abstract double converter();
}
