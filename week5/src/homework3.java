


import java.util.Scanner;

public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("LÜTFEN BİR SAYI GİRİNİZ:");
        int S=input.nextInt();
       
        
        for(int a=0;a<=S;a+=3){
           for(int b=0;b<=S;b+=5){
           if(a+b==S){
           System.out.println(a/3+"ve"+b/5);
          
           
             
           } 
      
           
               
                
          
           }
        }

    }
    
}

