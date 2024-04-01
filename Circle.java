public class Circle {
    
    private double radius;
   static String name;
//Question No 3
    // No-argument constructor
    public Circle() {
        radius = 2.0;
    }

    // Two-argument constructor
    public Circle(double radius,String name) {
        this.radius = radius;
        Circle.name = name;
        
    }

    // Method to calculate circumference
    public double calculatecircum() {
        return 2 * 3.14 * radius;
        
        
    }

    public static void main(String[] args) {
        // Creating a circle object using the no-argument constructor
        Circle c1 = new Circle();
        System.out.println("circumference of circle1: " + c1.calculatecircum());

        // Creating a circle object using the two-argument constructor
        Circle c2 = new Circle(5.0, " Boopathi ");
        System.out.println("circumference of circle2: " + c2.calculatecircum() +name);
        
    }
}

/*
 Output
circumference of circle1: 12.56
circumference of circle2: 31.400000000000002 Boopathi
 */
