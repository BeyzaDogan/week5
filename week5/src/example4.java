//Sınav sorusu olabilir


import java.util.Scanner;
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input=new Scanner(System.in);
      System.out.println("klavyeden bir b sayısı giriniz:");
      int b=input.nextInt();
      
      for(int a=1;a<99;a++){
         if(b==a*a*a-a*a){
         System.out.println("a:"+a);
      }
      }
      
    }
     
      

        
        
    }
    

