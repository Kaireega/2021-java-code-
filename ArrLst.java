import java.util.ArrayList;

public class ArrLst
   {
   
   // method to 
   public static boolean contains(int[] arr, int item)
   {
      for (int n : arr)
      {
         if(item == n)
         {
            return true;
         }
      
      }
     
         return false;
   
   }

   public static void main(String[] args)
      {        
      
      
      
       /*
         
      //  ADDING STRINGS TO ARRAYLIST 
      ArrayList<String> cityList = new ArrayList<String>();
      System.out.println(cityList.size());
      cityList.add("Dallas");
      cityList.add("New York");
      cityList.add("Boston");
      cityList.add("Chicago");
      cityList.add("Atlanta");
      System.out.println(cityList.size());
      
      
      for (int i = 0; i < cityList.size(); i++)
         {
            System.out.println(cityList.get(i));
         
         } 
        
      for (int i = 0; i < cityList.size(); i++)
         {
            System.out.println(cityList.get(i));
         }
      */
      
      
      
      /*
      
      //          AVERAGE OF AN ARRRY
      // create an array named gb 
      int [] gb = new int[] {20, 30, 25, 35, 34, 16, 35,60,-100};
     
      // sum set to 0
      int sum = 0;
      
      // create a for loop to run through array 
      for(int i = 0; i< gb.length; i++)
      
      
      //add current array value to running sum
      sum = sum += gb[i];
     
     
    // double average value 
    double average = sum / gb.length;
    
    // output to Screen
    System.out.println("Average vaule of the array elements is: " + average);
       
      
      */
      
        int [] my_array1 = {1789, 2035, 1899, 1456, 2013, 
                            1458, 2458, 1254, 1472, 2365, 
                            1456, 2265, 1457, 2456};
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
        
        }
   
   }
   
   
   
   
   
