public class Included {
    public static int included(int x, int y) {
        // Create a boolean array to keep track of digits (0-9)
        boolean[] arr = new boolean[10];
        // Variable to store the current digit
        int digit;
        // Variable to store the result count
        int res = 0;
        
        // Loop through each digit of x
        while (x > 0) {
            // Get the last digit of x
            digit = x % 10;
            // Mark the digit as seen in arr
            arr[digit] = true;
            // Remove the last digit from x
            x = x / 10;
        }
    
        // Loop through each digit of y
        while (y > 0) {
            // Get the last digit of y
            digit = y % 10;
            // Mark the digit as not seen in arr
            arr[digit] = false;
            // Remove the last digit from y
            y = y / 10;
        }
    
        // Loop through the boolean array to count how many digits are only in x
        for (int i = 0; i < 10; i++) {
            // If the digit was seen in x and not in y
            if (arr[i] == true)
                // Increment the result counter
                res++;
        }
    
        // Return the result count
        return res;
    }
     
}
