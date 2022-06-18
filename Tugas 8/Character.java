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
public abstract class Character{
    
    private int defense = 0;
    private int attack = 0;
    private int HP = 0;
    
    
    public int getDefense(){
        return defense;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public int getHP(){
        return HP;
    }
    
    public void setDefense(int defense){
        this.defense = defense;
    }
        
    public void setAttack(int attack){
        this.attack = attack;
    }  
 
    public void setHP(int HP){
        this.HP = HP;
    }
    
    public abstract boolean attack();
 
    public void receiveDamage(int damage){
        if (damage > getDefense()){
            int sisa = damage - getDefense();
            setHP(getHP() - (sisa));
        }
    }
 
    public void info(){
        System.out.println("------------ \tSTATUS\t ------------");
    }
    
    
}