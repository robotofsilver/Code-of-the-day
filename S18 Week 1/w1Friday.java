public class w1Friday{


  public static void main(String [] args){
      /**
         * 
         * Make a method that accepts a string 
         * that consists of multiple of words and 
         * only abbreviates the words that have a 
         * length of 4 or greater.
         * 
         * 
         * But if the string has only one word of length 3 or less
         * just return the string.
         * 
         * example:
         * 
         * "Hello World and to the mass universe"
        //    5     5    3   2  3    4     8     // note that words of length
        *                                        // 3 or less are not abbreviated
         * 
         * output: 
         * 
         *  "H3o W3d and to the m2s u6e"
         * 
        
        */
  
  
  }
  public static String AlvaroMethod(String str){
    
    
    
  }
  
  //Martin Lennan's method
  	public static String first_between_last(String given_string)
	{
		String converted_string = "";
		String[] words_split = given_string.split(" ");
		for (int current_string_index = 0; current_string_index < words_split.length; current_string_index++)
		{
			if (words_split[current_string_index].length() > 3)
			{
				converted_string += "" + words_split[current_string_index].charAt(0) + (words_split[current_string_index].length()-2) + 
									words_split[current_string_index].charAt(words_split[current_string_index].length()-1);
			}
			else
			{
				converted_string += words_split[current_string_index];
			}
			converted_string += " ";
		}
		return converted_string;
	}

}
