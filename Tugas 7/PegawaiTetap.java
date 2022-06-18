/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package prakpolimorfisme;

/**
 *
 * @author ACER
 */
public class PegawaiTetap extends Pegawai {
    
    private double upah;
    
    public PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }
    
    public void setUpah(double upah) {
        this.upah = upah;
    }
        
    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        return upah;
    }

    @Override
    public String toString() {
        return "Pegawai Tetap\t : " + getNama() + "\nNo. KTP \t : " + getNoKTP() + "\nUpah\t\t : " + getUpah() + "\nPendapatan\t : Rp." + (int) gaji();
    }
}