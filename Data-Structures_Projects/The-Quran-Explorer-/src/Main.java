
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 18077
 */
public class Main {
    
    public static String FilePath = "C:\\Users\\Irfan\\Desktop\\DS Project\\src";
    
    public static void main(String[] args){
        //fileSort();
        FirstForm form = new FirstForm();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }
    
    public static void fileSort(){
        try {
            LinkedList<String>[] list = new LinkedList[26];
            for(int i = 0 ; i < list.length; i++){
                list[i] = new LinkedList<String>();
            }
            BufferedReader reader = new BufferedReader(new FileReader(FilePath + "\\input.txt"));
            String line = reader.readLine();
            while(line != null){
                list[line.charAt(0) - 97].add(line);
                line = reader.readLine();
            }
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(FilePath + "\\output.txt"));
            for(int i = 0; i < 26; i++){
                Divide(0,list[i].size()-1, list[i], writer);
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("Wordlist file not found");
        }
    }
    
    public static void Divide(int f, int r, LinkedList list, BufferedWriter writer) throws IOException{
        int m = (f + r)/2;
        if(f <= r){
            writer.write((String) list.get(m) + "\n");
            Divide(f,m - 1, list, writer);
            Divide(m + 1,r, list, writer);
        }
    }
}
