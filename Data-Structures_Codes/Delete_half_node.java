public class Delete_half_node<t>{


    Node head;

    Node tail;

    public class Node{
        Node next;
        Node prev;
        t data;

        Node(Node next, Node prev, t data){
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }


    public void Addfirst(t data){
        Node temp = new Node(null, null, data );
        if (head==null){
             head = temp;
             tail = temp;
        }
        else {
            Node newnode = new Node(null, null, data);
            newnode.next = head;
            head.prev = newnode;
            head = newnode;

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
    public void Display(){
        Node temp = head;
        if (head==null){
            System.out.println("empty");
        }
        else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }


    public static void main(String args[]){
        Delete_half_node<Integer> obj = new Delete_half_node<>();
        obj.Addfirst(1);
        obj.Addfirst(2);
        obj.Addfirst(3);
        obj.Addfirst(4);
        //obj.Addfirst(5);
      //obj.Addfirst(5);
        obj.Display();

        System.out.println();
        System.out.println("Size ");
        System.out.println(obj.Size());
        obj.Delete_halh();
        obj.Display();
        System.out.println();
        System.out.println(obj.Size());
    }
}
