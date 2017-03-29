import java.util.Map;
import java.util.Stack;

/**
 * Created by Felix on 2017-03-27.
 * The CheckInSystem keeps track of all of
 * the AirPlanes it sorts and puts the passengers into the planes
 */
public class CheckInSystem {
    Stack<Order> OrderStack;
    Stack<Airplane> StockholmAirPlaneStack;
    Stack<Airplane> LondonAirPlaneStack;
    Stack<Airplane> ParisAirPlaneStack;
    Stack<Airplane> BerlinAirPlaneStack;
    Stack<Airplane> RomeAirPlaneStack;

//Fix this

    public void sortTheOrdersInTheSystem(){
        while(!OrderStack.empty()){
           Order toBeSorted = OrderStack.pop();
            if(toBeSorted.getDeparture().equalsIgnoreCase("Stockholm")){
                //TODO fix this
            }
        }
        //TODO here we will move the orders from OrderStack to right AirplaneStack
    }

    public void inputOrder(Order currentOrder){
         OrderStack.add(currentOrder);
    }

    public void addCityToHashMapsArray(Order testOrder,Map testMap){
        Stack<Order> orderStack;
        String testDeparture=testOrder.getDeparture();
        String testDestination=testOrder.getDeparture();
        int testTicketClass=testOrder.getTicketClass();
        String keyString = testDeparture+testDestination+testTicketClass;

        System.out.println(" ADDING ");

        if(testMap.get(keyString)==null){
            System.out.println(" NO-STACK FOUND AT THIS PLACE  ");
            orderStack = new Stack();
            orderStack.push(testOrder);
            testMap.put(keyString,orderStack);
        }
        else{
            System.out.println(" DID FIND A STACK SO ADDED IT TO EXISITING STACK ");
            orderStack = (Stack<Order>)testMap.get(keyString);
            orderStack.push(testOrder);
        }
    }



}
