/*
 * Nama     : Firdausi Baiq Ardana
 * NIM      : 215150707111039
 * Prodi    : Teknologi Informasi
 * Kelas    : E
 */
package prakexceptionhandling;

/**
 *
 * @author ACER
 */
public class Titan extends Character{
    
    public Titan(){
        setHP(200);
        setAttack(45);
    }
 
    @Override
    public boolean attack(){
        int random = (int)((Math.random() * 100) + 1);
 
        if (random <= 40){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Role        : Titan");
        System.out.println("HP          : " + getHP());
        System.out.println("Attack      : " + getAttack());
        System.out.println("Defense     : " + getDefense());
    }


}