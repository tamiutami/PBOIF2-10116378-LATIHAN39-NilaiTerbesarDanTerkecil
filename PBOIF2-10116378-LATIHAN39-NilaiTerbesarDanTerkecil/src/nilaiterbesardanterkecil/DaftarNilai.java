/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-IF2
 * Nim   : 10116378
 */
class DaftarNilai {
    public int jumlahMhs;
    public int nBesar = 0;
    public int nKecil = 100;
    public int nilaiMhs[] = new int[40];
    Scanner scn = new Scanner(System.in);

    public void inputJumlahMhs(){
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scn.nextInt();
    }

    public int hitungNilaiTerbesar(int i) {
        return nBesar = ((nBesar<=nilaiMhs[i])?nilaiMhs[i]:nBesar);
    }

    public int hitungNilaiTerkecil(int i) {
        return nKecil = ((nKecil>=nilaiMhs[i])?nilaiMhs[i]:nKecil);
    }

    public void hasilNilaiMhs(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" = "+nilaiMhs[i]+"\n");
        }
}
    
    
}
