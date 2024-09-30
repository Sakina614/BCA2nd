/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4ques4;
import java.util.Scanner;
/**
 *
 * 
 */
public class Week4ques4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO SUM THE SERIES
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TERMS: ");
        double n=sc.nextDouble();
        double sum=0;
        for(double i=1;i<=n;i++)
            sum=sum+(1/i);
         System.out.println("THE SUM OF THE SERIES IS : "+sum);
    }
    
}
