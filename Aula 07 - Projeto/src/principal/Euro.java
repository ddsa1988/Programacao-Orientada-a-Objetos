package principal;

public class Euro extends Moeda{

    public Euro(double valor){
        super(valor);
    }

    @Override
    public String info() {
        return "Euro: " + getValor();
    }

    @Override
    public double converter() {
        return getValor() * 2;
    }
}
