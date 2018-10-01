/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * Nama      : Aditya Suheryana
 * Nim       : 10117104
 * Kelas     : IF-3/PBO3
 * Deskripsi : Menghitung dan menampilkan Program Perhitungan Lingkaran
 *
 */
public class PBO310117104Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String D;
    double diameter,l,r,k;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("===========Perhiutungan Lingkaran============");
        do{
        System.out.printf("Masukan Nilai Diameter Lingkaran : ");
        D = scn.next();
        
            System.out.println((!D.matches("[0-9]*"))?" Nilai Diameter "
                    +"Tidak Sesuai\n":"");
        }
        while(!D.matches("[0-9]*"));
        
        System.out.println("========Hasil Perhitungan Lingkungan=============");
        diameter = Double.parseDouble(D);
        r = diameter/2;
        l = Math.PI*r*r;
        k = Math.PI*2*r;
        System.out.printf("Jari-jari lingkaran = %.0f cm %n",r);
        System.out.printf("Luas lingkaran      = %.2f cm %n",l);
        System.out.printf("Keliling lingkaran  = %.2f cm %n",k);
    }
        
        
  
        
    }
    

    

