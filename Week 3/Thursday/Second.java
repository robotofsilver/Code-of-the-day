public class Second{
  
  public static void main(String []args)
  {
      // Make a method that accepts an int array and 
      //Print 2 sums : one for postives and one for negatives
      //
      //output:
      //positive: ##
      //negative: ##
      int [] array = {2,4,6,-5,7,2,-5,6,10,-35,66};
      
  }
  public static void (int [] array) // Alvaro' method
  {
      
      
      
  }
  
  public static void sumPosNeg(int[] a)   //Esther's method
	{
		int sumP = 0;
		int sumN = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > 0)
			{
				sumP = sumP + a[i];
			}
			else
			{
				sumN = sumN + a[i];
			}
		}
		
		System.out.println("Positive: " + sumP);
		System.out.println("Negative: " + sumN);
	}
	
	public static void Second(int [] array) // Martin's method
	  {
		  int positive = 0, negative = 0;
	      for(int i = 0; i < array.length; i++)
	      {
	    	  	if(array[i] >= 0)
	    	  	{
	    	  		positive = positive + array[i];
	    	  	}
	    	  	else
	    	  	{
	    	  		negative = negative + array[i];
	    	  	}
	      }
	      
	      System.out.println("Positive sum: " + positive);
	      System.out.println("Negative sum: " + negative);
	  }
	
	
	public static void positive_negitive_sums(int[] array_to_sum) //Martin Lennan's method
	{
		int negative_sum = 0;
		int positive_sum = 0;
		
		for (int current_index = 0; current_index < array_to_sum.length; current_index++)
		{
			 if (array_to_sum[current_index] < 0)
			 {
				 negative_sum += array_to_sum[current_index];
			 }
			 else
			 {
				 positive_sum += array_to_sum[current_index];
			 }
		}
		System.out.println("negative: " + negative_sum + "\npositive: " + positive_sum);
	}


}
