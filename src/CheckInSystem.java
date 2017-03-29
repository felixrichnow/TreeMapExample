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

    /* This method will check the size of all stacks and return the one that has the biggest
    * size. However it check whether or not a destinations stack is bigger or as big as
    * another destinations stack. And it starts from Stockholm. That means that if Stockholm
    * and another Stack has the same size, Stockholm will be returned since it checks for that
    * first. This is just a coihce so that we have one stack being returned out of them.
     * The way I intend to use this is so the most important stack has its orders
     * put into a plane. Therefore it should be empty for the next time and then
     * take the next destination instead. */

    public Stack<Airplane> getMostImportantDestionation(){
        if(StockholmAirPlaneStack.size() >= LondonAirPlaneStack.size()
          && StockholmAirPlaneStack.size() >= ParisAirPlaneStack.size()
          && StockholmAirPlaneStack.size() >= BerlinAirPlaneStack.size()
          && StockholmAirPlaneStack.size() >= RomeAirPlaneStack.size()
     ){
            return StockholmAirPlaneStack;
        }
        else if(LondonAirPlaneStack.size() >= StockholmAirPlaneStack.size()
                && LondonAirPlaneStack.size() >= ParisAirPlaneStack.size()
                && LondonAirPlaneStack.size() >= BerlinAirPlaneStack.size()
                && LondonAirPlaneStack.size() >= RomeAirPlaneStack.size()
        )
        {
            return LondonAirPlaneStack;
        }
        else if(ParisAirPlaneStack.size() >= StockholmAirPlaneStack.size()
                && ParisAirPlaneStack.size() >= LondonAirPlaneStack.size()
                && ParisAirPlaneStack.size() >= BerlinAirPlaneStack.size()
                && ParisAirPlaneStack.size() >= RomeAirPlaneStack.size()
                )
        {
            return ParisAirPlaneStack;
        }
        else if(BerlinAirPlaneStack.size() >= StockholmAirPlaneStack.size()
                && BerlinAirPlaneStack.size() >= LondonAirPlaneStack.size()
                && BerlinAirPlaneStack.size() >= ParisAirPlaneStack.size()
                && BerlinAirPlaneStack.size() >= RomeAirPlaneStack.size()
                )
        {
            return BerlinAirPlaneStack;
        }
        // Since we checked all but Rome we can conclude Rome has to be biggest
        else{
            return RomeAirPlaneStack;
        }

    }


}
