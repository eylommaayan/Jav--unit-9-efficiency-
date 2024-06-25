


public class sortMod {

    // Function to sort the array based on modulo k
    public static void sortMod(int[] arr, int k) {
        int temp; // Temporary variable for swapping
        int curr = 0; // Index indicating the current position in the array

        // Iterate over all possible remainders from 0 to k-1
        for (int i = 0; i < k; i++) {
            // Iterate through the array starting from the current position
            for (int j = curr; j < arr.length; j++) {
                // If the remainder of arr[j] when divided by k is i
                if (arr[j] % k == i) {
                 /*
                  * temp = arr[j];

This line stores the value of arr[j] in a temporary variable temp.
Purpose: To hold the value of arr[j] so it can be moved to the position of arr[curr].
arr[j] = arr[curr];

This line assigns the value of arr[curr] to arr[j].
Purpose: To move the value of arr[curr] to the position j in the array.
arr[curr] = temp;

This line assigns the value stored in temp (which was originally arr[j]) to arr[curr].
Purpose: To complete the swap by moving the original value of arr[j] to the position curr.
                  */
                    temp = arr[j];
                    arr[j] = arr[curr];
                    arr[curr] = temp;
                    // Move to the next position in the array
                    curr++;
                }
            }
        }
    }

    // Main function to test the example
    public static void main(String[] args) {
        int[] arr = {35, 17, 13, 252, 4, 128, 7, 81}; // Example array
        int k = 10; // Value of k

        // Print the array before sorting
        System.out.println("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the sortMod function to sort the array
        sortMod(arr, k);

        // Print the array after sorting
        System.out.println("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
