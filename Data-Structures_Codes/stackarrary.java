public class stackarrary <t>{


    int index = -1;
    int length = 20;

    Node[] stack = new Node[length];
    public class Node<t>{

        t data;
        Node(t data){
            this.data = data;}

    }

    public void push(t data){
        stack[++index] = new Node(data);
    }


    public t pop(){
        t fa;
        if (index == -1){
            System.out.println("khalii ahy");
            return null;
        }
        else {
             fa = (t) stack[index].data;
            stack[index--]= null;
        }
     return fa;
    }

    public void Display(){
        for (int i = index; i>=0 ; i--) {
            System.out.println(stack[i].data);

        }
    }



    public static void main(String args[]){
        stackarrary<Integer> obj = new stackarrary<>();

        obj.push(7);
        obj.push(8);
        obj.push(9);
        obj.push(10);
        obj.Display();
    }
}
