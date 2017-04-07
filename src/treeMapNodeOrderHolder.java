import java.util.ArrayList;

/**
 * Created by user on 2017-04-07.
 */

public class treeMapNodeOrderHolder implements Comparable<treeMapNodeOrderHolder> {

    String departure;
    String destination;
    int numberOfPassengers;
    ArrayList<Order> orderHolderArrayList;

    public treeMapNodeOrderHolder(String departure, String destination, int numberOfPassengers) {
        this.departure = departure;
        this.destination = destination;
        this.numberOfPassengers = numberOfPassengers;
        orderHolderArrayList = new ArrayList<Order>();
    }

    @Override
    public int compareTo(treeMapNodeOrderHolder that) {
        //return this.id - that.id;
        //return this.familyName.compareTo(that.familyName);
        //return this.name.compareTo(that.name);
        //return this.name.compareTo(that.name)+this.familyName.compareTo(that.familyName);
        return (1000* (that.numberOfPassengers-this.numberOfPassengers))+this.departure.compareTo(that.departure);

    }

    public ArrayList<Order> getOrderArrayList(){
        return orderHolderArrayList;
    }

    public void addOrderToOrderArrayList(Order ordertoAdd){
        numberOfPassengers+= ordertoAdd.getPassengers();
        orderHolderArrayList.add(ordertoAdd);
    }

    public String getDeparture(){
        return departure;
    }

    public String getDestination(){
        return destination;
    }

    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }

    public void addNumberOfPassengers(int number){
        numberOfPassengers+=number;
    }

    @Override
    public String toString() {
        return(departure+ destination);
    }

}
