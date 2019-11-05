/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan47.nilai.mahasiswa;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Nilai Mahasiswa
 */

public class IF0110118016Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        Index objI = new Index();
        
        System.out.print("QUIZ : ");
        objI.setQuis(sc1.nextDouble());
        System.out.print("UTS : ");
        objI.setUts(sc2.nextDouble());
        System.out.print("UAS : ");
        objI.setUas(sc3.nextDouble());
        
        System.out.println("");
        System.out.println("Nilai Akhir = "+objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
    }
    
}
