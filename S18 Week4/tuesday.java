public class tuesdays{
  
  
  public static void main(String arg[]){
    String checking = "A Man, A Plan, A Canal-Panama!";
    tuesdays t=new tuesdays();
    if(t.palindrome){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
  }
  public boolean palindromeCheck(String checking) { // Rushabh's Method
		boolean validity=false;//predicting that the string is not palindrome
		int counter=0;//Intializing a counter
		for(int i=0;i<checking.length();i++) {
			for(int j=checking.length()-1;j>=0;j--) {
				if(checking.charAt(i) == checking.charAt(j)) {
					counter++;//Checking howmany characters are matching
					break;
				}
			}
		}
		if(counter==checking.length()) { // if the counter and the length of the string matches 
			validity=true;//makes the boolean true
		}
		return validity;
	}

	public static boolean checkPalendrome(String str) { //Kevin's method
        	return str.trim().replaceAll("\\W", "").equalsIgnoreCase(new StringBuilder(str.trim().replaceAll("\\W", "")).reverse().toString());
    	}




}
