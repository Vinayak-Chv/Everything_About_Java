package Practice;

public class Vowel_Consonant_Count {
    public static void main(String[] args) {
        String str = "java";
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        }

        System.out.printf("Vowels: %s\nConsonants: %s", vowelCount, consonantCount);
    }
}
