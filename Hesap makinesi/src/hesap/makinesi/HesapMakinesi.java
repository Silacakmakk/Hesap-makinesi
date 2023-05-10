/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesap.makinesi;

import java.util.Scanner;

/**
 *
 * @author Sıla
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       while(true){
            Scanner scanner=new Scanner(System.in);
            double sayi1, sayi2;
            System.out.println("Toplama(1), fark(2), bolme(3), carpma(4) cikis(5):");
            int secim = scanner.nextInt();
            switch(secim){
                case 1:
                   double toplam;
                   System.out.println("Sayi1 ve Sayi2 yi giriniz: ");
                   sayi1=scanner.nextDouble();
                   sayi2=scanner.nextDouble();
                   toplam=sayi1 + sayi2;
                   System.out.println("toplam sonucunuz:"+toplam);
                   break;
                case 2:
                    double fark;
                   System.out.println("Sayi1 ve Sayi2 yi giriniz: ");
                   sayi1=scanner.nextDouble();
                   sayi2=scanner.nextDouble();
                   fark =sayi1 - sayi2;
                   System.out.println("fark sonucunuz:"+Math.abs(fark));
                   break;
                case 3:
                   double bolum;
                   System.out.println("Sayi1 ve Sayi2 yi giriniz: ");
                   sayi1=scanner.nextDouble();
                   sayi2=scanner.nextDouble();
                   bolum =sayi1 / sayi2;
                   System.out.println("bolum sonucunuz:"+ bolum);
                   break;
                case 4:
                   double carpma;
                   System.out.println("Sayi1 ve Sayi2 yi giriniz: ");
                   sayi1=scanner.nextDouble();
                   sayi2=scanner.nextDouble();
                   carpma =sayi1 * sayi2;
                   System.out.println("carpma sonucunuz:"+ carpma);
                   break;
                
                   
                default:
                    
                   System.out.println("Böyle bir deger barındırmıyorum");
                   break;
                    
                    
                    
                     
            }
            
           
           
           
       }
    }
    
}
