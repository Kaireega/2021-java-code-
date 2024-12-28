

public class Hamburger
{
// attributes 
   private  String bun;
   private int patties;
   private boolean cheese;
   private double price;
   private String[] toppings = new String[4];

   public Hamburger(){
      bun = "white";
      patties = 1;
      cheese = false;
      price = 3.50;
      toppings[0] = "lettuce";
      toppings[1] = "tomato";
      toppings[2] = "onion";
      toppings[3] = "pickles";
   }
}