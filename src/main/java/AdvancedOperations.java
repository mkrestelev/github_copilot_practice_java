import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AdvancedOperations {
    public AdvancedOperations() {
        // Constructor code if needed
    }

    /**
     * Finds the maximum value in an array.
     * @param arr - The array of integers.
     * @return The maximum value in the array.
     * @throws IllegalArgumentException if the array is null or empty.
     */
    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Reverses a given string.
     * @param str - The string to reverse.
     * @return The reversed string.
     * @throws IllegalArgumentException if the string is null.
     */
    public String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Formats a LocalDate object as a string in 'YYYY-MM-DD' format.
     * @param date - The date to format.
     * @return The formatted date string.
     * @throws IllegalArgumentException if the date is null.
     */
    public String formatDate(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date must not be null");
        }
        return date.toString();
    }

    /**
     * Calculates the factorial of a number.
     * @param n - The number to calculate the factorial for.
     * @return The factorial of the number.
     * @throws IllegalArgumentException if the number is negative.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must not be negative");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to find the nth Fibonacci number
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index must not be negative");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method to merge and sort two arrays
    public int[] mergeAndSort(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays must not be null");
        }
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        java.util.Arrays.sort(merged);
        return merged;
    }

    /**
     * Calculates statistics for a set of numbers.
     * @param nums - The set of numbers.
     * @return The statistics including sum, average, min, and max.
     */
    public Map<String, Object> calculateStatistics(int[] nums) {
        Map<String, Object> stats = new HashMap<>();
        if (nums == null || nums.length == 0) {
            stats.put("sum", 0);
            stats.put("average", Double.NaN);
            stats.put("min", null);
            stats.put("max", null);
            return stats;
        }

        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        stats.put("sum", sum);
        stats.put("average", (double) sum / nums.length);
        stats.put("min", min);
        stats.put("max", max);
        return stats;
    }
}
