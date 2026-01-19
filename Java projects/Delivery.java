public class Delivery {

   private String packagetype, servicetype, error;
   private double packageweight, packagecharge;
   private double charge = 0.00;

   Delivery(String pt, String st, double pw) {
    packagetype = pt;
    servicetype = st;
    packageweight = pw;
   }

   public void calculatePackageCharge() {
        if (packagetype.equalsIgnoreCase("Letter") && (packageweight >=0 && packageweight <=8)) {
            switch (servicetype) {
                case "Next-Day Priority":
                    packagecharge = 12.00;
                    break;
                case "Next-Day Standard":
                    packagecharge = 10.50;
                    break;
                default:
                    error = "Service did not apply";
            }
        } else if (packagetype.equalsIgnoreCase("Box") && (packageweight >=0 && packageweight <= 1)) {
        switch (servicetype) {
            case "Next Day Priority":
                packagecharge = 15.75;
                break;
            case "Next Day Standard":
                packagecharge = 13.75;
                break;
            case "2-Day":
                packagecharge = 7.00;
                break;
        }
            
        }  else {
            error = "PACKAGE NOT APPLICABLE, PACKAGE EXCEEDS WEIGHT LIMIT";
        }
   }  

   public void displaydetails() {
    System.out.println("Package " + packagetype);
    System.out.println("Service Type: " + servicetype);
    System.out.println("Service Charge: " + packagecharge);
    System.out.println("Weight: " + packageweight);
   } 
}

