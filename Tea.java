public class Tea {
   //Question No 5
   private boolean Prepare;
	    private boolean Milk;
	    private boolean Sugar;

	    
	    // Prepares basic tea with hot water and tea leaves
	     
	    public void PrepareTea() {
	        Prepare = true;
	        System.out.println("Tea prepared with Hot Water and Tea leaves");
	        System.out.println("");
	    }

	    
	    // Ads milk to basic tea
	     
	    public void addMilk() {
	        if (Prepare) {
	            Milk = true;
	            System.out.println("Milk added to  Tea");
	        } else {
	            System.out.println("Tea needs to be Prepared First");
	        }
	    }

	    
	     // Ads sugar to basic tea
	     
	    public void addSugar() {
	        if (Prepare) {
	            Sugar = true;
	            System.out.println("Sugar added to Tea");
	        } else {
	            System.out.println("Tea needs to be prepared First");
	        }
	    }

	    
	     // prints tea, milk and sugar
	     
	    public void printTea() {
	    	System.out.println("");
	        System.out.println("Tea prepared: " + Prepare);
	        System.out.println("Milk added: " + Milk);
	        System.out.println("Sugar added: " + Sugar);
	    }

	    public static void main(String[] args) {
	        Tea t = new Tea();
	        t.PrepareTea();
	        t.addMilk();
	        t.addSugar();
	        t.printTea();
	    } 
}

/*
 Output
Tea prepared with Hot Water and Tea leaves

Milk added to  Tea
Sugar added to Tea

Tea prepared: true
Milk added: true
Sugar added: true
 */