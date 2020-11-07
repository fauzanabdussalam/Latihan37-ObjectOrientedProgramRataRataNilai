/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan37.programrataratanilai;

/**
 *
 * @author User
 */
public class Mahasiswa 
{
    public static void hitungRataRataNilai(int jumlahMahasiswa, double totalNilai)
    {
        double rataRata;
        
        rataRata = totalNilai / jumlahMahasiswa;
        
        System.out.println("Maka, rata-rata nilainya adalah : " + rataRata);
    }
}
