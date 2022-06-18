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
public class Healer extends Character{
    
    public Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }
 
 
    public void heal(){
        setHP(getHP() + 25);
    }
 
    @Override
    public boolean attack(){
        int random = (int)((Math.random() * 100) + 1);
        
        if (random <= 85){
            return true;
        }else{
            return false;
        }
    }
 
    @Override
    public void info() {
        super.info();
        System.out.println("Role        : Healer");
        System.out.println("HP          : " + getHP());
        System.out.println("Attack      : " + getAttack());
        System.out.println("Defense     : " + getDefense());
    }
    
    
}