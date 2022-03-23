package Day3;

public class PrintingArray {
    //Printing elements of an array
    public static void main(String[] args) {
        {
                int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };

                System.out.print("Elements of given array are: ");

                // Looping through array by incrementing value of i
                //'i' is an index of array 'arr'
                for (int i = 0; i < arr.length; i++) {

                    // Print array element present at index i
                    System.out.print(arr[i] + " ");
                }
            }
        
    }
}
