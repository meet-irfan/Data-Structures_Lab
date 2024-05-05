import java.util.Scanner;

public class Parctices<T> {
    Node head;
    Node tail;

    private class Node{
        T data;
        Node next;
        Node(T data, Node next){
            this.data = data;
            this.next = next;
        }

    }

    public void addfirst(T data){
        Node teemp = new Node(data,null);
        if (head==null){
            head = teemp;
            tail = teemp;
        }
        else {
            teemp.next = head;
            head = teemp;
        }

    }

    public void AddLast(T data){
        //Node temp = head;
        Node temp=new Node(data,null);
        if (head==null){
            addfirst(data);
        }
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void DeleteFirst(){
        Node temp = head;
        if (head==null){
            System.out.println("empty");
        }
        else {
            head = temp.next;
            temp = head;
        }
    }

    public void DeleteLast(){
        Node temp = head;
        Node ptr = head.next;
        if (head==null){
            System.out.println("Empty");
        }
        else {
            while (ptr.next!= null){
                temp= temp.next;
                ptr = ptr.next;
            }

            temp.next = null;
            tail=temp;
        }
    }


    public void AddatIndex(T data){
        Node temp = head;
        Node current = temp.next;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any indeX where yuo want to Add New data");
        int index = sc.nextInt();

        if (head==null){
            addfirst(data);
        }
        else {
            Node temp2 = new Node(data,null);
            for (int i = 1; i <index-1 ; i++) {
                temp =temp.next;
                current = current.next;

            }
            temp2.next = current;
            temp.next = temp2;
        }
    }


public void DeleteAtIndex( ) {
    Node temp = head;
    Node cur = temp.next;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any index wheRe yoU wanT To deletE NodE");
    int indx = sc.nextInt();

    if (head == null) {
        System.out.println("Empty");
    }
    else {
        for (int i = 1; i <indx-1 ; i++) {
            temp = temp.next;
            cur = cur.next;
        }
        temp.next = cur.next;
    }
}

public int SearchData(T data){
        Node temp = head;
        int counter = 0;
        if (head==null){
            return -1;
        }
        else {
            while (temp!= null){
                ++counter;
                if (temp.data==data){
                    return counter;
                }
                temp = temp.next;
            }
               }
    return -1;

}

public void deleste2nodes(T data1 , T data2)
{
    if(head==data1||head==data2){

        head=head.next;

    }
    Node temp=head;
    Node cr=head.next;
    while(cr.next!=null){
        if(cr.data==data1)
        {
            temp.next=cr.next;

            System.out.println("first node deleted");
        }
        if(cr.data==data2)
        {

            temp.next=cr.next;
            System.out.println("second node deleted");

        }

            temp=temp.next;
            cr=cr.next;




    }

}






    public void Display(){
        Node temp = head;
        if (head==null){
            System.out.println("empty");
        }
        else {
            while (temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }


    public static void main(String args[]){

        Parctices<String> obj = new Parctices<>();
        obj.addfirst("Ahmed");
        obj.addfirst("ali");
        obj.addfirst("Babar");
        obj.addfirst("zulfii");
        obj.addfirst("Rashid");
        obj.addfirst("khursheed");
        obj.Display();


//        System.out.println();
//        System.out.println("Add last");
//        System.out.println();
//        obj.AddLast("sumair");
//        obj.Display();

//        System.out.println();
//        System.out.println("Delete First");
//        System.out.println();
//        obj.DeleteFirst();
//        obj.Display();

//
//        System.out.println();
//        System.out.println("Delete Last");
//        System.out.println();
//        obj.DeleteLast();
//        obj.Display();


//        System.out.println();
//        System.out.println("Add at any Index");
//        System.out.println();
//        obj.AddatIndex("Amir");
//        obj.Display();
//

//        System.out.println();
//        System.out.println("Delete at any Index");
//        System.out.println();
//        obj.DeleteAtIndex();
//        obj.Display();
//
//        System.out.println();
//        System.out.println("Search Data at any Index");
//        System.out.println();
//        System.out.println(obj.SearchData("Rashid"));
       // obj.Display();
        System.out.println();
        System.out.println();
obj.deleste2nodes("Babar","Aliii");
        System.out.println();
        System.out.println();
        obj.Display();
    }
}
