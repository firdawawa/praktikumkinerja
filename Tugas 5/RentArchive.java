/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package arraylist5;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class RentArchive {
    
    private static ArrayList <CarRent> rentData = new ArrayList<CarRent>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
        CarRent carrents = new CarRent(rider, car, rentDur);
        rentData.add(carrents);
    }
    
    public void info(){
        System.out.println("======================================");
        System.out.println("             CUSTOMER DATA");
        System.out.println("======================================");
            
            for (CarRent custdata : RentArchive.rentData){
                System.out.println("NAMA PEMINJAM   : " + custdata.getRider().getName());
                System.out.println("TIPE MOBIL      : " + custdata.getCar().getCarType());
                System.out.println("NO. POLISI      : " + custdata.getCar().getPolNum());
                System.out.println("LAMA RENTAL     : " + custdata.getRentDur());
                System.out.println("--------------------------------------------");
            }
    }
}
