/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package arraylist5;

/**
 *
 * @author ACER
 */
public class Main {


    public static void main(String[] args) {
        
        CarRider theriders1 = new CarRider ("Park Chan-yeol", 30, "+82117654");
        CarRider theriders2 = new CarRider ("Park Hyung-sik", 31, "+82139087");
        CarRider theriders3 = new CarRider ("Lee Min-ho", 35, "+82154238");
        CarRider theriders4 = new CarRider ("Ji Chang-wook", 35, "+82187530");
       
        CarData cardata = new CarData();
        cardata.addCar("SPORT", "H 411 O", "BMW");
        cardata.addCar("TRUCK", "J 150 O", "MITSUBISHI");
        cardata.addCar("SEDAN", "L 15 A", "TOYOTA");
        cardata.addCar("SUV", "K 353 L", "HYUNDAI");
        cardata.listOfCar();
        
        RentArchive rentarchive = new RentArchive();
        rentarchive.Rent(theriders1, cardata.getCarList().get(0), 7);
        rentarchive.Rent(theriders2, cardata.getCarList().get(1), 2);
        rentarchive.Rent(theriders3, cardata.getCarList().get(2), 10);
        rentarchive.Rent(theriders4, cardata.getCarList().get(3), 24);
    
        System.out.println("");
        Car.status();
        
        System.out.println("");
        rentarchive.info();
    }
    
}
