


import java.util.Scanner;

public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       System.out.println("istediğiniz sütun sayısını giriniz:");
       int a=input.nextInt();
       for(int i=1;i<=a;i++){
             for(int j=a;j>=i;j--){
                 System.out.print("*");
                 
             }
         System.out.println();
       }

        
    }
    
}
