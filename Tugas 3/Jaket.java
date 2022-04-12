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
public class Jaket {
    Scanner input = new Scanner(System.in);
    String tipe;
    int harga;
    int jumlah;
    int diskon;
    
    public void Jaket (String type, int price, int buy){
        tipe = type;
        harga = price;
        jumlah = buy;
    }
    
    final int jaketA = 100000;
    final int jaketB = 125000;
    final int jaketC = 175000;
    
    public String getTipe(){
        return tipe;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public double getJumlah(){
        return jumlah;
    }
    
    void setTipe(String type){
        this.tipe = type;
    }
    
    void setJumlah (int buy){
        this.jumlah = buy;
}
    
    void hargaJaketA(){
        System.out.print("Jumlah Baju Yang Dibeli : ");
        jumlah = input.nextInt();
        
        if(jumlah > 100){
        
            diskon = jaketA-5000;
            harga = jumlah*diskon;
            System.out.println("Jenis Jaket Yang Dibeli : A");
            System.out.println("Harga Jual per Jaket    : " +diskon);
            System.out.println("Total Harga             : " +harga);
            
        }else{
        
            harga = jumlah*jaketA;
            System.out.println("Jenis Jaket Yang Dibeli : A");
            System.out.println("Harga Jual per Jaket    : " +jaketA);
            System.out.println("Total Harga             : " +harga);
        }
    }
    
    void hargaJaketB(){
        System.out.print("Jumlah Baju Yang Dibeli : ");
        jumlah = input.nextInt();
        
        if(jumlah > 100){
        
            diskon = jaketB-5000;
            harga = jumlah*diskon;
            System.out.println("Jenis Jaket Yang Dibeli : B");
            System.out.println("Harga Jual per Jaket    : " +diskon);
            System.out.println("Total Harga             : " +harga);
            
        }else{
        
            harga = jumlah*jaketB;
            System.out.println("Jenis Jaket Yang Dibeli : B");
            System.out.println("Harga Jual per Jaket    : " +jaketB);
            System.out.println("Total Harga             : " +harga);
        }
    }
    
    void hargaJaketC(){
        System.out.print("Jumlah Baju Yang Dibeli : ");
        jumlah = input.nextInt();
        
        if(jumlah > 100){
        
            diskon = jaketC-15000;
            harga = jumlah*diskon;
            System.out.println("Jenis Jaket Yang Dibeli : C");
            System.out.println("Harga Jual per Jaket    : " +diskon);
            System.out.println("Total Harga             : " +harga);
            
        }else{
        
            harga = jumlah*jaketC;
            System.out.println("Jenis Jaket Yang Dibeli : C");
            System.out.println("Harga Jual per Jaket    : " +jaketC);
            System.out.println("Total Harga             : " +harga);
        }
    
}
}
