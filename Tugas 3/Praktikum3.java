/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package praktikum3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Praktikum3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Jaket jaket = new Jaket();
        System.out.println("     ERIGO STORE MALANG");
        System.out.println("\nMenyediakan :");
        System.out.println("Jaket A dengan harga : 100000");
        System.out.println("Jaket B dengan harga : 125000");
        System.out.println("Jaket C dengan harga : 175000");
        System.out.println("-----------------------------");
        System.out.print("Tipe Baju Yang Dibeli : ");
        String tipe = input.nextLine();
        
            if (tipe.equalsIgnoreCase("a")){
               jaket.hargaJaketA();
            }
            else if (tipe.equalsIgnoreCase("b")){
                jaket.hargaJaketB();
            }
            else if (tipe.equalsIgnoreCase("c")){
                jaket.hargaJaketC();
            }
        
    }
}