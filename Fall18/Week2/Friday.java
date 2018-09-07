import java.util.Random;
public class Friday {
  public static Random rng = new Random();
  public static void main(String[] args) {
    int[] age_array = new int[1000];
    
    for (int current_index = 0; current_index < 1000; current_index++)
    {
      age_array[current_index] = rng.nextInt(16) + 5;
    }
    
    //Create an method which takes in an array of ages and returns a sorted array.
    public static void sortedArray(int[] ar) // Daniel's Method
    {
         boolean swap = true;

         int cool = 0;

         int temp;

         while(swap == true)
         {
             swap = false;

             cool++;

             for (int i = 0; i < ar.length - cool; i++) 
             {
                 if(ar[i] > ar[i + 1])
                 {
                     temp = ar[i];
                     ar[i] = ar[i + 1];
                     ar[i + 1] = temp;
                     swap = true;
                 }

             }
         }
      
    } // Daniel's Method Done
    
    //Kevin Ramirez method
  public static int[] sortAges(int[] ages) {
      int[] sortedArr = new int[ages.length];
      
      for(int i = 0; i < ages.length; i++) {
          for(int j = i + 1; j < ages.length; j++) {
              if(ages[j] < ages[i]) {
                  int tmp = ages[i];
                  ages[i] = ages[j];
                  ages[j] = tmp;
              }
          }
      }
      
      for(int i = 0; i < sortedArr.length; i++) {
          sortedArr[i] = ages[i];
      }
      
      return sortedArr;
  }
    
    
  }
}
