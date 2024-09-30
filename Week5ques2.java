/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5ques2;
import java.util.Scanner;
/**
 *
 * 
 */
public class Week5ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO CHECK IF A NUMBER OS PRIME OR NOT
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int n= sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        } if(flag)
            System.out.println("prime");
        else
            System.out.println("not prime");
                
            
           
       
    }
    
}
