
class Args {
    // Corrected static method to find the largest number
    public static int largest(int... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one number");
        }
        
        int largest = nums[0]; // Assume the first number is the largest initially
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest; // Return the largest number found
    }

    public static void main(String[] args) {
        // Call the static method using the class name
        System.out.println("Largest element is: " + Args.largest(1, 4, 5));
    }
}
