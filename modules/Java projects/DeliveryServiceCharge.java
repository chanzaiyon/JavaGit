
public class DeliveryServiceCharge {
    public static void main(String[] args) {

      Delivery package1 = new Delivery("LETTER", "Next Day Priority", 8);
      Delivery package2 = new Delivery("BOX", "2-DAY", 1);
      Delivery package3 = new Delivery("LETTER", "Next Day Standard", 5);
      Delivery package4 = new Delivery("BOX", "Next Day Standard", 0.25);
      Delivery package5 = new Delivery("LETTER", "Next Day Standard", 7);

      

        System.out.println("======================================");
        System.out.println("          SUMMARY OF DELIVERY         ");
        System.out.println("======================================");

        System.out.println(" PACKAGE#1 ");
        package1.calculatePackageCharge();
        package1.displaydetails();

        System.out.println(" PACKAGE#2 ");
        package2.calculatePackageCharge();
        package2.displaydetails();

        System.out.println(" PACKAGE#3");
        package3.calculatePackageCharge();
        package3.displaydetails();

        System.out.println("PACKAGE#4");
        


        
       
        

    }
} 

