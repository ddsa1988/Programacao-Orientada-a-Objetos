package principal;

public class Dolar extends Moeda{

    public Dolar(double valor){
        super(valor);
    }

    @Override
    public String info() {
        return "Dolar: " + getValor();
    }

    @Override
    public double converter() {
        return getValor() * 3;
    }
}
