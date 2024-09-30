/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5ques5;

/**
 *
 * @author sakin
 */
public class Week5ques5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO PRINT ALL PRIME NUMEBRS BETWEEN 0 AND 100
        
        System.out.println("Prime numbers between 0 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;  // Assume the number is prime

            // Check if the number is divisible by any number from 2 to i-1
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {  // If divisible, it's not prime
                    isPrime = false;
                    break;  // Exit the inner loop since we found a divisor
                }
            }

            // If the number is still considered prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
              
            
          }   
            
        }
      
         
          
        
            
        
        
    }
}


    
    

