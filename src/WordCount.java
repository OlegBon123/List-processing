import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String s = "Hello, Jim. How are you? "
                + "Would you like to consider an interest offer?";
        String pattern = "[a-zA-Z]+";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toLowerCase().toCharArray()) { // Використовуємо toLowerCase()
            String s1 = "" + c;
            if (s1.matches(pattern)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        System.out.println(map);
    }
}

