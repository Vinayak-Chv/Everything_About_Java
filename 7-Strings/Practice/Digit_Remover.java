package Practice;

public class Digit_Remover {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Code12Java3");
        String result = "";

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
            }
            else {
                result = result + sb.charAt(i);
            }
        }

        System.out.println(result);
    }
}
