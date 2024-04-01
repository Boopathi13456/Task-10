
   //Question No 6 
   class BlackTea extends Tea { // BlackTea is a subclass of Tea class
    
    //Prepare the black tea with specific ingredients and brewing time
       public void PrepareTea() {
      System.out.println("");
      System.out.println("Preparing Black Tea / brewing for 3 Min");
  }
}


class GreenTea extends Tea {   // GreenTea is a subclass of Tea class
  
     // Prepare the green tea with specific ingredients and brewing time
      public void PrepareTea() {
      System.out.println("");
      System.out.println("Preparing Green Tea / brewing for 5 Min");
  }
}


class HerbalTea extends Tea { // HerbalTea is a subclass of Tea class
  
       // Prepare the herbal tea with specific ingredients and brewing time.
      public void PrepareTea() {
      System.out.println("");
      System.out.println("Preparing Herbal Tea / brewing for 7 Min");
  }
}

public class Subclass {
    public static void main(String[] args) {
        Tea t1 = new BlackTea();
        Tea t2 = new GreenTea();
        Tea t3= new HerbalTea();

 
        // Calling prepareTea() method
        t1.PrepareTea();
        t2.PrepareTea();
        t3.PrepareTea();
    }
}

/*
 Output
Preparing Black Tea / brewing for 3 Min

Preparing Green Tea / brewing for 5 Min

Preparing Herbal Tea / brewing for 7 Min
 */