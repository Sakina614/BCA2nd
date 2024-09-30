/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4ques3;

/**
 *
 * @author sakin
 */
public class Week4ques3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO PRINT THE PATTERN
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int k=1;k<=i;k++)
                 System.out.print(k+" ");
            for(int l=i-1;l>0;l--)
                System.out.print(l+" ");
            System.out.println();
                
        
    }
    
}
}
