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
public class Warrior extends Character{
    
    public Warrior(){
        setHP(80);
        setAttack(25);
        setDefense(30);
    }
 
    @Override
    public boolean attack(){
        int random = (int)((Math.random() * 100) + 1);
 
        if (random <= 60){
            return true;
        }else{
            return false;
        }
    }
 
    @Override
    public void info(){
        super.info();
        System.out.println("Role        : Warrior");
        System.out.println("HP          : " + getHP());
        System.out.println("Attack      : " + getAttack());
        System.out.println("Defense     : " + getDefense());
    }



}