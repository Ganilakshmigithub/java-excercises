public class Average {
    // Method to calculate the average of only positive numbers
    public double avg(int... nums) {
        int sum = 0;
        int count = 0;
        
        // Iterate through the numbers
        for (int i : nums) {
            if (i > 0) {
                sum += i; // Add to sum if the number is positive
                count++; // Increment count of positive numbers
            }
        }
        
        // Return the average if there are positive numbers
        if (count == 0) {
            return 0; // Or throw an exception if you prefer
        } else {
            return (double) sum / count;
        }
    }
    
    public static void main(String[] args) {
        Average a = new Average();
        // Example input with both positive and negative numbers
        System.out.println("Average of positive numbers is: " + a.avg(1, 2, 3, 4, 5, -2, -4));
    }
}
