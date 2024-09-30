/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5ques3;

/**
 *
 * @author sakin
 */
public class Week5ques3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO SWAP FIRST AND LAST ELEMENT OF THE ARRAY
        int a[]={1,34,5,78,0};
        int temp;
        int l=a.length;
        System.out.println("THE FIRST ELEMENT BEFORE SWAPING: "+a[0]);
        System.out.println("THE LAST ELEMENT BEFORE SWAPING: "+a[l-1]);
        temp=a[0];
        a[0]=a[l-1];
        a[l-1]=temp;
        System.out.println("THE FIRST ELEMENT AFTER SWAPING: "+a[0]);
        System.out.println("THE LAST ELEMENT AFTER SWAPING: "+a[l-1]);
     
        
    }
    
    
    }
