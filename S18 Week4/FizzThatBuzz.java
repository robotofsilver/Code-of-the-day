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
public class FizzThatBuzz {

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
        
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      System.out.println(fizzBuzz(input.nextInt()));
    }
    
}
