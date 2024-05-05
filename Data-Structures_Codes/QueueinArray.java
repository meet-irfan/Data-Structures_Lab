/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackinarray;

/**
 *
 * @author Sardar Malik
 */
public class QueueinArray<T>{
    int front =0;
    int rear = -1;
    int length = 100;
     Node [ ] queue = new Node[length];
    public void enqueue(T data){
    if(rear >= length){
        System.out.println("Not valid");
    }
    else{
    queue[++rear]=new Node(data);
    }
    }
    
    public boolean isEmpty()
	{
		return front == 0;
	}
   

    public void dequeue(){
    if(rear == -1){
        System.out.println("Queue is Empty:");
    }
    else
    {
        System.out.println("Removing:"+queue[front].data);
        for(int i=0; i<rear; i++){
        queue[i] = queue[i+1];
        }
        rear--;
    }
    
    }
    public void Printall(){
    for(int i =0;  i<rear; i++){
        System.out.print(queue[i].data+"-> ");
    }
       
    }
    private class Node<T>{
    T data;
    Node(T data){
    this.data =data;
    }
    
    }
    public static void main(String[] args) {
        QueueinArray<String> queue = new QueueinArray<>();
        queue.enqueue("Ahsasn");
        queue.enqueue("sardar");
        
       queue.dequeue();
        queue.Printall();
    }
}
