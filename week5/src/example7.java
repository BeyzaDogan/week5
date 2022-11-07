
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java. util.Scanner;

public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       System.out.println("istediğiniz satır sayısını girin:");
       int a=input.nextInt();
       
        for (int i = 1; i <=a; i++) {
            
        
           for(int j=1;j<=i;j++){
           System.out.print("*");
           }
           System.out.println();
       }
      
    }
    
}

