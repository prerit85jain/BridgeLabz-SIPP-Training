public class ReverseString {
    public static void main(String[] args) {
        String input = "hello world";
        String[] words = input.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        System.out.println(reversedSentence.toString().trim());
    }
}