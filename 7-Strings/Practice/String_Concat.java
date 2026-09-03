package Practice;

public class String_Concat {
    public static void main(String[] args) {
        String arr[] = {"apple", "banana", "cherry"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

            if (i != arr.length - 1) {
                sb.append("-");
            }
        }

        System.out.println(sb.toString());
    }
}