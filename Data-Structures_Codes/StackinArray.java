/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackinarray;

/**
 *
 * @author Sardar Malik
 */
public class StackinArray<T> {

    int top = 0;
    int length = 100;
    private Node[] stack = new Node[length];
 
//public T[ ] st = (T[ ]) new Object[100];

    public boolean Push(T data) {
        if (top != length) {
            stack[top++] = new Node(data);
            return true;
        }
        return false;
    }
public boolean isEmpty()
   {
      return top==-1;
   }

 public void clear()
   {
      for(int i = 0; i <= top; i++)
         stack[i] = null;

      top = -1;
   }
 public StackinArray merge2(StackinArray a,StackinArray b){
 StackinArray newstack = new StackinArray();
 newstack.length = a.length+b.length;
 for(int i = 0; i<=a.top; i++){
 newstack.Push(a.pop());
 }
 for(int i = 0; i<=b.top; i++){
 newstack.Push(b.pop());
 }
 return newstack;
 }
    public T pop() {
        if (stack[0] != null) {
            T data = (T) stack[top - 1].data;
            stack[top - 1] = null;
            top = top - 1;
            return data;
        }
        return null;
    }

    public void display() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println("Element" + i + ":" + stack[i].data);
        }
    }
   

   
    private class Node<T> {

        T data;

        Node(T data) {
            this.data = data;
        }

    }
    
    public void peek()
    {
        if(top != length)
        {System.out.println("THE PEEK ELEMENT IS::"+stack[top-1].data);
        }
        else
        {
            System.out.println("THE STACK IS EMPTY::");
        }
    }
    public boolean merge(StackinArray stack2){
        if(stack2 != null){
            int count = stack2.top;
        for (int i = 0; i <= stack2.top+1; i++) {
            
            this.Push((T)stack2.pop());
            
        }
        return true;
    }
        return false;
    }

    public static void main(String[] args) {
StackinArray stack = new StackinArray();
        StackinArray<Integer> stack1= new StackinArray<>();
        stack1.Push(1);
        stack1.Push(2);
        stack1.Push(3);
        stack1.Push(4);
        stack1.Push(5);
        stack1.Push(6);
       // stack1.peek();
        stack1.display();
      //  stack.clear();
       StackinArray<String> stack2 = new StackinArray<>();
        stack2.Push("Ahsan");
        stack2.Push("Ali khan");
        stack2.Push("Yousif");
        stack2.Push("Sardar");
        stack2.Push("porho");
        stack2.peek();
        stack2.display();
        System.out.println("#################");
        stack.merge2(stack1, stack2);
        stack.display();
        System.out.println("***************************************");
        StackinArray<Integer> obj = new StackinArray<>();
        obj.Push(7);
        obj.Push(8);
        obj.Push(9);
        obj.Push(10);
        System.out.println("*****************************");
        obj.merge(stack1);
        obj.display();
       // System.out.println("Poped Integer is:" + obj.pop());
        obj.display();
        
        
    }

}
