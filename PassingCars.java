public class PassingCars {

    // Method to count passing cars
    public int passingCars(int[] arr) {
        // Initialize a counter for '1's
        int one = 0;
        // Initialize the total number of passing pairs
        int total = 0;

        // First loop: count the number of '1's in the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is '1', increment the 'one' counter
            if (arr[i] == 1)
                one++;
        }

        // Second loop: calculate the number of passing pairs
        for (int i = 0; i < arr.length; i++) {
            // If the current element is '0'
            if (arr[i] == 0)
                // Add the number of '1's to the total (since each '0' passes all '1's after it)
                total += one;
            else
                // If the current element is '1', decrement the 'one' counter
                one--;
        }

        // Return the total number of passing pairs
        return total;
    }
}
