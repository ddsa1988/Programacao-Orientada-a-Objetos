package exercise02;

public class TicketVip extends Ticket{
    public double extraFee;

    public TicketVip(String eventName, double price, double extraFee){
        super(eventName, price);
        this.extraFee = extraFee;
    }

    @Override
    public String info(){
        return  super.info() + "\n" +
                "Extra Fee: " + extraFee + "\n" +
                "Total: " + (super.price + extraFee);

    }
}
