/*
 * נתון מערך המורכב ממספרים שלמים ממוין בסדר עולה ממש. 
 * אין צורך לבדוק אחד את השני. 
 * עליכם לכתוב שיטה המקבלת את המערך כפרמטר ורק מספר שלם חיובי 
𝑘
k. השיטה צריכה להדפיס את כל הזוגות השווים למספר בדיוק 
𝑘
k. אין צורך לבדוק ק-1 חורגים. שימו לב, 
למספרים בזוגות יש לבדוק שהערכים הם בין אינדקסים ולא בין ערכים במערך.
 */

//Version 1: Nested Loops
 public class printPairs {

    // Function to print pairs with difference k
    public static void printPairs(int[] arr, int k) {
        // Iterate over the array with index i
        for (int i = 0; i < arr.length; i++) {
            // Iterate over the array with index j starting from i+1
            for (int j = i + 1; j < arr.length; j++) {
                // Check if the difference between arr[j] and arr[i] is k
                if (arr[j] - arr[i] == k) {
                    // Print the pair
                    System.out.println("Pair Found: (" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

/*
 * Time Complexity:

The nested loop approach has a time complexity of 
𝑂(𝑛2)O(n 2) because for each element in the outer loop, 
it iterates over all subsequent elements in the inner loop.
This can be inefficient for large arrays.
Logic:

It checks all possible pairs in the array to find those with a difference of k.
 */

 //Version 2: Two-pointer Technique
    public class PrintPairs {

        public static void printPairs(int[] a, int k) {
            int i = 0; // Initialize the first pointer
            int j = 1; // Initialize the second pointer
    
            // Iterate through the array until the second pointer reaches the end
            while (j < a.length) {
                if (i == j) { // Ensure i and j are not pointing to the same element
                    j++;
                    continue;
                }
    
                // If the difference between the elements at j and i is exactly k
                if (a[j] - a[i] == k) {
                    // Print the pair
                    System.out.println("Pair Found: (" + a[i] + ", " + a[j] + ")");
                    i++; // Move both pointers forward
                    j++;
                } else if (a[j] - a[i] < k) {
                    // If the difference is less than k, move the second pointer forward
                    j++;
                } else {
                    // If the difference is greater than k, move the first pointer forward
                    i++;
                }
            }
        }

/*
 * Explanation:
Time Complexity:

The two-pointer technique has a time complexity of 𝑂(𝑛)
O(n) because each pointer traverses the array only once.
This is significantly more efficient than the nested loop approach for large arrays.
Logic:

It uses two pointers, i and j, to traverse the array.
The outer loop ensures that i and j do not point to the same element.
Depending on whether the difference between arr[j] and arr[i] is less than, 
equal to, or greater than k, it adjusts the pointers accordingly.
 */
    
        public static void main(String[] args) {
            int[] arr = {-7, -3, 0, 1, 3, 5, 12, 14, 17, 19, 25, 30}; // Example array
            int k = 2; // Example value of k
    
            // Call the printPairs function with the array and k
            printPairs(arr, k);
        }
    }
    
