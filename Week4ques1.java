/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4ques1;
import java.util.Scanner;
/**
 *
 * @author sakin
 */
public class Week4ques1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO INSERT 10,20,30.... IN AN ARRAY AND DISPLAY THEM
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("ENTER THE "+i+"ELEMENT OF THE ARRAY");
            a[i]=sc.nextInt();
        }
        System.out.println("THE ELEMENTS OF THE ARRAY ARE");
        for(int e:a){
            System.out.println(e);
        }
        
        
    }
    
    
}
