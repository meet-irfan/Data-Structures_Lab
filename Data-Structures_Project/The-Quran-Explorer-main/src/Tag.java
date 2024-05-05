
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18077
 */
public class Tag {
    public String word;
    public Tag left;
    public Tag right;
    
    protected LinkedList<Integer> Ayats;
    
    public Tag(String word){
        this.word = word;
        Ayats = new LinkedList<>();
    }
    
    public void insertAyat(int AyatNo){
        Ayats.add(AyatNo);
    }
    
    public LinkedList<Integer> getAyats(){
        return Ayats;
    }
    
    @Override
    public String toString(){
        return "[" + word + " - " + Ayats + "]";
    }
}
