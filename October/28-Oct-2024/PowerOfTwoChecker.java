public class PowerOfTwoChecker {

    // Method to check if a number is a power of two
    public static boolean checkNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkNumber(8));  // true
        System.out.println(checkNumber(10)); // false
        System.out.println(checkNumber(16)); // true
        System.out.println(checkNumber(18)); // false
    }
}

/*
Output:
true
false
true
false
*/