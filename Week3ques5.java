/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3ques5;
import java.util.Scanner;
/**
 *
 *
 */
public class Week3ques5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO TAKE A NUMBER DIVIDE IT BY 2 AND PRINT THE RESULT UNTILL THE NUMBER BECOMES LESS THAN 10
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n=sc.nextInt();
        while(n>10){
            n=n/2;
            if(n>10)
            System.out.println(n);
           }
       
          
            
        
            
            
        
    
    
}
}
