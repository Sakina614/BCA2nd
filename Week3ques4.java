/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3ques4;
import java.util.Scanner;
/**
 *
 * 
 */
public class Week3ques4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TO PRINT SUM  THE OF 1+2+3+4+5+.....+N SERIRS
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("THE SUM OF N TERMS IS :"+sum);
        
        
    
    }
    
}

    
    

