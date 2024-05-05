public class stack_pre<t> {


    Node head;
    Node tail;

    public class Node{
        t data;
        Node next;

        Node(t data, Node next){
            this.data = data;
            this.next = next;
        }}

    public void push(t data){
        Node newNode = new Node(data,null);
        if (head==null){
           head = newNode;
           tail = newNode;
        }
        else {
newNode.next = head;
head = newNode;
        }
    }

    public t pop() {
        Node temp = head;
        if (head == null) {
            return null;
        } else {

            t data = head.data;
            head = head.next;
            return data;

        }

    }


    public t peek(){
        if (head==null){
            System.out.println("khaliii");
        }
        return head.data;
    }

    public void Display(){

        Node temp = head;
        if (head==null){
            System.out.println("list khallii ahy");
        }
        else {
            while (temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public boolean palindrom(){
   stack_pre<t> obj=new stack_pre<>();
        boolean re=false;
        Node temp=head;
        while(temp!=null){
            obj.push(temp.data);
            temp=temp.next;
        }
        while(head!=null){

            if(head.data==obj.pop()){
                re=true;
                head=head.next;
            }
            else{
               return false;
            }

        }
        return true;
//if(re==true){
//    return true;
//}
//else {
//    return false;
//}

    }

    public static void main(String args[]){

        stack_pre<String> list = new stack_pre<>();


        list.push("a");
        list.push("b");
        list.push("a");
        list.push("b");
//        list.push("e");
//        list.push("b");
//        list.push("b");
//        list.push("a");
        list.Display();
//        System.out.println();
//        System.out.println( list.pop());
        list.Display();
        System.out.println( list.palindrom());

////        System.out.println();
////        System.out.println("total Size");
////        list.getSize();
//
//
////        System.out.println();
////        list.pop();
////        list.Display();
////
//        list.push("w");
//        list.Display();
//
//        System.out.println();
//        list.pop();
//        list.Display();
//
//        System.out.println();
//        System.out.println(list.peek());

    }
}
