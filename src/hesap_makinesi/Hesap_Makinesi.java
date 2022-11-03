
package hesap_makinesi;

import java.util.Scanner;
public class Hesap_Makinesi {

    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, islem;
        System.out.print("İlk sayiyi giriniz:");
        sayi1 = scan.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        sayi2 = scan.nextInt();
        System.out.print("Yapmak istediginiz islemi seciniz.");
        System.out.print("\n1- Toplama \n 2- Cikarma\n 3-carpma\n 4-bolme\n");
        islem = scan.nextInt();
        switch(islem)
        {
                case 1:
                {
                    System.out.print("Sonuc = " + (sayi1 + sayi2));
                    break;
                }
                case 2:
                {
                    System.out.print("Sonuc = " + (sayi1 - sayi2));
                    break;
                }
                    
                case 3:
                {
                    System.out.print("Sonuc = " + (sayi1 * sayi2));
                    break;
                }
                    
                case 4:
                {
                    System.out.print("Sonuc = " + (sayi1 / sayi2));
                    break;
                }
                    
                
        }
    }
    
}
