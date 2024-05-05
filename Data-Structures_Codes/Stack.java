/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stack;

/**
 *
 * @author Irfan
 */
public class Stack<AnyType> {
    
    Node push;
    Node pop;

    public Stack() {
        push = null;
        this.pop = null;
    }
    
    
     private class Node {

        
        Node next;
        AnyType data;
        
        Node(AnyType data, Node next){
        
            this.next = next;
            this.data = data;
        
        }
        



}
    
       public void printStack(){
        
        
            Node temp = push;
            
            if(temp  == null)
                System.out.println("No Node in Stack");
            
            else{
            
            
                
                while(temp!=null){
                
                    System.out.println(temp.data);
                    temp = temp.next;
                
                }
            
            
            }
            
        
        
        
        }
        
    public void push(AnyType data){
        
     
        if(push==null){
            Node temp = new Node(data ,null);
          push=temp;
          pop=temp;
        }
        else{
           Node temp = new Node(data ,null);
            temp.next=push;
            push=temp;
        }
        
    }
    public Node pop(){
        
        if(push==null){
            System.out.println("nothing");
        }
        else{
           Node pop =(Node) push.data;
           push=push.next;
        }
        Node data = null;
        return data;
    }

    
    
    
    
    
    public static void main(String[] args) {
        
        Stack <String> list = new Stack<>();
//         Runtime rt = Runtime.getRuntime();
//        
//        rt.gc();
//       // rt.availableProcessors();
//        System.out.println("Processor is : "+rt.availableProcessors());
//       long start =  System.nanoTime();
//        
//       long end =  System.nanoTime();
//          
//         long timeComplexity = end - start;
//          
//          System.out.println("Total time taken: "+timeComplexity);
//         
//          
//          
//          
//          
//          rt.gc();
//          long spaceComplexity = rt.totalMemory()-rt.freeMemory();
//          
//          System.out.println("Space complexity is: "+spaceComplexity/1024+" Kbs");
//        System.out.println(list);    
       list.push("Irfan");
       list.push("Ali ");
        list.push("Narejo");
       //list.pop();
        
        list.printStack();
        
        
        
        
    }
}
