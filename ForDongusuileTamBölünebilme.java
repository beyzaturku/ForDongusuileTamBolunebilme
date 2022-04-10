package fordongusuiletambölünebilme;
import java.util.*;
public class ForDongusuileTamBölünebilme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int number = input.nextInt();
        int sayac =0;
        int toplam=0;
        for(int i=0; i<number ; i++)
        {
          if(i%3==0 && i%4==0 ){
              sayac++;
              toplam += i;
              
          }
         
        }
        
        System.out.println("Ortalama:" + " " + (toplam/sayac));
        
    }
    
}
