public record Circle(int x, int y, double radius) {

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Example usage
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5, 10, 7.5);

        // Use the toString() method
        System.out.println(circle.toString());

        // Use getter methods
        System.out.println("X coordinate: " + circle.x());
        System.out.println("Y coordinate: " + circle.y());
        System.out.println("Radius: " + circle.radius());

        // Use the area() method
        System.out.println("Area of the circle: " + circle.area());
    }
}
