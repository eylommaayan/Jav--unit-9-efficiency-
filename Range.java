public class Range {
    private int _center, _radius; // Private variables for center and radius

    // Constructor to initialize center and radius
    public Range(int c, int r) {
        _center = c;
        _radius = r;
    }

    // Getter method for center
    public int getCenter() {
        return _center;
    }

    // Getter method for radius
    public int getRadius() {
        return _radius;
    }

    // Method to find the index of the range that contains the given number
    public static int findNum(Range rangeA[], int num) {
        int high = rangeA.length - 1; // Initialize high to the last index
        int low = 0; // Initialize low to the first index
        int mid; // Variable to store the mid index
        int center, radius; // Variables to store center and radius of the current range

        // Binary search loop
        while (low <= high) {
            mid = (high + low) / 2; // Calculate mid index
            center = rangeA[mid].getCenter(); // Get center of the mid range
            radius = rangeA[mid].getRadius(); // Get radius of the mid range

            // Check if the number is within the current range
            if (num >= center - radius && num <= center + radius)
                return mid; // Return the index if the number is within the range
            else if (num > radius + center)
                low = mid + 1; // Move to the upper half if the number is greater than the upper bound of the range
            else
                high = mid - 1; // Move to the lower half if the number is less than the lower bound of the range
        }
        return -1; // Return -1 if the number is not found in any range
    }
}
//time = o(log(n))
//place = o(1)
