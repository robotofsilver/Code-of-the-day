
public class tuesday {
    
    public static void main(String[] args) {
        
        //
        
        
        
        
        String str = " 2 5 6 7 4 3";
        
        method(str);
        
    }
    public static int [] method(String str) // Alvaro's method
    {
        int length = 0;
        for (int i = 0; i < 10; i++) {
            
            String letter = str.substring(i, i+1);
            if (letter.equals(" ")) {
                length++;      
            }
        }
        length++;
        int num[] = new int[length];
        
    
        for (int i = 0,j=0; i < str.length(); i++) {
            
            String ch = str.substring(i,i+1);
            
            if(ch.matches("[0-9]"))
            {
                num[j] = Integer.parseInt(str.substring(i,i+1));
                j++;
            }
                
        }
        
        //for (int i = 0; i < num.length; i++) {
        //    System.out.println(num[i]);
        //}
        
        return num;
    }
    
    
    public static int[] string_to_positive_array(String integer_string)     //Martin Lennan's method
	    {
		int array_length = 1;
		for (int current_character = 0; current_character < integer_string.length(); current_character++)
		{
			if (integer_string.charAt(current_character) == ' ')
			{
				array_length++;
			}
		}
		
		int[] integer_array = new int[array_length];
		
		for (int current_character = 0, current_index = 0; current_character < integer_string.length(); current_character++)
		{
			String current_integer = "";
			if (integer_string.charAt(current_character) != ' ')
			{
				for (	;
					(current_character < integer_string.length()) && (integer_string.charAt(current_character) != ' ');
					current_character++)
				{
					current_integer = current_integer + integer_string.charAt(current_character);
				}
			}
			integer_array[current_index] = Integer.parseInt(current_integer);
			System.out.println(Integer.parseInt(current_integer));
			current_index++;
		}
		
		return integer_array;
	    }
}
