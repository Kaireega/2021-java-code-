import java.util.Scanner;
public class ArrGrade 
{
     public static void main(String [] args)
     {
     
     Scanner keyboard = new Scanner(System.in);
     
     // Create a char array of size 5 named letterGrade
     char [] letterGrade = new char[5];
     
     // assign each element values 'A', 'B', 'C', 'D', 'F',
     for (int i = 0; i < 5; i++)
         {System.out.print("Enter letterGrade [" + i + "]: ");
         letterGrade[i] = (keyboard.nextLine()).charAt(0);
         
         }
         // print out each element 
     for (int i = 0 ; i < 5; i++)
         {
         System.out.println(letterGrade[i]);
         }
         
         
     }

} 