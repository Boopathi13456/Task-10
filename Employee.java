public class Employee {
    // Question No 2
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    // Getter and Setter methods
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void getSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void salaryRaise(int percent) {
        salary += (salary * percent) / 100;
    }

    public String toString() {
    	System.out.println("before salary raise:");
        return "Employee ID: " + ID + ", Name: " + firstName + " " + lastName + ", Salary: " + salary;
    }

    public static void main(String[] args) {
    	
    	// Create an emp object
    	        Employee emp = new Employee();
        emp.setID(7);
        emp.setFirstName("Boopathi");
        emp.setLastName("T");
        emp.setSalary(30000);

        System.out.println(emp.toString());

        emp.salaryRaise(10);
        System.out.println("");
        System.out.println("after salary raise:");
        System.out.println("");
        System.out.println(emp.toString());
    }
}

/*Output
before salary raise:
Employee ID: 7, Name: Boopathi T, Salary: 30000

after salary raise:

before salary raise:
Employee ID: 7, Name: Boopathi T, Salary: 33000
*/