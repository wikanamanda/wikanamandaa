/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wahanaa.java;

import java.util.Scanner;

/**
 *
 * @author wikan
 */
public class WahanaaJava {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, harga =0;
    String mengulang;
    
    do {
        
        System.out.println("SELAMAT DATANG DI WAHANA RUSAK INI");
        System.out.println("SILAHKAN MEMILIH WAHANA YANG ANDA INGINGKAN");
        System.out.println("1.Baling Baling Bambu");
        System.out.println("2.Jungkat Jungkit Jahanam");
        System.out.println("3.Seluncur batu");
        System.out.println("4.Lompat jurang");
        System.out.println("masukkan pilihan wahana anda: ");
        a = input.nextInt();
                
        System.out.println("-----------------------------------------------");
        
        switch (a) {
            case 1:
                System.out.println("Wahana baling baling bambu =  Rp.30000");
                harga = 30000;
                break;
            case 2:
                System.out.println("Wahana jungkat jungkit jahanam = Rp.25000");
                harga = 25000;
                break;
             case 3:
                System.out.println("Wahana seluncur batu = Rp.32000");
                harga = 32000;
                break;   
            case 4:
                System.out.println("Wahana lompat jurang= Rp.55000");
                harga =55000;
                break;
            default:
                System.out.println("MAAF WAHANA ANDA TIDAK ADA DISINI");
        }
        
           System.out.println("---------------------------------------");
        
        System.out.println("Apakah anda yakin dengan pilihannya? ");
        mengulang = input.next();
    } while (mengulang.equals("tidak"));
    
        System.out.println("------------------------------------------");
        
        System.out.println("masukkan Uang yang anda miliki = ");
        int uang = input.nextInt();
        int kembalian = uang - harga;
        
        System.out.println("------------------------------------------");
        
        if (uang>harga) {
            System.out.println("kembalian anda sebesar = Rp"+ kembalian +"terimakasih selamat menikmati");
        } else if (uang<harga){
            System.out.println("Uang andaaa tidak cukup");
        }
    }
    
}

