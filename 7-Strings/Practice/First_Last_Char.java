package Practice;

public class First_Last_Char {
    public static void main(String[] args) {
        String str = "arena";
        boolean isValid = false;

        for (int i = 0; i < str.length(); i++) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            if (firstChar == lastChar) {
                isValid = true;
            }
        }

        if (isValid == true) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
