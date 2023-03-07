package exercise02;

public class Main {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Diego", 123, 1000f, 5000f);
        System.out.println(myAccount.info());

        System.out.println(myAccount.withDraw(200f));
        System.out.println(myAccount.info());

        System.out.println(myAccount.withDraw(2000f));
        System.out.println(myAccount.info());

        System.out.println(myAccount.deposit(50f));
        System.out.println(myAccount.info());

        System.out.println(myAccount.deposit(-550f));
        System.out.println(myAccount.info());

    }
}
