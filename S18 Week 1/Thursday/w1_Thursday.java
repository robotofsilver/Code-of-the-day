public class Thursday{

 public static void main(String [] args){
  // Method that accepts a string that consists of one word.
  // and returns an abbreivation of it which consists of the first letter,
  // the number of letters in between the first and the last, and the last letter.
  // 
  // Example: 
  //       " Hello"
         
  // Output: H3o
         
         
         
         
 }


 public static String abbreviate(String word) { //Kevin's Method
        char[] charWord = word.toCharArray();
        StringBuilder abbWord = new StringBuilder();
        abbWord.append(charWord[0] + ((charWord.length-2) + "") + charWord[charWord.length-1]);
        return abbWord.toString();
    }

 public static String newWord(String n)  // Daniel's Method
    {
        int num = n.length() - 2;
        char a = n.charAt(0);
        char b = n.charAt(n.length() -1);
        String temp = a + Integer.toString(num) + b;
        
        return temp;
    }
}

//Ariel's Method
public static String numMethod(String word){
		return  ("" +word.charAt(0) + (word.length()-2)+ word.charAt(word.length()-1)); 
	}

//Martin Lennan's method
	public static String first_between_last(String given_string)
	{
		return ("" + given_string.charAt(0) + (given_string.length()-2) + given_string.charAt(given_string.length()-1));
	}
