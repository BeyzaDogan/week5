//Adım1=Başla
//Adım2=klavyeden bir sayi(S) al
//Adım3=eğer a=0;
//Adım4=a>S ise git adım10
//Adım5=eğer b=0;
//Adım6=b>S ise git adım10
//Adım7= eğer S=a*a+b*b ise yaz"a-b"
//Adım8=a++ ve git adım4
//Adım9=b++ ve git adım6
//Adım10=a ile b yi yazdır
//Adım11=bitir
import java.util.Scanner;
public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       System.out.println("lütfen bir sayı giriniz:");
       int S=input.nextInt();
       
       for(int a=0;a<=S;a++){
                   for(int b=0;b<=S;b++){
       
       if(S==a*a+b*b){
           System.out.println(a+"-"+b);
       }
                   
       }       

        
    }
    
}
    
}
