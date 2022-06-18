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
public class Magician extends Character{
    
    public Magician(){
        setHP(100);
        setAttack(60);
        setDefense(10);
    }
    
    @Override
    public boolean attack(){
        int random = (int)((Math.random() * 100) + 1);
        
        if (random <= 35){
            return true;
        }else{
            return false;
        }
    }
 
    @Override
    public void info() {
        super.info();
        System.out.println("Role        : Magician");
        System.out.println("HP          : " + getHP());
        System.out.println("Attack      : " + getAttack());
        System.out.println("Defense     : " + getDefense());
    }
    
    
}