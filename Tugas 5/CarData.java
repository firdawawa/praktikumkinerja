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
public class CarData {
    
    private static ArrayList <Car> carList = new ArrayList<Car>();
    
    public void addCar(String carType, String polNum, String merk){
        Car thecar = new Car(carType, polNum, merk);
        carList.add(thecar);
    }
    
    public ArrayList<Car> getCarList(){
        return carList;
    }
    
    public void listOfCar(){
        System.out.println("======================================");
        System.out.println("              CAR MENU");
        System.out.println("======================================");
            
            for (Car cardata : carList){
                System.out.println("TIPE MOBIL      : " + cardata.getCarType());
                System.out.println("NO. POLISI      : " + cardata.getPolNum());
                System.out.println("MERK MOBIL      : " + cardata.getMerk());
                System.out.println("--------------------------------------------");
            }
    }
}
