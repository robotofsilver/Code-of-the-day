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
    
  public static int[] sort_array(int[] array_to_sort)//Martin Lennan's method
	{
		int[] sorted_array = new int[array_to_sort.length];
		int[] age_counters = new int[17];
		for (int current_index = 0; current_index < 1000; current_index++)
		{
			age_counters[array_to_sort[current_index] - 5]++;
		}
		int current_sorted_index = 0;
		for(int current_age_counter = 0; current_age_counter < 17; current_age_counter++ )
		{
			while (age_counters[current_age_counter] > 0)
			{
				sorted_array[current_sorted_index] = current_age_counter + 5;
				age_counters[current_age_counter]--;
				current_sorted_index++;
			}
		}
		System.out.println(Arrays.toString(sorted_array));
		return sorted_array;
	}
    
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
    //James Cunningham's method
    public static int[] Sort(int[] arrayS) {
        int[] sortedarray = new int[arrayS.length];

        for (int i = 0; i <= 20; i++) {
            for (int j = i; j <= 20; j++) {

                if (sortedarray[i] > sortedarray[i + 1]) {
                    int temp = sortedarray[j];
                    sortedarray[j] = sortedarray[j - 1];
                    sortedarray[j - 1] = temp;
                }
            }

        }

        return sortedarray;
    }
    
    
  }
}
