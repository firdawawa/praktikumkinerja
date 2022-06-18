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
public class Pegawai {
    
    private String nama, noKTP;
    
    public Pegawai() {
    }
    
    public Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }
    
    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    @Override
    public String toString() {
        return toString();
    }

    public double gaji() {
        return gaji();
    }
}