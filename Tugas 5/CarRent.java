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
public class CarRent {
    
    private CarRider rider;
    private Car car;
    private int rentDur;
    
    public CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }
    
    public CarRider getRider(){
        return rider;
    }
    
    public Car getCar(){
        return car;
    }
    
    public int getRentDur(){
        return rentDur;
    }
}
