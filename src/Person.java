
public class Person implements Comparable<Person> {

	String name;
	String familyName;
	int id;

	public Person(String name, String familyName, int id) {
		this.name = name;
		this.familyName = familyName;
		this.id = id;
	}


	@Override
	public int compareTo(Person that) {
		//return this.id - that.id;
		//return this.familyName.compareTo(that.familyName);
		//return this.name.compareTo(that.name);
		//return this.name.compareTo(that.name)+this.familyName.compareTo(that.familyName);
		return this.name.compareTo(that.name)+this.familyName.compareTo(that.familyName);
	
	}


	@Override
	public String toString() {
		return "Person [name = " + name + ", familyName = " + familyName + "]";
	}

	
}