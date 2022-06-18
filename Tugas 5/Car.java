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
public class Car {
    
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;
    
    public Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }
    
    public Car(String carType, String polNum, String merk){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
    }
    
    public String getCarType(){
        return carType;
    }
    
    public String getPolNum(){
        return polNum;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public boolean isStatus(){
        return status;
    }
    
    public static void setStatus(String status){
        if(status == "true"){
            System.out.println("MOBIL BERHASIL DISEWA!");
            
    }else{
            System.out.println("MAAF, MOBIL SUDAH DISEWA!");
        }
    }
    
    public static void status(){
        Car.setStatus("true");
        Car.setStatus("false");
        Car.setStatus("true");
        Car.setStatus("false");
 }
}
