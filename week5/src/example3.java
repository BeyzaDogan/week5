
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
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       int a;
       do{
       System.out.println("lütfen 0 ve 100 arasında vize notunu giriniz:");
        a=input.nextInt();
       

    }
       while(a<0 || a>100);
      System.out.println("girilen vize:"+a);
      
    int b;
    do{
        System.out.println("lütfen 0 ve 100 arasında final notunu giriniz:");
        b=input.nextInt();
    }while(a<0 || a>100);
     System.out.println("girilen final notu:"+b);
     
    double x=a*0.4;
    double y=b*0.6;
    double ort=(double )(x+y);
    

    
  if (ort>=80 && ort <=100) {
        System.out.println("A");
    }
  
  else if (ort<=79 && ort>=60){
  System.out.println("B");
}
 else if (ort<=59 && ort>=50){
     System.out.println("C");
}
  else{
   System.out.println("D");
}

}
}

