package principal;

import java.util.ArrayList;

public class Cofre {
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public void adicionar(Moeda coin){
        listaMoedas.add(coin);
    }

    public void remover(Moeda coin){
        listaMoedas.remove(coin);
    }

    public void listar(){
        for (Moeda coin:listaMoedas) {
            System.out.println(coin.info());
        }
    }

    public void totalConvertido(){
        double total = 0;
        for (Moeda coin:listaMoedas) {
            total += coin.converter();
        }
        System.out.println("Total convertido em Reais: " + total);;
    }
}
