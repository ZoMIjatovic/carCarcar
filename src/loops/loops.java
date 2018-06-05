
package loops;


public class loops {
    public void testWhileLoops() { 
     int x = 4;
    while (x > 0) {
            System.out.println("Value of x " + x);
            x--;
}
     System.out.println("Value of x after while loop " + x);
    }
    
    public static void testDoWhileLoop() { 
    int y = 6;
     do {
         System.out.println("Value of y " + y);
         y--;
     }while (y > 3);
    }
    
    public static void testForLoops() { 
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i " + i);
        }
        
    }
    public static void testDoubleForLoops() { 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + " , j=" + j);
            }
        }
        }
        public static void testMultipicationTable() { 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int z = i * j;
                System.out.println(i + " * " +  j  + " = " + z);
            }
        }
    
    
}
}