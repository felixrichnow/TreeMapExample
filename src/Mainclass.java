import java.util.Map;
import java.util.TreeMap;


public class Mainclass {

	
	public static void main(String[] args) {

		
		
		TreeMap<Person, String> myMap = new TreeMap<>();
		
		Person p1 = new Person("Bardia", "Fathi", 3);
		Person p2 = new Person("Felix", "Richnau", 1);
		Person p3 = new Person("Bardia", "Richnau", 2);
		Person p4 = new Person("Felix", "Fathi", 4);
		Person p5 = new Person("Waldo", "Waltersson", 5);
		Person p6 = new Person("Abraham", "Waltersson", 6);
		
		myMap.put(p1, "BF's value");
		myMap.put(p2, "FR's value");
		myMap.put(p3, "BR's value");
		myMap.put(p4, "FF's value");
		myMap.put(p5, "WA's value");
		myMap.put(p6, "AW's value");
		
		for (Map.Entry<Person, String> entry : myMap.entrySet()) {
		     System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
		}
		
		
		
	}	 

}
