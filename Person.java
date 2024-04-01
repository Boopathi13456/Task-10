public class Person {
    // Question No 1
    private String name;
	    private int age;


	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter methods
	    public String Name() {	
	    	
	        return name;
	    }

	    public int Age() {
	        return age;
	    }

	    public static void main(String[] args) {
	    	
	        // Creating a Person object
	        Person person = new Person("Boopathi", 27);

	        // Printing the name and age
	        System.out.println("Name: " + person.Name());
	        System.out.println("Age: " + person.Age());
	    }
}

/*Output
 Name: Boopathi
 Age: 27
 */