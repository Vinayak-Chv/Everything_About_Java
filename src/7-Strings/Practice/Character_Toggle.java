package Practice;

public class Character_Toggle {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JaVa");

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            char newChar = ' ';

            if (Character.isUpperCase(ch) == true) {
                newChar = Character.toLowerCase(ch);
            }
            else {
                newChar = Character.toUpperCase(ch);
            }

            sb.setCharAt(i, newChar);
        }

        System.out.println(sb);
    }
}
