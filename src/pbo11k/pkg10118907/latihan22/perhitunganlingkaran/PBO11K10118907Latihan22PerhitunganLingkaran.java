/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menghitung lingkaran
 * 
 */
public class PBO11K10118907Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nilai;
        double jari, luas, keliling, nilai2;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            Scanner scanner = new Scanner(System.in);
            nilai = scanner.next();
            if(isNumeric(nilai)) {
                nilai2 = Double.parseDouble(nilai);
                
                jari = jari(nilai2);
                luas = luas(nilai2);
                keliling = keliling(nilai2);
                
                
                System.out.println("Jari-jari lingkaran : "+jari+" cm");
                System.out.println("Luas lingkaran : "+luas+" cm");
                System.out.println("Keliling lingkaran : "+keliling+" cm");
            } else {
                System.out.println("Nilai diameter tidak sesuai ");
            }
        } while(!isNumeric(nilai));
    }
    
    /**
     * Taken and inspired from
     * https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
     * Question from Craig Angus - https://stackoverflow.com/users/15352/craig-angus
     * Solution from CraigTP - https://stackoverflow.com/users/57477/craigtp and Javad Besharati - https://stackoverflow.com/users/7022036/javad-besharati
     */
    public static boolean isNumeric(String nilai) {
        try {
            Double.parseDouble(nilai);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static double jari(double nilai) {
        double jari;
        
        jari = 0.5 * nilai;
        
        return jari;
    }
    
    public static double keliling(double nilai) {
        double keliling, jari;
        
        jari = jari(nilai);
        keliling = 2 * 3.14 * jari;
        
        return keliling;
    }
    
    public static double luas(double nilai) {
        double luas, jari;
        
        jari = jari(nilai);
        luas = 3.14 * (jari*jari);
        
        return luas;
    }
}
