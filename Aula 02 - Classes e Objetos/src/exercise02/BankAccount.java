package exercise02;

public class BankAccount {
    private String personName;
    private int accountNumber;
    private float balance;
    private float limit;

    public BankAccount(String personName, int accountNumber, float balance, float limit){
        this.setPersonName(personName);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
        this.setLimit(limit);
    }

    public void setPersonName(String personName){
        this.personName = personName;
    }

    public String getPersonName(){
        return this.personName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public float getBalance(){
        return this.balance;
    }

    public void setLimit(float limit){
        this.limit = limit >= 0 ? limit : 0f;
    }

    public float getLimit(){
        return this.limit;
    }

    public boolean withDraw(float value) {
        try{
            if(value > this.limit){
                throw new Exception("Value above the client's limit!");
            }

            if((this.getBalance() - value) < 0){
                throw new Exception("Value above the client's balance!");
            }

            this.balance -= value;
            return true;

        }catch (Exception error){
            System.out.println(error);
            return false;
        }
    }
    public boolean deposit(float value){
        try {
            if(value <= 0){
                throw new Exception("Value must be greater than zero!");
            }

            this.balance += value;
            return true;

        }catch (Exception error){
            System.out.println(error);
            return false;
        }
    }

    public String info() {
        return "BankAccount{" +
                "personName='" + personName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
