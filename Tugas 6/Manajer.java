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
public class Manajer extends Pekerja{
    
    private int lamaKerja;
    static int jumlahManager = 0;
 
    public Manajer(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
    super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }
    
    public int getLamaKerja() {
        return lamaKerja;
    }
 
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
 
    public double BonusManager(){
        return Bonus() * 0.35;
    }
 
    public void totalManager(){
        System.out.println(jumlahManager);
    }
 
    @Override
    public String toString() {
        jumlahManager++;
    return "\nNama\t\t : "+ getNama() +"\nNIK\t\t : " + getNIK() +"\nJenisKelamin\t : " + (jenisKelamin?"LakiLaki" : "Perempuan") + "\nPendapatan\t : " + (getPendapatan()+Bonus()+BonusManager()+Gaji() + 15)+"$" +"\nBonus\t\t : " + (Bonus()+BonusManager())+"$" +"\nGaji\t\t : " + Gaji()+"$" + "\nStatus\t\t : " + getStatus() + "\nLama Kerja\t : " + getLamaKerja() + " hari";
    }
 
}