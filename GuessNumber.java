// import code

import java.util.Scanner;



public class GuessNumber
{
   public static void main(String[] arges)
   {
   Scanner scan = new Scanner(System.in);

   
   
   
   char firstGuess;
   char secondGuess;
   int upperBound = 100;
   int lowerBound = 1;
   int count = 0;
   int guess = 1;
  
       
  
   // Introduction 
   System.out.println("*******  Welcome to Number Guessing Game  *******");
   System.out.println("*******    Author: Kairee C. Gay    *******");
   
   // space 
   System.out.println("");
   System.out.println("");
   System.out.println("");
   
   // direction 
   System.out.println("In this game you (the human player) will pick a");
   System.out.println("number and I (the computer) will guess the number");
   System.out.println("you picked and prompt you to type Y or H or L.");
   System.out.println("Y = guess is correct, H = guess is too high,");
   System.out.println("L = guess is too low. If guess is not correct");
   System.out.println("I will guess again.");
   // space
   System.out.println("");
   System.out.println("");
   System.out.println("");
   
   // prompt the user  
   System.out.println("Pick a number between 1 and 100.");
   
   
   do
   {
   System.out.println("Did you pick a number? (Y/N)");
   firstGuess = (scan.nextLine()).charAt(0); 
   }while (firstGuess != 'Y');
   
  
  System.out.println("Ok, write it down somewhere.");
      
     
     while (true)
     {
   
         guess = (lowerBound + upperBound)/2;
         do
         {
         System.out.println("MY GUESS: is it "  + guess +"?(Y/H/L):" ); 
         secondGuess = (scan.nextLine()).charAt(0);
         }while ((secondGuess != 'Y')&&(secondGuess != 'H')&&(secondGuess != 'L'));
      
        
       
       
         if(secondGuess == 'H')
            {
           
           guess = upperBound;
           count++;
         
            }
         
       else if (secondGuess =='L')
            {
           guess = lowerBound;
            count++;
            }
        
         else if (secondGuess == 'Y')
            {
            System.out.println("****I guessed it correctly after" + count + "attempts."+
            "End of Game.");
           
            }
           else 
         {System.out.println("incorrect selection");}
      
    
    }
    
  
   }
}