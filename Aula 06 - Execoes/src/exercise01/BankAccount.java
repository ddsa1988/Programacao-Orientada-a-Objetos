package exercise01;
public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance){
        setName(name);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(!name.isEmpty() && !name.isBlank()){
            this.name = name.trim();
        }else {
            throw new RuntimeException("Invalid initial name!");
        }
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if(balance >= 0){
            this.balance = balance;
        }else {
            throw new RuntimeException("Invalid initial balance value!");
        }
    }

    public boolean withdraw(double value){
        if(value <= 0){
            try {
                throw new Exception("Value must be above zero!");
            }catch (Exception error){
                System.out.println(error.getMessage());
                return false;
            }
        }else{
            if((balance - value) < 0){
                try {
                    throw new Exception("Your balance doesn't have enough money!");
                }catch (Exception error){
                    System.out.println(error.getMessage());
                    return false;
                }
            }else {
                balance -= value;
                return true;
            }
        }
    }

    public boolean deposit(double value){
        if(value <= 0){
            try {
                throw new Exception("Value must be above zero!");
            }catch (Exception error){
                System.out.println(error.getMessage());
                return false;
            }
        }else{
            balance += value;
            return true;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
