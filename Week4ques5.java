/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4ques5;

/**
 *
 * 
 */
public class Week4ques5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO SUM THE DIGITS OF AN INTEGER
        int n=1560;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("THE SUM OF THE DIGITS IS: "+sum);
    }
    
}
