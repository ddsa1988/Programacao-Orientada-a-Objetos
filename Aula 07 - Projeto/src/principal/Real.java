package principal;

public class Real extends Moeda{

    public Real(double valor){
        super(valor);
    }

    @Override
    public String info() {
        return "Real: " + getValor();
    }

    @Override
    public double converter() {
        return getValor() * 1;
    }
}
