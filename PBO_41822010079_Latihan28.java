/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_41822010079_latihan28;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Adjeng Rara Rengganis 
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
public class PBO_41822010079_Latihan28 
{

    public static void main(String[] args) 
    {
        System.out.println("Format Tugas PBO");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        // Mengonversi ke huruf besar
        String hurufBesar = kalimat.toUpperCase();

        // Mengonversi ke huruf kecil
        String hurufKecil = kalimat.toLowerCase();

        // Menampilkan hasil
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Huruf Kecil: " + hurufKecil);
    }
}
