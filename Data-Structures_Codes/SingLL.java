import java.util.Scanner;

public class SingLL <AnyType>{

        Node head;
        Node tail;

        private class Node {

            AnyType data;
            Node next;


            Node(AnyType data, Node next) {

                this.data = data;
                this.next = next;

            }

        }


        public void addfirst(AnyType data) {
            Node newnode = new Node(data, null);


            if (head == null) {
                head = tail = newnode;

            } else {
                newnode.next = head;
                head = newnode;


            }

        }


        public void addlast(AnyType data) {
            Node newnode = new Node(data, null);

            if (head == null) {
                addfirst(data);
            } else {

                tail.next = newnode;
                tail = newnode;


            }

        }

        public void addat(AnyType data) {
            Node newnode = new Node(data, null);
            Node temp = head;

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
                temp.next = newnode;
            }


        }

    public int Size(){
        Node temp = head;
        int counter = 0;
        if (head==null){
            return counter;

        }
        else {

            while (temp!= null){
                counter++;
                temp = temp.next;
            }
            return counter;


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


            if(head == null)
            {
                System.out.println("list is not exist:");
            }
            else {

                while(temp.next != tail)
                {

                    temp = temp.next;

                }
                temp.next = null;
tail=temp;
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
//public void reverse(){
//            Node p=null;
//            Node c=null;
//            Node pointer=head;
//            while (pointer!=null){
//
//                c=pointer;
//                pointer=pointer.next;
//                c.next=p;
//                head=c;
//                p=c;
//
//
//            }}

    public void reverse2() {
        Node p = head;
        Node c = head.next;

        //  tail = head;

        while (c != null) {
            Node newNode = c.next;

            c.next = p;
            p = c;
            c = newNode;
        }
        head.next=null;
        head=p;
    }


    public void reverse(Node current) {
        if(head == null) {
            System.out.println("List is empty");

        }
        else {

            if (current.next == null) {

                System.out.print(current.data + "->");


            }
            reverse(current.next);

            System.out.print(current.data + "->");

        }}


    public Boolean palindrom()
    {
        Node temp =head;
        reverse2();
        Node temp2=head;
        if(head == null)
        {

            return false;
        }
        else {


            while(temp != null){

                if(temp.data!=temp2.data){

                    return false;
                }
else {
    temp2=temp2.next;
    temp=temp.next;

                }
            }
return true;
        }

    }


    public void removeDuplicate() {
        Node current = head, index = null, temp = null;
         int counter =0;
        if(head == null) {
            System.out.println("empty");
        }
        else {
            while(current != null){

                temp = current;
                index = current.next;

                while(index != null) {

                    if(current.data == index.data) {
                       counter++;
                        temp.next = index.next;

                    }
                    else {

                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            System.out.println("duplicate nodes:"+counter);
        }

    }

    //minNode() will find out the minimum value node in the list
    public void minNode() {
        Node current = head;
        int min;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {

            min = (int)head.data;

            while(current != null){

                if(min > (int)current.data) {
                    min = (int)current.data;
                }
                current= current.next;
            }
            System.out.println("Minimum value node in the list: "+ min);
        }
    }


    public void maxNode() {
        Node current = head;
        int max;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {

            max = (int)head.data;

            while(current != null){

                if(max < (int)current.data) {
                    max = (int)current.data;
                }
                current = current.next;
            }
            System.out.println("Maximum value node in the list: "+ max);
        }
    }

    //sortList() will sort nodes of the list in ascending order
    public void sortList() {

        Node current = head, index = null;
        int temp;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {

                index = current.next;

                while(index != null) {
                    if((int)current.data > (int)index.data) {
                        temp = (int)current.data;
                        current.data = index.data;
                         index.data = (AnyType)String.valueOf(temp);
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }


    public  void Delete_halh() {

        if(Size()==0){

            System.out.println("no node exist");
        }

        else if(Size()%2!=0){


            System.out.println("can't devide");
        }
        else{
            Node n=head;
            for(int i=0;i<Size()/2-1;i++){

                n=n.next;

            }
            n.next=null;
        }

    }


    public void display()

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









        public void swip(){
            if(head==null){

                System.out.println("Nuuuuuuulllllll");
            }
            else if(head==tail){

                return;

            }
            else{
                Node temp=tail;
                addfirst(temp.data);
                deletelast();
            }
//            else{
//                Node temp=tail;
//               Node temp2=head;
//               while(temp2.next!=tail){
//                   temp2=temp2.next;
//
//
//               }
//               temp2.next=null;
//               tail=temp2;
//               Node te=new Node(temp.data,null);
//te.next=head;
//head=te;
//
//            }

        }

        public static void main(String[] args) {

            SingLL<Integer> list = new SingLL<>();

//
           list.addfirst(1);
         list.addfirst(2);
            list.addfirst(3);
            list.addfirst(10);
            list.addfirst(5);
            list.addfirst(6);


            list.display();
            System.out.println("##############");
list.minNode();

//            list.Delete_halh();
//            list.display();
//list.swip();
//list.display();
//list.palindrom();
//list.display();

//            list.removeDuplicate();
//            list.addlast(5);
//            list.addlast(6);
//
//            list.addat(7);

//            list.display();
//            System.out.println();
//            list.reverse2();
//            list.display();


//            System.out.println("**********************");

//            System.out.println(list.deletefirst());
//            list.display();
//            list.deletelast();
//            list.display();
//            list.deleteat();
//            list.display();
//            System.out.println("data is at the index:"+list.finddata(5));
            //System.out.println("**************************");
//            list.reverse(list.head);
//            list.reverse();
            //list.display();
            //System.out.println(list.palindrom());
           // list.display();
       //     list.sortList();
         //   list.minNode();
           // list.maxNode();
        }

    }

