/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan21.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program menghitung saldo tabungan
 */
public class PBO11K10118904Latihan21ProgramRataRataNilai {

    public static Scanner input = new Scanner(System.in);
    public static void hitungratarata(int i){
        int jumlah = 0, n;
        double ratarata;
        for (int j=1 ; j<=i ; j++){
            System.out.print("Nilai Mahasiswa ke-"+ j +" : ");
            n = input.nextInt();
            jumlah = jumlah + n;
        }
        ratarata = (double) jumlah/i;
        System.out.println("Maka, rata-rata nilainya adalah "+ratarata);
        System.out.println("Developed by : Firman Alfinas");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.print("Masukan banyaknya mahasiswa : ");
        n  = input.nextInt();
        hitungratarata(n);
    }
    
}
