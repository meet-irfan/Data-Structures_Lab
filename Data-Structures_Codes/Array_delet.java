import java.util.Scanner;

public class Array_delet {

    public static void main(String args[]) {


        int[] num = new int[5];
        int[] num2 = new int[4];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any value of Array..");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

        }

        System.out.println("Enter the Index which you want to Delete Value of Array... ");
        int index = sc.nextInt();
        for (int i = 0; i < num2.length; i++) {

            if (i < index) {
                num2[i] = num[i];

            } else {
                num2[i] = num[i + 1];
            }
        }
        for (int j = 0; j < num2.length; j++) {
            System.out.print(num2[j] + " ");

        }
    }
}
