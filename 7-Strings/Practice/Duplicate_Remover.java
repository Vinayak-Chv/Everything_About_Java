package Practice;

public class Duplicate_Remover {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "Programming";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String currentString = String.valueOf(ch);
            int position = sb.indexOf(currentString);

            if (position == -1) {
                sb.append(ch);
            }
            else {
                continue;
            }
        }

        System.out.println(sb);
    }
}
