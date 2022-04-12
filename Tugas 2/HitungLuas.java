/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package hitungluas;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class HitungLuas {

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
      
        int menu = input.nextInt();
        /* 1 = Persegi
           2 = Segitiga
           3 = Lingkaran */

        if(menu == 1){
            int sisip = input.nextInt();
            
            Persegi hasilp = new Persegi(sisip);
            System.out.println(hasilp.luas());
            
        }else if(menu == 2){
            int alass = input.nextInt();
            int tinggis = input.nextInt();
            
            Segitiga hasils = new Segitiga(alass, tinggis);
            System.out.println(hasils.luas());
                
        }else if(menu == 3){
            int jari2l = input.nextInt();   
            
            Lingkaran hasill = new Lingkaran(jari2l);
            System.out.println(hasill.luas());
            
                
        }else{
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    
    
    static class Persegi {
    private int sisip;
    private int luas;
    
    
    Persegi(int sisipersegi){
        sisip = sisipersegi;
        
    }
    
    int luas(){
        luas = sisip*sisip;
        return luas;
    }

    
}
    static class Segitiga {
    private int alass;
    private int tinggis;
    int luas;
    
    
    Segitiga(int alassegitiga, int tinggisegitiga){
        alass = alassegitiga;
        tinggis = tinggisegitiga;
        
    }
    
    int luas(){
        luas = (alass*tinggis)/2;
        return luas;
    }

    
}
    static class Lingkaran {
    private int jari2l;
    double luas;
    
    
    Lingkaran(int jari2lingkaran){
        jari2l = jari2lingkaran;
        
    }
    
    double luas(){
        if(jari2l % 7 == 0){
            double phi = 22/7;
            luas = phi*(jari2l*jari2l);
            return luas;
        }else{
            double phi = 3.14;
            luas = phi*(jari2l*jari2l);
            return (int)luas;
        }
        
    }

}
    
}
