//5) Perform various operations applicable on two or more strings of characters .
public class StringOperationsExample {
    public static void main(String[] args) {
        // Initializing two strings
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Name : Komal Paul , Roll No : 226902");
        // 1. String Concatenation
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // 2. Comparing Strings (case-sensitive)
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the strings equal? " + areEqual);

        // 3. Compare ignoring case
        String str3 = "hello";
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("Are str1 and str3 equal ignoring case? " + areEqualIgnoreCase);

        // 4. String Length
        System.out.println("Length of str1: " + str1.length());

        // 5. Substring extraction
        String substring = concatenatedString.substring(6, 11);  // Extracting "World"
        System.out.println("Extracted substring: " + substring);

        // 6. Convert to Upper and Lower Case
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        // 7. Finding character at a specific index
        char charAtIndex = str1.charAt(1);  // Character at index 1 in "Hello" is 'e'
        System.out.println("Character at index 1 in str1: " + charAtIndex);

        // 8. Finding the index of a character or substring
        int indexOfChar = str2.indexOf('o');  // Finds the first occurrence of 'o'
        System.out.println("Index of 'o' in str2: " + indexOfChar);

        // 9. Replace characters or substrings
        String replacedString = concatenatedString.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replacedString);

        // 10. Trim leading and trailing whitespaces
        String str4 = "  Hello Java  ";
        String trimmedString = str4.trim();  // Removes leading and trailing spaces
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // 11. Check if a string contains a substring
        boolean containsWorld = concatenatedString.contains("World");
        System.out.println("Does concatenatedString contain 'World'? " + containsWorld);

        // 12. Splitting a string
        String sentence = "Java is awesome";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
