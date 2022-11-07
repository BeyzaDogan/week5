
import java.util.Scanner;

//kullanıcıdan pozitif tamsayı girene kadar döngü


public class example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int sayi;
        do{
            System.out.print("lütfen pozitif br tamsayı giriniz:");
            sayi=input.nextInt();
        }while(sayi<0);
           System.out.println("girilen sayı:"+sayi);
           /*
           System.out.print("lütfen pozitif bir tamsayı giriniz:);
           int sayi=input.nextInt();
           while(sayi<=0)
           {
           System.out.print("lütfen pozitif bir tamsayı giriniz:");
           sayi=input.nextInt();
           */
    }
    
}
