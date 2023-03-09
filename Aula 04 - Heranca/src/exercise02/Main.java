package exercise02;
public class Main {
    public static void main(String[] args){
        Ticket myTicket = new Ticket("Metallica", 800);
        System.out.println(myTicket.info());
        System.out.println();

        TicketVip myTicketVip = new TicketVip("Metallica", 1250, 200);
        System.out.println(myTicketVip.info());
    }
}
