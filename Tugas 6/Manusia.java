/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package inheritancebikinibottom;

/**
 *
 * @author ACER
 */
public class Manusia {
    
    String nama;
    String NIK;
    boolean jenisKelamin; //laki-laki = trus || perempuan = false
    boolean statusKawin;
    double tunjangan;
    static int jumlahManusia = 0;
    
    public String getNama(){
        return nama;
    }
    
    public String getNIK(){
        return NIK;
    }
    
    public boolean getJenisKelamin(){
        return jenisKelamin;
    }
    
    public boolean getStatusKawin(){
        return statusKawin;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNIK(String NIK){
        this.NIK = NIK;
    }
    
    public void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public void setStatusKawin(boolean statusKawin){
        this.statusKawin = statusKawin;
    }
    
    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean statusKawin){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.statusKawin = statusKawin;
    }
    
    public double getTunjangan(){
        if(statusKawin == true && jenisKelamin == true){
            tunjangan = 25;
        }
        else if(statusKawin == true && jenisKelamin == false){
            tunjangan = 20;
        }
        else if(statusKawin == false){
            tunjangan = 15;
        }
        return tunjangan;
    }
    
    public double getPendapatan(){
        return getTunjangan();
    }
    
    public void totalManusia(){
        System.out.println(jumlahManusia);
 }
    
    @Override
    public String toString(){
        System.out.println("Nama            : " + getNama());
        System.out.println("NIK             : " + getNIK());
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Pendapatan      : $" + getPendapatan());
        return "";
    }
}