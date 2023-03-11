package exercise01;

public class Main {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Diego", 2000);
        System.out.println(myAccount.withdraw(-200));
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.deposit(-2500));
        System.out.println(myAccount.getBalance());
    }
}
