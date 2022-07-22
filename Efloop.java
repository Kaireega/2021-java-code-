public class Efloop
   {
   public static void main(String [] args)
   {
   double [] temp = {96, 75, 85, 66, 72, 76, 80};
   
   
   System.out.println("--- Regular for loop---");
   for (int i = 0; i < temp.length; i++)
      {
      System.out.println(temp[i]);
      
      }
      // enhanced for loop
      System.out.println("/n--- enhanced for loop---");
      
      for(double t : temp) 
         {
         System.out.println(t);

         }
         
     int [] age = {10, 20, 30, 5, 13};
     int i = 0;
     for (int a : age)
      {
        i++;
        if (i < age.length)
                  System.out.println(a + ", ");
       
       else
            System.out.print(a);
      }
   
   
      }
   }