
import loops.loops;
import person.Person;
import person.Student;
import person.Teacher;



public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.printMainAttraibutes();
//        
//        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
//        System.out.println(myCar.condition);
//        System.out.println(myCar.currentPrice);
//        System.out.println(myCar.licence);
//        
//        System.out.println(myCar.minSpeed);
//        System.out.println(myCar.weight);
//        System.out.println(myCar.licence);
//        
//        
//        
//
//        Car companyCar = new Car(150, 30, 2000, false, "EF-123", 'B', 3500, 6000);
//        companyCar.changeModel("Fiat");
//        companyCar.changeMaxFuel(150);
//        companyCar.fuelUp();
//        companyCar.changeConsuption(10);
//        companyCar.printMainAttraibutes();
//        companyCar.travel(20);
//        companyCar.printAttraibutes();
//        
//        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
//        System.out.println(companyCar.condition);
//        System.out.println(companyCar.currentPrice);
//        System.out.println(companyCar.licence);
//        System.out.println(companyCar.minSpeed);
//        System.out.println(companyCar.weight);
//        System.out.println(companyCar.licence);
//        
//        Car audi = new Car();
//        audi.changeModel("Audi");
//        audi.fuelUp();
//        audi.changeConsuption(20);
//        audi.travel(3);
//        audi.printMainAttraibutes();
//        audi.travel(3);
//        audi.printMainAttraibutes();
//        audi.getIn();
//        audi.getOut();
//        audi.printMainAttraibutes();
//        audi.getIn();
//        audi.getOut();
//        audi.printMainAttraibutes();
//        audi.getIn();
//        audi.getOut();
//        audi.printMainAttraibutes();
//        audi.getIn();
//        audi.getOut();
//    
//        Car testAuto = new Car();
//        testAuto.printMainAttraibutes();
//        testAuto.getIn(1);
//        testAuto.getOut(1);
//        testAuto.printMainAttraibutes();
//        testAuto.getIn(2);
//        testAuto.getOut(3);
//        testAuto.printMainAttraibutes();
//        testAuto.getIn(3);
//        testAuto.getOut(2);

   
     
//     loops testLoops = new loops();
//     testLoops.testDoWhileLoop();
//     
//     loops.testDoWhileLoop();
//     loops.testForLoops();
//     
//     
//     loops.testDoubleForLoops();
//     loops.testMultipicationTable();
//     
     
     Person p1 = new Person();
     p1.showData();
     p1.setName("Marko");
     p1.setSurname("Markovic");
     p1.setJmbg("1234568978");
     p1.showData();
     
     Person p2 = new Person("Petar", "Petrovic", "78945612312");
     p2.showData();
     
     
     Student studentJovan = new Student("Jovan", "JOvanovic", "258963");
     studentJovan.setCurrentYear(4);
     studentJovan.setIndexNumber("4");
     studentJovan.showData();
     
     Student studentMarija = new Student("Marija", "Maric", "789456369", "oas-123", 2);
     studentMarija.showData();
             
     Teacher t1 = new Teacher();
     t1.showData();
    t1.setName("Milan");
    t1.setSurname("Milanovic");
    t1.setJmbg("77889945");
    t1.showData();
    
  
   } 
}