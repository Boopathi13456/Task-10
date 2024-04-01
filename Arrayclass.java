public class Arrayclass {
    // Question No 7
    public static void main(String[] args) {
			 
			 
        System.out.println("Prepare Tea");
        // Creating an array
           Tea[] tea = new Tea[7];
           
        // Creating Instances for class and subclass
           
           tea[0] = new Tea();
           tea[1] = new BlackTea();
           tea[2] = new GreenTea();
           tea[3] = new HerbalTea();
                          
        // Calling prepareTea() method
            tea[0].PrepareTea();
            tea[1].PrepareTea();
            tea[2].PrepareTea();
            tea[3].PrepareTea();
       }
}

/*
 Output
Prepare Tea
Tea prepared with Hot Water and Tea leaves


Preparing Black Tea / brewing for 3 Min

Preparing Green Tea / brewing for 5 Min

Preparing Herbal Tea / brewing for 7 Min
 */
