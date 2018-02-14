/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teeest;

import java.util.Scanner;

/**
 *
 * @author Berna
 */
public class Tuesday {

    /**
     * Maria P.
     */
    
    static String fizzBuzz(int n){
        if((n%3 == 0) && (n%5 == 0))
            return "FizzBuzz";
        else if(n%3 == 0)
            return "Fizz";
        else if(n%5 == 0)
            return "Buzz";
        return "Something Broke.";
        }
    
    private static String divide(int number) {//Rushabh's Method
		// Checking if its divisible by 3 5 and 3 and 5 both
		String value=" ";
		if(number%3==0) {
			value="Fizz";
		}
		if(number%5 == 0) {
			value="Buzz";
		}
		if(number%5 == 0 && number%3==0) {
			value="Fizz_Buzz";
		}
		
		return value;
	}
        
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      System.out.println(fizzBuzz(input.nextInt()));
    }
    
}


//Ariel's Mathod
	public static String Method(int num){
		String result = "";
		if (num%3 == 0 && num%5==0){
			result ="fizzbuzz";
		}
		else if (num%3 == 0){
			result ="fizz";
		}
		else if(num%5 ==0){
		result = "buzz";
		}
		
		return result;
	}

//Martin Lennan's method
	public static String check_divisibility(int given)
	{
		if ( (given % 3) == 0)
		{
			if ( (given % 5) == 0)
			{
				return "fizzbuzz";
			}
			return "fizz";
		}
		if ( (given % 5) == 0)
		{
			return "buzz";
		}
		return "";
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

public static String fizzBuzz(int num) { //Kevin's Method
        String str = "";
        if(num % 3 == 0) {
            str += "Fizz";
            if(num % 5 == 0) {
                str += "Buzz";
            }
        }
        else if(num % 5 == 0) {
            str += "Buzz";
        }
        return str;
    }

public static void divisibleByThreeFive(int n)	//Esther's method
	{
		if(n%3 == 0 && n%5 == 0)
		{
			System.out.println("fizzbuzz");
		}
		else if(n%3 == 0)
		{
			System.out.println("fizz");
		}
		else if(n%5 == 0)
		{
			System.out.println("buzz");
		}
		
	}


