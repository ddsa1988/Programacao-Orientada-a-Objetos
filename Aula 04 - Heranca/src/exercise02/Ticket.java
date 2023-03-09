package exercise02;

public class Ticket {
    public String eventName;
    public double price;

    public Ticket(String eventName, double price){
        this.eventName = eventName;
        this.price = price;
    }

    public String info(){
        return "Event Name: " + eventName + "\n" +
                "Ticket Price: " + price;
    }
}
