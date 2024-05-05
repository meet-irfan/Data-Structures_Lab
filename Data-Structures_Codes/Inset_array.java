import java.util.Scanner;

public class Inset_array {

    public static void main(String args[])
    {

        int a1 [] = new int[5];
        int a2 []= new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array:");
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();
        }

        System.out.println("enter the index which u want to add");
        int index = sc.nextInt();

        for (int i = 0; i <a2.length ; i++) {

            if (i < index) {
                a2[i] = a1[i];
            } else if (i == index) {
                System.out.println("enter the new element:");
                a2[i] = sc.nextInt();
                a2[i] = a2[i];
            } else {
                a2[i ] = a1[i-1];

            }
        }

            for (int j = 0; j <a2.length ; j++) {

                System.out.print(a2[j]+" ");
            }

    }
}
