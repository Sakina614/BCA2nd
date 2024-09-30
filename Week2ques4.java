/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2ques4;
import java.util.Scanner;
/**
 *
 */
public class Week2ques4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO TAKE THREE NUMBERS AS INPUT AND PRINT ITS AVERAGE
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER THE  SECOND NUMBER:");
        int b=sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER:");
        int c=sc.nextInt();
        double avg=(a+b+c)/3;
        System.out.println(" THE AVERAGE OF THESE THREE NUMBERS IS:"+avg);
        
        
    }
    
}
