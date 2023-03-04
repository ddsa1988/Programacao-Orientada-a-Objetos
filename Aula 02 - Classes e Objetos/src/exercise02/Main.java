package exercise02;

public class Main {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Diego", 123, 1000f, 5000f);
        System.out.println(myAccount.info());
    }
}
