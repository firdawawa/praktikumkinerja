/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package prakpolimorfisme;

/**
 *
 * @author ACER
 */
public class Main {


    public static void main(String[] args) {

        Pegawai pegawai;
        pegawai = new Pegawai();
        System.out.println("=================================================");
        pegawai = new PegawaiTetap("Park Chanyeol", "3503982711920001", 2000000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("Byun Baekhyun", "3204230605920003", 1500000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("Oh Sehun", "3506291204940001", 1500000);
        System.out.println(pegawai.toString());
        
        
        System.out.println("\n=================================================");
        pegawai = new PegawaiHarian("Michael Yuan", "3511430810900001", 300000, 50);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("Vivian Deborah", "3511420902960002", 100000, 40);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("Ryu Kai", "3511431503180001", 50000, 40);
        System.out.println(pegawai.toString());
        
        
        System.out.println("\n=================================================");
        pegawai = new Sales("Jia Li", "3511431312940003", 55, 60000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Alma Adalbaro", "3511461609200002", 60, 30000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Lilian Gladiel", "3511423004990001", 50, 40000);
        System.out.println(pegawai.toString());

    }
}