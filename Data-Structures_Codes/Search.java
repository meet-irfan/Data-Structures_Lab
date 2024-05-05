public class Search {

    public static int search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;

            }


        }

        return -1;

    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};


        for (int i=1; i<=arr.length;i++)
        {
            System.out.println(i);


        }

        int value = search(arr,7);
        System.out.println("the value is at the index:"+value);


    }




}