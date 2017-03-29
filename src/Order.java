/**
 * Created by user on 2017-03-27.
 */
public class Order {
    private int passengers; // 1-5 passengers per order
    private String departure; // where the plane leaves from
    private String destination; // where the plane will go
    private int ticketClass; // 1-3 where 1 is first-class, 2 is business and 3 economy

    public Order (int passengers, String departure, String destination, int ticketClass){
        this.passengers=passengers;
        this.departure=departure;
        this.destination=destination;
        this.ticketClass=ticketClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getTicketClass() {
        return ticketClass;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

}
