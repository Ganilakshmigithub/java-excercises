public class pass {

    public static boolean isValidPassword(String password) {
        return password != null && password.matches(".*\\d.*") &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[^a-zA-Z0-9].*");
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidPassword("Passw0rd!")); // true
        System.out.println(isValidPassword("password")); // false
        System.out.println(isValidPassword("PASSWORD123")); // false
        System.out.println(isValidPassword("P@ssw0rd")); // true
        System.out.println(isValidPassword("123456")); // false
        System.out.println(isValidPassword("ABCDEF!")); // false
        System.out.println(isValidPassword("A1!")); // true
    }
}

