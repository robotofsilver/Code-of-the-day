public class thursday{


    public static void main(String [] args){
    
        // Fizz Buzz 
    
    
    }



static String change(int x){//juancarlos method

		
		if(x%3 == 0 && x%5 == 0){
			return "FizzBuzz";
		}else if(x%3==0){
			return "fizz";
		}
		else if(x%5==0){
			return "Buzz";
		}
		return null;
	}

	public static String retStr(int n) // Daniel's Method
    { 
         String temp = "";
        if((n%15) == 0)
        {
            temp = "Fizzbuzz";
        }
        else if((n%5) == 0)
        {
            temp= "Buzz";
        }
        else if((n%3)== 0)
        {
            temp= "Fizz";
        }
            
       return temp;
    }


}
