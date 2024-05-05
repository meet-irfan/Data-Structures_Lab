import java.util.Scanner;

public class Doubly <AnyType >{

 Node head;
 Node tail;

 private class Node{
     AnyType data;
     Node next;
     Node pre;

     Node(AnyType data,Node next, Node pre)
     {
         this.data = data;
         this.next = next;
         this.pre = pre;

     }

 }
    public void addfirst(AnyType data) {
        Node newnode = new Node(data, null,null);


        if (head == null) {
            head = tail = newnode;

        } else {
            newnode.next = head;
            head.pre = newnode;
            head = newnode;

        }

    }


    public void addlast(AnyType data) {
        Node newnode = new Node(data, null,null);

        if (head == null) {
            addfirst(data);
        }
        else {

            tail.next = newnode;
            newnode.pre = tail;
            tail = newnode;


        }

    }

    public void addat(AnyType data) {
        Node newnode = new Node(data, null,null);
        Node temp = head;
        Node ptr =temp.next;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index:");
        int index = sc.nextInt();


        if (temp == null) {
            addfirst(data);
        } else if (index == 1) {
            addfirst(data);
        } else {

            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;

            }

            newnode.next = temp.next;
            ptr.pre = newnode;
            temp.next = newnode;
            newnode.pre = temp;

        }


    }

    public AnyType deletefirst()
    {


        if(head == null)
        {
            //System.out.println("list is not exist:");
            return null;

        }
        else {

            head = head.next;

        }

        return head.data;

    }

    public void deletelast()
    {
        Node temp = head;
        Node ptr = temp.next;

        if(head == null)
        {
            System.out.println("list is not exist:");
        }
        else {

            while(ptr.next != null)
            {

                temp = temp.next;
                ptr = ptr.next;
            }
            temp.next = null;
             ptr.pre=null;
        }


    }

    public void deleteat()
    {
        Node temp = head;
        Node ptr = temp.next;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index:");
        int index= sc.nextInt();

        if(head == null)
        {
            deletefirst();
        }
        else{

            for(int i =1; i<index-1;i++)
            {
                temp = temp.next;
                ptr = ptr.next;

            }

            temp.next = ptr.next;
            ptr.pre=temp;

        }



    }


    public int finddata(AnyType data)
    {
        Node temp = head;
        int counter=0;
        if(head == null)
        {
            return 0;
        }
        else {

            while(temp != null)
            {counter++;
                if(temp.data == data)
                {
                    return counter;
                }
                temp = temp.next;
            }


        }
        return 0;
    }
    //MinimumNode() will find out minimum value node in the list
    public int minimumNode() {
        //Node current will point to head
        Node current = head;
        int min;

        //Checks if list is empty
        if(head == null) {
            System.out.println("List is empty");
            return 0;
        }
        else {
            //Initially, min will store the value of head's data
            min = (int)head.data;
            while(current != null) {
                //If the value of min is greater than the current's data

                //Then, replace the value of min with current node's data

                if(min > (int)current.data)
                    min = (int)current.data;
                current = current.next;
            }
        }
        return min;
    }

    //MaximumNode() will find out maximum value node in the list
    public int maximumNode() {
        //Node current will point to head
        Node current = head;
        int max;

        //Checks if list is empty
        if(head == null) {
            System.out.println("List is empty");
            return 0;
        }
        else {
            //Initially, max will store the value of head's data
            max = (int)head.data;
            //If value of max is lesser than current's data
            //Then, replace value of max with current node's data
            while(current != null) {
                if((int)current.data > max)
                    max = (int)current.data;
                current = current.next;
            }
        }
        return max;
    }



    //removeDuplicateNode() will remove duplicate nodes from the list
    public void removeDuplicateNode() {
        //Node current will point to head
        Node current, index, temp;

        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Initially, current will point to head node
            for(current = head; current != null; current = current.next) {
                //index will point to node next to current
                for(index = current.next; index != null; index = index.next) {
                    if(current.data == index.data) {
                        //Store the duplicate node in temp
                        temp = index;
                        //index's previous node will point to node next to index thus, removes the duplicate node
                        index.pre.next = index.next;
                        if(index.next != null)
                            index.next.pre = index.pre;
                        //Delete duplicate node by making temp to null
                        temp = null;
                    }
                }
            }
        }
    }
    public void displayfor()

    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("list is not exist:");
        }
        else {

            while(temp != null)
            {

                System.out.print(temp.data+" ->");
                temp = temp.next;

            }
            System.out.println("end of the list...");

        }


    }


    public void displayback()

    {
        Node temp = tail;
        if(head == null)
        {
            System.out.println("list is not exist:");
        }
        else {

            while(temp != null)
            {

                System.out.print(temp.data+" ->");
                temp = temp.pre;

            }
            System.out.println("end of the list...");

        }


    }



    public static void main(String[] args) {

        Doubly<Integer> list = new Doubly<>();


        list.addfirst(1);
        list.addfirst(5);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
          list.addlast(6);
            list.addlast(7);
            list.addat(8);

            list.displayfor();
           // list.displayback();
        list.removeDuplicateNode();
        list.displayfor();

           System.out.println("**********************");

            System.out.println(list.deletefirst());
           list.displayfor();
           list.deletelast();
            list.displayfor();
           list.deleteat();
           list.displayfor();
           System.out.println("data is at the index:"+list.finddata(5));


        System.out.println("min:"+list.minimumNode());
        System.out.println("max:"+list.maximumNode());
    }

}





