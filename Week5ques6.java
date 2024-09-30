/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5ques6;
import java.util.Scanner;
/**
 *
 *
 */
public class Week5ques6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO IMPLEMENT LINEAR SEARCH
        Scanner sc=new Scanner(System.in);
        int a[]={2,56,7,89};
        System.out.println("ENTER THE VALUE TO BE SEARCHED : ");
        int n=sc.nextInt();
        int l= a.length;
        boolean flag=false;
        for(int i=0;i<l;i++){
           
            if(a[i]==n){
                System.out.println(i);
                System.out.println("VALUE FOUND");
               flag=true;
               break;
            }
            
           
        }
        if(flag==false)
            System.out.println("not found");
    }
    
}
