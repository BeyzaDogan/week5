//0'dan küçğk veya 100'den büyük sayıları kabul etmeyen program

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
      int sayi;
       do{
           System.out.print("lütfen 0 ve 100 arasında sayı giriniz: ");
           sayi=input.nextInt();
           
       }while(sayi<0|| sayi>100);
       System.out.println("girilen sayı:"+sayi);
       
       

    }
    
}
