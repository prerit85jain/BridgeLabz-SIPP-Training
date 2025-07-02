import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class CountVowelConsonants {

    public static void main(String[] args) {
        String input = "Hello World";
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        String lowerStr = str.toLowerCase();
        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (char c : lowerStr.toCharArray()) {
            if (vowelsSet.contains(c)) {
                vowels++;
            } else {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }
}