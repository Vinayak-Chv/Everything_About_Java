package Practice;

public class Run_Length {
    public static void main(String[] args) {
        String str = "aaabbc";
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            }
            else { 
                count++;
            }
        }

        System.out.printf("%s", result);
    }
}