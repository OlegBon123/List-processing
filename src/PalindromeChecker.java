import java.util.ArrayList;
import java.util.List;

public class PalindromeChecker {
    public static void main(String[] args) {
        List<String> strings = List.of("radar", "hello", "level", "world", "madam", "java");

        List<String> palindromes = new ArrayList<>();
        for (String s : strings) {
            if (isPalindrome(s)) {
                palindromes.add(s);
            }
        }

        System.out.println("Паліндроми: " + palindromes);
    }

    private static boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        int length = lower.length();
        for (int i = 0; i < length / 2; i++) {
            if (lower.charAt(i) != lower.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
