/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.doublylinkedlist;

/**
 *
 * @author Mansoor Ahmed
 */
public class DoublyLinkedList<AnyType>  {
    
           Node head;
           Node tail;
             int Length=0;    
           
    DoublyLinkedList(){
    
   this.head = null;
    this.tail = null;
    
    }
    
    private class Node{
          
        Node next;
        Node prev;
        AnyType data;
           Node (AnyType data,Node prev,Node next){
                 this.data = data;
                 this.next = prev;
                 this.prev = next;
         
              }
    } 
    public void addFirst(AnyType data){
        Node newNode = new Node (data,null,null);     
        if(head == null){
            
            head = newNode;
            tail = newNode;     
         Length++;
        }
        else{
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
    Length++;
    }    
    }     
   
    
        
        
    
    
    public void ShowForward(){
    
        if (head == null){
            System.out.println("List is empty....!");
        }
        else{
        
          Node currNode = head;
          
          while(currNode !=null){
          
              System.out.println(currNode.data);
          
          currNode = currNode.next;
       
          }
            System.out.println("END");        
        }
        
    }
    
          public void ShowBackward(){
          
         if (head == null){
            System.out.println("List is empty....!");
        } 
          
     else {
               Node currNode = tail;
               
               while(currNode != null){
           
                   System.out.println(currNode.data);
               
               currNode = currNode.prev;
               
               }
        
               System.out.println("List printed");
         }
          
          
          }
    
    
    public void addLast(AnyType data){
    
            Node newNode = new Node (data,null,null);     
        if(head == null){
            
            head = newNode;
            tail = newNode;     
        Length++;
        } 
    
        else {
                   tail.next = newNode;
                   newNode.prev = tail;
                     
                   tail = newNode;
        Length++;
        
        }
    
    
    }
    
    public void DeleteFirst(){
          
        
       if(head == null){
         
            System.out.println("List is empty....!");
        }
       else {
                   
                head = head.next;
                head.prev = null;
       Length--; 
       
       }
    
    }
    
    public void DeleteLast(){
        
       if(head == null){
         
            System.out.println("List is empty....!");
        }
       else {
            
            tail = tail.prev;
            tail.next = null; 
                   
       Length--;
       }
      
    }
    
    public int GetSize(){
    int Size = Length;
            if(head == null){
         
            System.out.println("There are no Nodes....!");
        }
    
        System.out.println("the size of This List is: "+Size);
    
    
        return Size;
    }
    
    public void Clear(){
    
             if(head == null){
         
            System.out.println("The List is already Empty...!");
        }
             else {
                 
             head =null;
             tail = null;
                 System.out.println("All nodes Deleted....!");
             }
    }
           public boolean isEmpty(){
               
               if(head == null){
         
            System.out.println("List is Empty...!");
        
               return true;
               }  
               System.out.println("List contains Nodes");         
     
               return false;
           }
           
         public int FindNode(AnyType data){
            
             int index = 0;
             
                if(head == null) {
            System.out.println("List has No Nodes...!");
                }
         
                else {
                
                    Node currNode = head;
              while (currNode != null){
              
                  if(currNode.data == data){
                     
                      System.out.println("The index of provided Node is: "+index);
                      break;
                  }
              currNode = currNode.next;
                  ++index;
                  }  
              
                }
         return index;
         }  
           
   public void removeAt(int indx){
           int index = 1;
         if(head == null) {
            System.out.println("List does not contain any Nodes...!");
                }
         else if(index == indx){
              DeleteFirst();
      
         }
         else  {
               Node currNode = head;
               Node LastNode = head.next;
            while(LastNode != null){
                  
                 if(index == indx){
                 
                 currNode.next = LastNode.next;
                 LastNode.next.prev = currNode;
                 LastNode.prev = null;
                 
                      break;
                 }
                 currNode = currNode.next;
            LastNode = LastNode.next;
           
            index++;   
            }
         
    
         }
  
   }        
           
  public void addAt(AnyType data,int indx){
  
          int index = 1;
  Node newNode = new Node(data,null,null);
       if(indx == 0){
       
       addFirst(data);
       
       }
       else {
                  Node prevNode = head;
                  Node currNode = head.next;
              
           while (currNode != null) {
                   
                     if(index == indx){
                     
                     newNode.next = currNode;
                     prevNode.next = newNode;
                     newNode.prev = prevNode;
                     currNode.prev = newNode;
                     
                               }
                      currNode = currNode.next;
                      prevNode = prevNode.next;
                                index++;               
                          }
        }
             
           }
           
       
       
       
       
       
  
  
  
  

    public static void main(String[] args) {
        DoublyLinkedList <String> obj = new DoublyLinkedList();
         
            obj.addFirst("List");
            obj.addFirst("a");
            obj.addFirst("is");
            obj.addFirst("This");     
            obj.addLast("and");
            obj.addLast("Welcome");
            obj.addLast("to");
            obj.addLast("the");
            obj.addLast("world");
            obj.addLast("of");
            obj.addLast("data");
            obj.addLast("Structures");
            
            
            
          obj.ShowForward();
            System.out.println("##########");
     //       obj.GetSize();
//  obj.removeAt(8);

obj.addAt("Jaaaanu", 5);
//     obj.Clear();
        //    obj.GetSize();
//     obj.ShowBackward();
      //    obj.DeleteFirst();
 
   //   System.out.println("##########");
      
      //       obj.DeleteLast();
    //  obj.GetSize();
      //   obj.isEmpty();
    
   obj.ShowForward();
    }
}
