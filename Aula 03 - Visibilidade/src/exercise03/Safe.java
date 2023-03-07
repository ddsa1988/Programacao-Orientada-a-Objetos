package exercise03;

import java.util.HashMap;

public class Safe {

    private Coin coin;

    public Safe(){
        this.coin = new Coin();
    }

    public void addCoin(String coinName, double coinValue){
        coin.setCoins(coinName, coinValue);
    }

    public HashMap getCoin(){
        return coin.getCoins();
    }

    public HashMap getTotal(){

        if(coin.sumCoins().isEmpty()){
            System.out.println("The safe is empty!!!");
        }

        return coin.sumCoins();
    }
}
