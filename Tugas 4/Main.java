/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package merchant;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        
        DataMerchant merc = new DataMerchant();
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.showData();
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant(DataMerchant.input.nextLine(), DataMerchant.input.nextLine(), DataMerchant.input.nextDouble()));
        DataMerchant.showData();    
        
                
    }
    }
    