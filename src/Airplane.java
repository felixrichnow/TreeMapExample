import java.util.Stack;

/**
 * Created by user on 2017-03-27.
 */
public class Airplane {
    double currentDistanceToDestination =0; // Starts at a destination
    double speedOfthePlanePerMinute;
    int actualAmountOfPassengers;
    int amountOfPossiblePassengers=150;
    String Departure; // Currentlocation
    String Destination;
    Stack<Order> Passengers;

    public Airplane() {
        this.currentDistanceToDestination =0;
        this.speedOfthePlanePerMinute=14.75;
    }

    public void updatePlane(){
        //TODO here I will implement the planes movement
        currentDistanceToDestination = currentDistanceToDestination -speedOfthePlanePerMinute;
        //We make sure to check if it goes negative and sets it to 0 then
        if(Double.compare(currentDistanceToDestination, 0.0) < 0){
            currentDistanceToDestination =0;
        }
    }

    public double getCurrentDistanceToDestination(){
        return currentDistanceToDestination;
    }

    public boolean isCurrentlyMoving (){
    if(currentDistanceToDestination !=0){
        return true;
    }
        else{
        return false;
    }
    }

    public void reachedDestionNation(){
        Passengers.clear();
    }

    /*
    /* This method will be used to add passengers into the airplane
     */

    public void addPassengers(Order newPassengers){
        if(Destination.equalsIgnoreCase(newPassengers.getDestination())){
            Passengers.add(newPassengers);
        }
        else{
            System.out.println("Tried adding passengers with wrong destination " +
                    "to a plane with different destination");

        }
    }

}
