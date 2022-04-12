/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package merchant;

/**
 *
 * @author ACER
 */
public class Merchant {
    
        private static String merchantName;
        private static String productName;
        private static double price;
        
        Merchant(String namaMerchant, String namaProduk, double harga){
            merchantName = namaMerchant;
            productName = namaProduk;
            price = harga;
        }
        
        public String getMerchantName(){
            return this.merchantName;
        }
        
        public String getProductName(){
            return this.productName;
        }
        
        public double getPrice(){
            return this.price;
        }
        
        public void setMerchantName(String nama){
            nama = merchantName;
        }
        
        public void setProductName(String pname){
            pname = productName;
        }
        
        public void setPrice(double rego){
            rego = price;
        }
     
}
