/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5ques4;

/**
 *
 * 
 */
public class Week5ques4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO FIND MIN AND MAX IN THE ARRAY
        int a[]={1,67,8,45,3};
        int l=a.length;
        int min=a[0];
        int max=a[0];
        for(int i=1;i<l;i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("THE MAX NUMBER IN THE ARRAY IS :"+ max);
        System.out.println("THE MIN NUMBER IN THE ARRAY IS :"+ min);
    }
    
}
