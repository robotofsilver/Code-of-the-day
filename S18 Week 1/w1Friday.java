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
	  
	  String result = "";
        String [] array = str.split(" ");
        //System.out.println(array.length);
        if(str.length() < 4){
            return str;
            }
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
            int n = array[i].length();
            if(n < 4)
            {   
                result += array[i]+ " ";
                continue;
            }
            result += array[i].substring(0, 1) +(n-2) + array[i].charAt(n-1) +" ";   
        }
        return result;
    
    
    
  }
  private static StringBuilder abriviate(String c) {//Rushabh's Method
		// TODO Auto-generated method stub
		String[] array=c.split(" ");
		StringBuilder newer=new StringBuilder();
		for(int i=0;i<array.length;i++) {
			if(array[i].length()<=3) {
				newer.append(array[i]+" ");
				
			}else {
				
				int j=array[i].length()-2;
				char c1=array[i].charAt(0);
				char d=array[i].charAt(array[i].length()-1);
				newer.append(c1+Integer.toString(j)+d+" ");
				
			}
		}
		return newer;
	}
	

	 public static String sepStr(String str) // Daniel's Method
       {
        String[] array = str.split(" ");

        String temp = "";
        
        for(int i = 0; i < array.length; i++) 
        {
            if(array[i].length() > 3)
            {
                temp += newWord(array[i]) + " ";
            }
            else
            {
                temp += array[i] + " ";
            }   
        }
        
        return temp;
    }


	public static String abbSent(String sent) { //Kevin's Code
        String[] arr = sent.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder temp = new StringBuilder();
            if (arr[i].length() > 3) {
                arr[i] = temp.append(arr[i].charAt(0) + ((arr[i].length() - 2) + "") + arr[i].charAt(arr[i].length() - 1)).toString();
            }
        }
        String retString = arr[0];
        for(int i = 1; i < arr.length; i++) {
            retString += (" " + arr[i]);
        }
        return retString;
    }
	
	public static String check_divisibility(String given)	//Martin Lennan's method
	{
	String[] split_words = given.split(" ");
	String to_return = "";
	for (int current_word = 0; current_word < split_words.length; current_word++)
	{
		if (split_words[current_word].length() > 3)
		{
			split_words[current_word] = "" + split_words[current_word].charAt(0) + (split_words[current_word].length()-2) + 
								split_words[current_word].charAt(split_words[current_word].length()-1);
		}
	}

	for (int current_word = 0; current_word < split_words.length; current_word++)
	{
		to_return += split_words[current_word] + " ";
	}

	return to_return;
	}
	
  public static String JamesC(String words){
	  
	  
  }
  public static String KevinPhac(String words){
	  
	  
  }
  public static String JordeG(String words){
	  
	  
  }
	
	

}
