public class w1Thursday{

 public static void main(String [] args){
  // Method that accepts a string that consists of one word.
  // and returns an abbreivation of it which consists of the first letter,
  // the number of letters in between the first and the last, and the last letter.
  // 
  // Example: 
  //       " Hello"
         
  // Output: H3o
         
   
   String h = "Hello";

   System.out.println(stringConvert(h));
 }
 public static String method(String str){  // Alvaro's 
        int n = str.length();
        return str.substring(0, 1) + (n-2) + str.charAt(n-1);
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


public static String numMethod(String word){ //Ariel's Method
	return  ("" +word.charAt(0) + (word.length()-2)+ word.charAt(word.length()-1)); 
}

public static StringBuilder convertString(String scs){ //Rushabh's Method		 +}
 		int i=scs.length()-2;		
 		char c=scs.charAt(0);		
 		char d=scs.charAt(scs.length()-1);		
 		StringBuilder sc=new StringBuilder();		
 		sc.append(c);		
 		sc.append(i);		
 		sc.append(d);		
 		System.out.print(sc);		
 		return sc;		
 	}		
 		
 static String work(String input){ //juancarlos's method		
 		int length = input.length();		
 				
 		String work = input.charAt(0) + String.valueOf(length-2) + input.charAt(length-1);		
 		return work;		
 				
	}

public static String stringConvert(String a)	//Esther's method
	{	
		int length_of_subst = a.length() - 2;	//length of mid substring
		String subst = a.substring(1, a.length()-1);	//mid substring
		a = a.replace(subst, ""+length_of_subst);		//replace(oldChar, newChar);
		
		return a;
	}
 public static String first_num_last(String given) //Martin Lennan's code
 {
	return "" + given.charAt(0) + (given.length()-2) + given.charAt(given.length()-1);
 }
	
public static String Rushdah(String a) 
 {

	 
 }	
	 
	 
