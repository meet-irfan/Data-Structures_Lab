import java.util.Scanner;

public class mixtuerf<AnyType> {




Node head;
    Node tail;
int size=0;
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
++size;
        } else {
            newnode.next = head;
            head = newnode;

size++;
        }

    }


    public void addlast(AnyType data) {
        Node newnode = new Node(data, null);

        if (head == null) {
            addfirst(data);
        } else {

            tail.next = newnode;
            tail = newnode;
++size;

        }

    }


   public void adATIndex(AnyType data,int index){
       Node temp2=new Node(data,null);
        if(index<0||index>size+1){
            System.out.println("plz input corecvt index ");

        }
        if(index==0){

            addfirst(temp2.data);
        }


        int a=0;
        Node temp=head;
        while(a<index-1){
            temp=temp.next;
            ++a;


        }

        temp2.next=temp.next;
        temp.next=temp2;



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

public void twodle(AnyType d1,AnyType d2){
    int a=on(d1);
    int b=on(d2);
    ++b;
    System.out.println("the idex of "+d1+" is : "+a);
    System.out.println("the idex of "+d2+" is : "+b);
}






    public int on(AnyType data){
        int count=0;
        if(head==null){
          return count;

        }
       else if(head.data==data){

            head=head.next;
            return 0;


        }
else {
            Node prevs = head;
            Node cur = prevs.next;
            while (cur != null) {
                if (cur.data == data) {

                    prevs.next = cur.next;

                   return ++count;
                }
                else {
                    prevs = prevs.next;
                    cur = cur.next;
                    ++count;
                }
            }
            return -1;
        }}

    public void removeDuplicate() {
        //Node current will point to head
        Node current = head, prvs = null, dupl = null;

        if(head == null) {
            return;
        }
        else {
            while(current != null){

                prvs= current;

                dupl = current.next;

                while(dupl != null) {

                    if(dupl.data == prvs.data) {
                      dupl=dupl.next;
                      prvs.next=dupl;
                    }
                    else {
                       dupl=dupl.next;
                    }

                }
                current = current.next;
            }
        }
    }



    public void deletelas()
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

public void halfdelete(){

        if(head==null){

            System.out.println("Sooooryyyy");
        }

    else if(size%2!=0){
         System.out.println("Odd");
     }
      else  {
Node temp=head;
          for(int i=1; i<size/2; i++){
            temp=temp.next;

          }
temp.next=null;
          tail=null;

        }





}


    public static void main(String[] args) {
//
//        mixtuerf<Integer> list = new mixtuerf<>();
//
//
//        list.addfirst(1);
//        list.addfirst(2);
//        list.addfirst(3);
//        list.addfirst(4);
//        list.addfirst(5);
//        list.addfirst(6);
//list.display();
//list.halfdelete();
//list.display();
//        //list.display();
////list.adATIndex(12,1);
//
////list.display();
////list.removeDuplicate();
////        list.display();
////
////        list.display()
//
////        list.display();
////  //      list.display();
////
////     // System.out.println(list.on(1));
////        list.display();
//////        list.twodle(3,1);
//////        list.display();
////        list.deletelas();
////        list.display();

       int x=5;
            int a1 [] = new int[x];

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the array:");
            for (int i = 0; i < a1.length; i++) {
                a1[i] = sc.nextInt();
            }

            System.out.println("enter the index which u want to add");
            int index = sc.nextInt();

        int a=sc.nextInt();
        x=6;
        for (int i = 0; i < a1.length; i++) {


            if(i==index){

                a1[index]=a;

               a1[i+1]=a1[i];

            }

        }


        for (int j = 0; j <a1.length ; j++) {

            System.out.print(a1[j]+" ");
        }













    }









}
