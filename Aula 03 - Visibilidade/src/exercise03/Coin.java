package exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Coin {

    private HashMap<String, ArrayList<Double>> coins = new HashMap<>();

    public void setCoins(String coinName, double coinValue) {
        String name = coinName.trim().toLowerCase();

        if (name != "" && coinValue > 0) {
            if (coins.containsKey(name)) {
                coins.get(name).add(coinValue);
            } else {
                coins.put(name, new ArrayList<Double>(Arrays.asList(coinValue)));
            }
        } else {
            System.out.println("Invalid coin!");
        }
    }

    public HashMap getCoins() {
        return coins;
    }

    public HashMap sumCoins(){
        HashMap<String, Double> coinsTotal = new HashMap<>();

        for (String coinName:coins.keySet()) {
            ArrayList<Double> coinValues = coins.get(coinName);
            double sum = 0;

            for (double value: coinValues) {
                sum += value;
            }
            coinsTotal.put(coinName, sum);
        }

        return coinsTotal;
    }
}
