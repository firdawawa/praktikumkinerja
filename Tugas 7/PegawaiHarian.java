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
public class PegawaiHarian extends Pegawai{
    
    private double upahPerJam;
    private int totalJam;
    
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }
    
    public int getTotalJam() {
        return totalJam;
    }
    
     public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }
     
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    
    @Override
    public double gaji() {
        if (this.totalJam <= 40) {
            return (getUpahPerJam() * getTotalJam());
        } else {
            return ((getUpahPerJam() * 40) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5));
        }
    }

     @Override
    public String toString() {
        return "Pegawai Harian\t : " + getNama() + "\nNo. KTP \t : " + getNoKTP() + "\nUpah/jam\t : " + getUpahPerJam()+ "\nTotal Jam Kerja\t : " + getTotalJam() + "\nPendapatan\t : Rp." + (int) gaji();
    }
}
