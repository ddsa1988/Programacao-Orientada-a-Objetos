package principal;

public class Main {
    public static void main(String[] args){

        Cofre myCofre = new Cofre();

        myCofre.adicionar(new Euro(10));
        myCofre.adicionar(new Euro(15));
        myCofre.adicionar(new Dolar(100));
        myCofre.adicionar(new Euro(20));
        myCofre.adicionar(new Real(220));
        myCofre.listar();
        System.out.println();

        myCofre.remover(new Euro(10));
        myCofre.listar();
        System.out.println();

        myCofre.totalConvertido();
    }
}
