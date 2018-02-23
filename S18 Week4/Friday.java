public friday {
  public static void main(String[] args {
    String str = "This is a lame string";
    //Create a method that reverses a string using a stack.
    //Output: gnirts emal a si sihT
  }

  public static String reverseString(String str) { //Kevin's code
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            str2.append(stack.pop());
        }
        return str2.toString();
    }
                          
     public static String stackMethod(String str)//Daniel;s Method
    {
        Stack stack1 = new Stack();

        for (int i = 0; i <= str.length() -1 ; i++) 
        {
            stack1.push(str.charAt(i));
        }

        String bob = "";

        while(!(stack1.isEmpty()))
        {
            bob += stack1.pop();
        }

        return bob;
    }


}
