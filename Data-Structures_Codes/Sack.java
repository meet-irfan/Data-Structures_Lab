public class Sack <AnyType>{

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


    public void push(AnyType data) {
        Node newnode = new Node(data, null);


        if (head == null) {
            head = tail = newnode;

        } else {
            newnode.next = head;
            head = newnode;


        }

    }



    public AnyType pop()
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


    public static void main(String[] args) {


        Sack<Integer> list = new Sack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.display();
        list.pop();
        list.display();
    }


}
