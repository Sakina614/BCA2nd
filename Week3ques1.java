/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3ques1;
import java.util.Scanner;
/**
 *
 * 
 */
public class Week3ques1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO CHECK IF A NUMBER IS EVEN OR ODD
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int n= sc.nextInt();
        if(n%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
        
    }
    
}
