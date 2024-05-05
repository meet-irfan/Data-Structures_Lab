import java.util.Scanner;

public class queue_PREP<t> {


    Node head;
    Node tail;

    public class Node{
        t  data;
        Node next;

        Node(t data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void enqueue(t data){
        Node newnode = new Node(data, null );
        if (head==null){
            head = newnode;
            tail = newnode;
        }
        else {
            tail.next = newnode;
            tail = newnode;
        }
    }


    public void dequeue(){
        if (head==null){
            System.out.println("list khaliii ahy");
        }
        else {

            head = head.next;
        }
    }

    public int getSize(){
        Node temp = head;
        int counter = 0;
        if (head==null){
            System.out.println("khalii ahy list");
return counter;
        }
        else {
            while (temp!= null){
                 counter++;
                temp = temp.next;
            }

        }
        return counter;
    }

public boolean Isempty(){
        if (head==null){
            return true;
        }
        return  false;
}



public boolean contain(t data){
        Node temp = head;
        boolean x=false;
        if(head==null){

            return false;

        }
        else{
            while(temp!=null) {
                if (temp.data == data) {
                    return true;

                }

                temp = temp.next;

                }
            return false;

            }


        }

public void remove(int index){
        Node temp = head;
        Node ptr = temp.next;

        if (head==null){
            System.out.println("khalii list");
        }
        else {
            for (int i = 1; i < index - 1; i++) {


                temp = temp.next;
                ptr = ptr.next;
            }

            temp.next = ptr.next;
        }
}

    public void Display(){
        Node temp = head;
        if (head==null){
            System.out.print("null list");
        }
        else {
            while (temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public t peek(){


        if (head==null){
            System.out.println("khaliii list");
        }

        return head.data;
    }


    public queue_PREP merge(queue_PREP ob1,queue_PREP ob2){
        queue_PREP<queue_PREP> ob3=new queue_PREP<>();
        //ob1.tail.next=ob2.head;


ob3.head=ob1.head;
ob3.tail=ob1.tail;

ob3.tail.next=ob2.head;
ob3.tail.next=ob2.tail;
       return ob3;
    }

    public static void main(String args[]){
        queue_PREP<String> list = new  queue_PREP<>();
     //   queue_PREP Obj = new  queue_PREP<>();
        list.enqueue("a");
        list.enqueue("b");
        list.enqueue("c");
        list.enqueue("d");
        list.Display();
        System.out.println(list.contain("cc"));
//        System.out.println();
//        list.enqueue("e");
//        list.Display();
//
////        System.out.println();
////        list.remove(3);
//        list.Display();

//        System.out.println();
//        System.out.println("Contain ture or false");
//        System.out.println( list.contain("b"));
//       // list.Display();

//        queue_PREP<String> list2 = new  queue_PREP<>();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        list.Display();
////        list2.enqueue("e");
//        list2.enqueue("br");
//        list2.enqueue("ct");
//        list2.enqueue("dy");
//        list2.Display();
//        queue_PREP<String> list3 = new  queue_PREP<>();
////        System.out.println();
//        System.out.println("Get Size :"+list.getSize());
//
//
//        System.out.println();
//        System.out.println("Empty :"+list.Isempty());
//        list.Display();
    }
}
