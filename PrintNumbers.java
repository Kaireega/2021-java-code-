import java.util.Scanner; 

public class PrintNumbers
 {  
   public static void main(String[] args)
      {
         int value;
         int sum = 0; 
         char choice;
         
         Scanner console = new Scanner(System.in);
         
         do
         { 
            System.out.print("Enter integer: ");
            value = console.nextInt();
            
            sum = sum + value;
            
            System.out.print("Enter Y for yes and or N for no: ");
            choice = console.next().charAt(0);
         }
            
         while ((choice == 'y') || (choice == 'Y'));
            
            
            System.out.println("Sum of the intergers: " + sum);
          } 
      
      } 
               