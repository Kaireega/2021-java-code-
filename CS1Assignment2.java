import java.util.Scanner; 
 

public class CS1Assignment2
{
public static void main(String[] args) 
{ 
    String person1Play; //User's play -- "R", "P", or "S"
    String person2Play; //User's play -- "R", "P", or "S" 
    

    Scanner scan = new Scanner(System.in); 
   

    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
                       "Please enter a move.\n" + "Rock , Paper" + 
                       ", and Scissors.");

    System.out.println();
    
    

    //Get player's play from input-- note that this is 
    // stored as a string 
    System.out.println("player One Enter your play: "); 
    person1Play = scan.nextline();
    
    System.out.println("player Two Enter your play: "); 
    person2Play = scan.nextline();

    //Make player's play uppercase for ease of comparison 
          //See who won. Use nested ifs 
      // if a tie 
    if (person1Play == person2Play) 
       System.out.println("It's a tie!"); 
         else if(person1play != person2play)
         // rock break scissors
         if(person1Play == "Rock" && person2Play == "Scissors")
          System.out.println("Rock crushes scissors. Player One win!!");
          else if (person2Play != person1Play)
          if(person2Play == "Rock" && person1Play == "Scissors")
          System.out.println("Rock crushes scissors. Player two win!!"); 
          // paper cover rock
          if(person1Play == "Paper" && person2Play == "Rock")
          System.out.println("Paper crushes Rock. Player Two win!!");
          else if (person2Play != person1Play)
          if(person2Play == "Paper" && person1Play == "Rock")
          System.out.println("Paper crushes Rock. Player ONE win!!"); 
          
          // SCISSORS CUT PAPER
          if(person1Play == "Scissors" && person2Play == "Paper")
          System.out.println("Scissors crushes Paper. Player One win!!");
          else if (person2Play != person1Play)
          if(person2Play == "Scissors" && person1Play == "Paper")
          System.out.println("Scissors crushes Paper. Player Two win!!"); 
           else if (person2Play != person1Play)

          
          System.out.println("Would you like to play again ");
            System.out.println("Please enter Yes/No");
            playagain = keyboard.next();
            playagain = playagain.toUpperCase();
            playAgainOrNot = playagain.charAt(0);
            
           
        while (playAgainOrNot == 'Y');
 
 
        
        System.out.print(person1Play.toString() + " \n" + person2Play.toString());
 
          
          
          
          
          
          
          
          
          
          
          
          
          
          /*
    else if (computerPlay.equals("P")) 
            System.out.println("Paper eats rock. You lose!!"); 
    else if (personPlay.equals("P")) 
       if (computerPlay.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Paper eats rock. You win!!"); 
    else if (personPlay.equals("S")) 
         if (computerPlay.equals("P")) 
         System.out.println("Scissor cuts paper. You win!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!"); 
    else 
         System.out.println("Invalid user input."); 
    }
}*/
        
        }
    }