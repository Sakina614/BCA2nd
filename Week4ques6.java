/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4ques6;
import java.util.Scanner;
/**
 *
 * 
 */
public class Week4ques6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO CALCULATE THE FACTORIAL OF A NUMBER
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int n= sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        
    }
        System.out.println("THE FACTORIAL OF THE NUMBER IS : "+fact);
    }
    
}
