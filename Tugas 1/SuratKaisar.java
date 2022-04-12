/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package suratkaisar;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class SuratKaisar {     
       
    static void suratKaisar(){
                        
      Scanner input = new Scanner (System.in);
            
       String kalimat;
       int n;
       String s = "";
       char abjad;
        
       kalimat = input.nextLine();
       n = input.nextInt();      

       for(int i=0; i<kalimat.length(); i++){
           abjad = kalimat.charAt(i);
           
           if(abjad >= 'A' && abjad <= 'Z'){
               abjad = (char)(abjad + n);
               
               if(abjad > 'Z'){
                   abjad = (char)(abjad + 'A' - 'Z' - 1);
               } 
                              
           }else if
               (abjad >= 'a' && abjad <= 'z'){
               abjad = (char)(abjad + n);
               
               if(abjad > 'z'){
                   abjad = (char)(abjad + 'a' - 'z' - 1);
               }    
           }else{
              
           }s = s + abjad;
       }System.out.println(s);
        }              
    public static void main(String[] args) {    
        suratKaisar();

}
}