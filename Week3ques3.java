/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3ques3;
import java.util.Scanner;
/**
 *
 * 
 */
public class Week3ques3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO TAKE A NUMBER AS AN INPIT AND PRINT ITS MULTIPLICATION TABLE
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
    }
    
}
}
