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
  }
}
