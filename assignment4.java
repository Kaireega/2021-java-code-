import java.util.Scanner;
import java.util.Arrays;
public class assignment4
{

   public static void main(String[] args) 
   {
      //Make "string"
      //model Y/N
      car();
      double price = 361.97;
  
   
   }
   public static void car()
   {
      Scanner in = new Scanner(System.in);
   
   
      System.out.println("What is the Make of your Car?");
      String car1 = in.nextLine();
    

      Scanner input = new Scanner(System.in);
   
   
       System.out.println("Is your Car an Import?");
       boolean carimport = false;
       String consoleInput = in.nextLine();
       if(consoleInput.equalsIgnoreCase("yes"))
       carimport = true;
  

   
        System.out.print("services: ");
        String[] array1 = new String []{"Oil Change", "Tune Up", "Brake Job", "Transmission service"};
        System.out.println(Arrays.toString(array1));
   
        System.out.println(" ");
   
        System.out.print("Prices, respectively: ");
        double[] array2 = new double []{59.99, 111.99, 189.99,149.99};
        System.out.println(Arrays.toString(array2));
   

         System.out.println(" ");
         System.out.println("Please select the services that you want for your " + car1);
  
     }
     
  System.out.println("Oil Change : Please enter Y or N =");
   boolean oilC = false;
String consoleInput = in.nextLine();
if(consoleInput.equalsIgnoreCase("Y"))
   oilC = true;

  
  System.out.println("Tune Up : Please enter Y or N =");
  boolean oilC = false;
String consoleInput = in.nextLine();
if(consoleInput.equalsIgnoreCase("Y"))
   oilC = true;
  
  System.out.println("Brake Job : Please enter Y or N =");
  boolean brakeJ = false;
String consoleInput = in.nextLine();
if(consoleInput.equalsIgnoreCase("Y"))
   brakeJ = true;
  
  System.out.println("Transmission servive : Please enter Y or N =");
  boolean tranServ = false;
String consoleInput = in.nextLine();
if(consoleInput.equalsIgnoreCase("Y"))
   tranServ = true;
  
  
  
  /*public static void custDiscount(double price)
  {
      // 28% discount
      double discountAmt;
      discountAmt = price*.28; 
      System.out.println(discountAmt);*/
  }