package Practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listeo", str2 = "silent";
        char arr1[] = str1.toCharArray(), arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (str1.length() == str2.length()) {
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not an anagram");
            }
        }
        else {
            System.out.println("Not an anagram");
        }
    }
}
