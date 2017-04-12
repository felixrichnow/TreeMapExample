import java.util.*;

public class Mainclass {


    public static void main(String[] args) {
        String currentNodeString;
        Order testOrder;
        treeMapNodeOrderHolder storageNode = null;
        CustomComparator specialComp = new CustomComparator();
        // create map
        //		SortedMap<String,String>  map = new TreeMap<String, Order>(specialComp);
        TreeMap<treeMapNodeOrderHolder, ArrayList<Order>> myMap = new TreeMap<>();

//        myMap.put(new treeMapNodeOrderHolder("RomeStk", 5), new ArrayList<Order>());
//        myMap.put(new treeMapNodeOrderHolder("B", 7),  new ArrayList<Order>());
//        myMap.put(new treeMapNodeOrderHolder("C", 4),  new ArrayList<Order>());
//        myMap.put(new treeMapNodeOrderHolder("A", 8), new ArrayList<Order>());
//        myMap.put(new treeMapNodeOrderHolder("B", 0),  new ArrayList<Order>());



        /*

           myMap.forEach((a, b) -> System.out.println(a + " "+ a.getNumberOfPassengers()));
        myMap.keySet().stream().sorted(new sortedComparator()).forEach(b ->  System.out.println(b));

        System.out.println("Result:" +myMap.get(new treeMapNodeOrderHolder("RomeStk",0)) +" Hey ");
        */
        OrderGenerator randOrderGen = new OrderGenerator();
        int counter = 0;
        while(counter<10) {
            testOrder = randOrderGen.createANewOrder();
            System.out.println("New node created  Dep : " +testOrder.getDeparture() +" Des: "
                    +testOrder.getDestination() + " NumbPas : " +testOrder.getPassengers());
            currentNodeString = testOrder.getKeyString();

            if (!myMap.isEmpty()) {
                boolean nodeFound = false;
                for (treeMapNodeOrderHolder t : myMap.keySet()) {
                    if (t.getKeyString().equals(currentNodeString)) {
                       t.addOrderToOrderArrayList(testOrder);
                       myMap.put(t, t.getOrderArrayList());
                        nodeFound = true;
                        break;
                    }
                }
                if(nodeFound == false){
                    treeMapNodeOrderHolder currentNode = new treeMapNodeOrderHolder(testOrder);
                    myMap.put(currentNode, currentNode.getOrderArrayList());
                }
            } else {
                treeMapNodeOrderHolder currentNode = new treeMapNodeOrderHolder(testOrder);
                System.out.println("FIRST ORDER " +testOrder.getKeyString() );
                myMap.put(currentNode, currentNode.getOrderArrayList());
            }
            counter++;
        }
        System.out.println("asdasdasd asdas da sasd as d");
            myMap.forEach((a, b) -> System.out.println( a+" "+ a.getNumberOfPassengers()));

        System.out.println("asdasdasd asdas da sasd as d");
        	myMap.keySet().stream().sorted(new sortedComparator()).forEach(b ->  System.out.println(b +" "+b.getNumberOfPassengers()));

        // populate the map
        //		map.put("1","A");
        //			map.put("2","B");
        //		map.put("3","from java2s.com");
//
        // create a sorted map
        //		SortedMap<String,String> sortedmap =
        //				(SortedMap<String,String>)Collections.synchronizedSortedMap(map);

        //		System.out.println("Synchronized sorted map is :"+sortedmap);
    }
}


class CustomComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        Integer x1 = o1.getPassengers();
        Integer x2 = o2.getPassengers();
        int Comp = x1.compareTo(x2);
        return Comp;
    }

}