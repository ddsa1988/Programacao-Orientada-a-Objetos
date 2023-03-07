package exercise03;

public class Main {
    public static void main(String[] args){

        Safe mySafe = new Safe();

        mySafe.addCoin("Real", 25);
        mySafe.addCoin("Euro", 10);
        mySafe.addCoin("   real", 50);
        mySafe.addCoin(" EuRo    ", 100);

        System.out.println(mySafe.getCoin());
        System.out.println(mySafe.getTotal());
    }
}
