/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18077
 */
public class Tree{
    Tag root;
    
    public void insert(String word, int AyatNo){
        Tag f = find(word);
        if(f == null){
            Tag n = new Tag(word);
            if(root == null){
                root = n;
            } else {
                Tag temp = root;
                Tag prev = root;
                while(temp != null){
                    prev = temp;
                    if(word.compareTo(temp.word) < 0){
                        temp = temp.left;
                    } else {
                        temp = temp.right;
                    }
                }
                if(word.compareTo(prev.word) < 0){
                    prev.left = n;
                } else {
                    prev.right = n;
                }
            }
            n.insertAyat(AyatNo);
        } else {
            f.insertAyat(AyatNo);
        }
    }
    
    public String toString(){
        return toString(root) + " ";
    }
    
    public String toString(Tag n){
        if(n == null){
            return "";
        }
        return toString(n.left) + " " + n.word + " " + toString(n.right);
    }
    
    public void traverse() {
        traverse(root);
        System.out.println();
    }
    
    public void traverse(Tag n){
        if(n != null){
            traverse(n.left);
            System.out.print(n.word + ", ");
            traverse(n.right);
        }
    }
    
    public Tag find(String key){
        Tag temp = root;
        while(temp != null){
            if(key.compareTo(temp.word) < 0){
                temp = temp.left;
            } else if(key.compareTo(temp.word) == 0){
                break;
            } else {
                temp = temp.right;
            }
        }
        return temp;
    }
}
