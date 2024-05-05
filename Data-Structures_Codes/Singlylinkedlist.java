/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singlylinkedlist;

import java.util.Scanner;

/**
 *
 * @author Irfan
 */
public class Singlylinkedlist<AnyType> {
    
    Node head;
    Node tial;

    public Singlylinkedlist() {
        this.head = null;
        this.tial = null;
    }
    
    private class Node{
        
        AnyType data;
        Node next;

        public Node(AnyType data, Node next) {
            this.data = data;
            this.next = next;
        }
        
        
        
        
    }
    
    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("Singly Linkedlist does not exit ");
            
        }
        else{
            while(temp!=null){
                
                System.out.println(temp.data);
                temp = temp.next;
                
            }
        }
        
    }
    
    public void addfirst(AnyType data){
        
       
        if(head==null){
             Node temp = new Node(data , null);
             head=temp;
             tial=temp;
           
        }
        else{
            Node temp = new Node(data , null);
            temp.next=head;
            head=temp;
            
        }
        
    }
    
    public void addlast(AnyType data){
        
        if(head==null){
            addfirst(data);
        }
        else{
            Node temp = new Node(data , null);
            tial.next=temp;
            tial=temp;
            
        }
    }
    
    public void deletefirst(){
        
        if(head==null){
            System.out.println(" There is no node bhai ");
        }
        else{
            
            head=head.next;
        }
        
    }
    public void deletelast(){
        
        if(head==null){
            System.out.println("Sorry bhai ");
            
        }
        else{
            Node temp = head;
            Node ptr = temp.next;
            while(ptr.next!=null){
                temp=ptr;
                ptr=ptr.next;
                
            }
            
            temp.next=null;
            tial=temp;
            
        }
        
        
    }
    public void clear(){
        
        if(head==null){
            
            System.out.println("Sorry bhai");
            
        }
        else{
            head=null;
            tial=null;
            
        }
        
    }
    public void getsize(){
        Node newNode = head;
        int size = 0;
        while(newNode != null){
            ++size;
            newNode = newNode.next;
        }
        
        System.out.println("Total Nodes in SLL : "+size);
    }
    
    public boolean empty(){
        if(head==null&&tial==null){
            System.out.println("True");
            return true;
        }
        else{
            
            System.out.println("False");
            return false;
        }
        
    }
    public void findNode(AnyType data){
        
        Node temp = head;
        int index =-1;
        
        if(head==null){
            System.out.println("Sorry bhai");
        }
        else{
            
            while(temp!=null){
                
                ++index;
                if(temp.data==data){
                    System.out.println(" Node index number is : "+index);
                    
                    
                }
                temp=temp.next;
            }
            
        }
        
        
        
    }
    public void removeAnyindex(){
        
        Node temp=head;
        
        Node ptr = temp.next;
        
        if(head==null){
            
            System.out.println("Sorry bhai ");
        }
        else{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the index number :   ");
            int index = sc.nextInt();
            
            for (int i = 0; i <index-1; i++) {
                
                temp=temp.next;
                ptr= ptr.next;
                
            }
            temp.next=ptr.next;
            
            
        }
        
        
    }
    public void Marge(Singlylinkedlist list , Singlylinkedlist list1){
        
        list.tial.next=list1.head;
        list.tial=list1.tial;
         
    }

    public static void main(String[] args) {
       
        
        Singlylinkedlist <Integer> list =  new Singlylinkedlist();
        list.addfirst(4);
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.addfirst(8);
        
        list.display();
        Singlylinkedlist <Integer> list1 = new Singlylinkedlist();
        list1.addfirst(3);
                list1.addfirst(2);
        list1.addfirst(1);

        list1.display();
        System.out.println("______________________________________");
        list.Marge(list, list1);
        
//        System.out.println("****************************");
//
//        list.addlast("I Know one thing");
//                        list.addlast("that is nothing");
//
//        list.display();
        
//        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//        list.deletefirst();
//        list.display();
//        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//        list.deletelast();
//        list.display();
        
//        System.out.println("############################");
//       
//       
//       list.clear();
//        list.display();
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        list.getsize();
//      list.display();
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        list.empty();
//       
//System.out.println("$$$$$$$$$$$$$$$$$$$$$$4");
//list.findNode("Zaheer");
//        
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
//        list.removeAnyindex();
//        list.display();
//        
    }
}
