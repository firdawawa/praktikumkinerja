/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package selde;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Selde {

       static void Selde(){
       Scanner input = new Scanner(System.in);

       int i, bilPolindrome, j;
       int jumlah = 0;

        bilPolindrome = input.nextInt();
        
        j = bilPolindrome;
        while(bilPolindrome>0){
            i = bilPolindrome%10;
            jumlah = (jumlah*10) + i;
            bilPolindrome = bilPolindrome/10;
        }
        
        if (j==jumlah)
            System.out.println(j + " adalah selde.");
        else
            System.out.println(j + " bukan selde.");
       
    }

       public static void main(String[] args) {
        Selde();
}
}
