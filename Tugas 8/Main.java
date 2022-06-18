/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package prakexceptionhandling;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int role = 0;
        int count = 0;
     
        System.out.println("Selamat Datang Di Game Defend FILKOM!");
        System.out.print("\nSilahkan masukkan nama player : ");
        String player = input.nextLine();
 
        boolean bool = true;

        while (true) {
            bool = true;
            System.out.println("Silahkan pilih karakter yang Anda inginkan : ");
            System.out.println("1. Magician"); 
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            System.out.println();
 
            try {
                String inputkarakter = input.nextLine();
                role = Integer.valueOf(inputkarakter);
            }
 
            catch (Exception e) {
                bool = false;
            }
 
            if (bool && role > 0 && role < 4) {
                break;
            }
            else if (!bool) {
                System.out.println("Masukkan yang diterima hanya berupa angka!");
            }
            else {
                System.out.println("Pilih sesuai opsi yang tersedia!");
            }
        }
 
        Titan titan = new Titan();
        Character karakter = null;
        System.out.print("\nSelamat datang, " + player + " !\n");
 
        switch (role) {
        case 1:
            karakter = new Magician();
            karakter.info();
        break;
 
        case 2:
            karakter = new Healer();
            ((Healer) karakter).info();
        break;
 
        case 3:
            karakter = new Warrior();
            ((Warrior) karakter).info();
        break;
 
        default:
        }

        while (titan.getHP() > 0 && karakter.getHP() > 0) {
        count++;
        System.out.printf("========== TURN %d ========= %n", count);
        System.out.println("Enemy's HP\t= " + titan.getHP());
        System.out.printf("%s's HP \t= %d %n ", player, karakter.getHP());

            if (count % 2 == 0 && karakter instanceof Healer) {
                ((Healer) karakter).heal();
            }
 
            if (titan.attack() == true) {
                karakter.receiveDamage(titan.getAttack());
            }
        }
 
        if (titan.getHP() <= 0) {
            titan.setHP(0);
        }else if (karakter.getHP() <= 0) {
            karakter.setHP(0);
        }

        String output = titan.getHP() <= 0 ? player : "Titan";
        System.out.println("");
        System.out.println(output + " MENANG!\n");
        System.out.println("\n========== PLAYER ==========");
        karakter.info();
        System.out.println("\n========== MUSUH ==========");
        titan.info();

    }

}