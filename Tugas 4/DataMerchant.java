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
public class DataMerchant {
        
    
    static Scanner input = new Scanner (System.in);
    static Merchant merc[] = new Merchant[0];
    
    public static Merchant[] addMerchant(Merchant merchant){
        Merchant[] add = new Merchant[merc.length+1];
            for (int i=0; i<merc.length; i++){
                add[i] = merc[i];
         }
            add[merc.length] = merchant;
            return add;
    }

    public static void showData(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : " +mch1.getMerchantName());
            System.out.println("Nama Produk     : " +mch1.getProductName());
            System.out.println("Harga           : " +(int)mch1.getPrice());
        }
    }
    
        public static Merchant findMerchant(String namaMerchant){
            return null;
        }
        
        public static void showMerchant(Merchant merchant){

        }
        
        public static void updateMerchant(Merchant merchant){
            
        }
}