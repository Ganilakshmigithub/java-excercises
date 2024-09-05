import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Circle class that implements Comparable
class Circle implements Comparable<Circle> {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Overriding toString method for easy display
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    // Implementing the compareTo method to sort by radius
    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius)import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        
        // Circle class that implements Comparable
        class Circle implements Comparable<Circle> {
            private double radius;
        
            // Constructor
            public Circle(double radius) {
                this.radius = radius;
            }
        
            // Getter for radius
            public double getRadius() {
                return radius;
            }
        
            // Setter for radius
            public void setRadius(double radius) {
                this.radius = radius;
            }
        
            // Overriding toString method for easy display
            @Override
            public String toString() {
                return "Circle with radius: " + radius;
            }
        
            // Implementing the compareTo method to sort by radius
            @Override
            public int compareTo(Circle other) {
                return Double.compare(this.radius, other.radius);
            }
        }
        
        public class circlesort {
            public static void main(String[] args) {
                // Create a list of Circle objects
                List<Circle> circles = new ArrayList<>();
                circles.add(new Circle(5.0));
                circles.add(new Circle(2.0));
                circles.add(new Circle(8.0));
                circles.add(new Circle(4.0));
        
                // Print unsorted circles
                System.out.println("Before sorting:");
                for (Circle circle : circles) {
                    System.out.println(circle);
                }
        
                // Sort circles by radius
                Collections.sort(circles);
        
                // Print sorted circles
                System.out.println("\nAfter sorting:");
                for (Circle circle : circles) {
                    System.out.println(circle);
                }
            }
        }
        
    }
};

public class circle{
    public static void main(String[] args) {
        // Create a list of Circle objects
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5.0));
        circles.add(new Circle(2.0));
        circles.add(new Circle(8.0));
        circles.add(new Circle(4.0));

        // Print unsorted circles
        System.out.println("Before sorting:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        // Sort circles by radius
        Collections.sort(circles);

        // Print sorted circles
        System.out.println("\nAfter sorting:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
