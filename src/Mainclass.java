import java.util.Map;
import java.util.TreeMap;


public class Mainclass {


	public static void main(String[] args) {


		TreeMap<treeMapNodeOrderHolder, String> myMap = new TreeMap<>();
		
	/*

		treeMapNodeOrderHolder p1 = new treeMapNodeOrderHolder("Stockholm", "Rome", 700);
		treeMapNodeOrderHolder p2 = new treeMapNodeOrderHolder("Stockholm", "Paris", 500);
		treeMapNodeOrderHolder p3 = new treeMapNodeOrderHolder("Paris", "Stockholm", 2);
		treeMapNodeOrderHolder p4 = new treeMapNodeOrderHolder("London", "Paris", 4);
		treeMapNodeOrderHolder p5 = new treeMapNodeOrderHolder("Stockholm", "Paris", 5);
		treeMapNodeOrderHolder p6 = new treeMapNodeOrderHolder("London", "Rome", 6);*/

		OrderGenerator testOrderGenerator = new OrderGenerator();

		Order o1 = testOrderGenerator.createANewOrder();
		treeMapNodeOrderHolder p1 = new treeMapNodeOrderHolder(o1.getDeparture(), o1.getDestination(), o1.getPassengers());
		Order o2 = testOrderGenerator.createANewOrder();
		treeMapNodeOrderHolder p2 = new treeMapNodeOrderHolder(o2.getDeparture(), o2.getDestination(), o2.getPassengers());
		Order o3 = testOrderGenerator.createANewOrder();
		treeMapNodeOrderHolder p3 = new treeMapNodeOrderHolder(o3.getDeparture(), o3.getDestination(), o3.getPassengers());
		Order o4 = testOrderGenerator.createANewOrder();
		treeMapNodeOrderHolder p4 = new treeMapNodeOrderHolder(o4.getDeparture(), o4.getDestination(), o4.getPassengers());
		Order o5 = testOrderGenerator.createANewOrder();
		treeMapNodeOrderHolder p5 = new treeMapNodeOrderHolder(o5.getDeparture(), o5.getDestination(), o5.getPassengers());
		Order o6 = testOrderGenerator.createANewOrder();
		treeMapNodeOrderHolder p6 = new treeMapNodeOrderHolder(o6.getDeparture(), o6.getDestination(), o6.getPassengers());

		System.out.println("ORDER ONE: " + o1.getPassengers() + " DEP AND DES " + o1.getDeparture() + "  " + o1.getDestination() + "\n");
		System.out.println("ORDER TWO: " + o2.getPassengers() + " DEP AND DES " + o2.getDeparture() + "  " + o2.getDestination() + "\n");
		System.out.println("ORDER THREE: " + o3.getPassengers() + " DEP AND DES " + o3.getDeparture() + "  " + o3.getDestination() + "\n");
		System.out.println("ORDER FOUR: " + o4.getPassengers() + " DEP AND DES " + o4.getDeparture() + "  " + o4.getDestination() + "\n");
		System.out.println("ORDER FIVE: " + o5.getPassengers() + " DEP AND DES " + o5.getDeparture() + "  " + o5.getDestination() + "\n");
		System.out.println("ORDER SIX: " + o6.getPassengers() + " DEP AND DES " + o6.getDeparture() + "  " + o6.getDestination() + "\n");

		String p1String = p1.departure + p1.destination;
		String p2String = p2.departure + p2.destination;
		String p3String = p3.departure + p3.destination;
		String p4String = p4.departure + p4.destination;
		String p5String = p5.departure + p5.destination;
		String p6String = p6.departure + p6.destination;
		System.out.println(p6String);

		System.out.println("p1 Exists? :" + myMap.containsKey(p1));
		if (!myMap.containsKey(p1)) {
			myMap.put(p1, p1String);
		} else if (myMap.containsKey(p1)) {
			for (Map.Entry<treeMapNodeOrderHolder, String> entry : myMap.entrySet()) {
				if (entry.getKey().equals(p1String)) {
					treeMapNodeOrderHolder testOne = entry.getKey();
					testOne.addNumberOfPassengers(p1.getNumberOfPassengers());
					myMap.put( testOne, p1String );
					testOne = null;
				}
			}
		}
		System.out.println("p2 Exists? :" + myMap.containsKey(p2));
		if (!myMap.containsKey(p2)) {
			myMap.put(p2, p2String);
		} else if (myMap.containsKey(p2)) {
			for (Map.Entry<treeMapNodeOrderHolder, String> entry : myMap.entrySet()) {
				if (entry.getKey().equals(p2String)) {
					treeMapNodeOrderHolder testTwo = entry.getKey();
					testTwo.addNumberOfPassengers(p2.getNumberOfPassengers());
					myMap.put( testTwo, p2String );
					testTwo = null;
				}
			}
		}

			System.out.println("p3 Exists? :" +myMap.containsKey(p3));
			if (!myMap.containsKey(p3)) {
				myMap.put(p3, p3String);
			} else if(myMap.containsKey(p3)) {
				for (Map.Entry<treeMapNodeOrderHolder, String> entry : myMap.entrySet()) {
					if (entry.getKey().equals(p3String)) {
						treeMapNodeOrderHolder testOne = entry.getKey();
						testOne.addNumberOfPassengers(p3.getNumberOfPassengers());
						myMap.put( testOne, p3String );
						testOne = null;
					}
				}
			}

			System.out.println("p4 Exists? :" +myMap.containsKey(p4));
			if (!myMap.containsKey(p4)) {
				myMap.put(p4, p4String);
			} else if(myMap.containsKey(p4)){
				for (Map.Entry<treeMapNodeOrderHolder, String> entry : myMap.entrySet()) {
					if (entry.getKey().equals(p4String)) {
						treeMapNodeOrderHolder testOne = entry.getKey();
						testOne.addNumberOfPassengers(p4.getNumberOfPassengers());
						myMap.put( testOne, p4String );
						testOne = null;
					}
				}
			}

			System.out.println("p5 Exists? :" +myMap.containsKey(p5));
			if (!myMap.containsKey(p5)) {
				myMap.put(p5, p5String);
			} else if(myMap.containsKey(p5)) {
				for (Map.Entry<treeMapNodeOrderHolder, String> entry : myMap.entrySet()) {
					if (entry.getKey().equals(p5String)) {
						treeMapNodeOrderHolder testOne = entry.getKey();
						testOne.addNumberOfPassengers(p5.getNumberOfPassengers());
						myMap.put( testOne, p5String );
						testOne = null;
					}
				}
			}

			System.out.println("p6 Exists? :" +myMap.containsKey(p6));
			if (!myMap.containsKey(p6)) {
				myMap.put(p6, p6String);
			} else if(myMap.containsKey(p6)) {
				for (Map.Entry<treeMapNodeOrderHolder, String> entry : myMap.entrySet()) {
					if (entry.getKey().equals(p6String)) {
						treeMapNodeOrderHolder testOne = entry.getKey();
						testOne.addNumberOfPassengers(p6.getNumberOfPassengers());
						myMap.put( testOne, p6String );
						testOne = null;
					}
				}
			}


		//What if I make the value be the String departure+destionation.
		// boolean blnExists = treeMap.containsValue("Three");
		//while (!myMap.containsValue("currentDep+currentDes"){
		//          myMap.put(currentp);
		//}
		//else  currentP


		for (Map.Entry<treeMapNodeOrderHolder, String> entry : myMap.entrySet()) {
		     System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
				treeMapNodeOrderHolder test = entry.getKey();
				System.out.println("Number of passengers : " +test.getNumberOfPassengers() );
		}
		
		
		
	}	 

}
