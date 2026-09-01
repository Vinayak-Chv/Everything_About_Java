public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        //Print
        System.out.println(sb);

        //Get the character at any index
        System.out.println(sb.charAt(0));

        //Set character at index
        sb.setCharAt(0, 'P');
        System.out.printf("After replacing: %s\n", sb);

        //Insert character at index
        sb.insert(2, 'n');
        System.out.printf("After inserting: %s\n", sb);

        //Delete character at any index
        sb.delete(2, 4);
        System.out.printf("After deleting: %s\n", sb);

        //Appending the character
        sb.append("o");
        sb.append("l");
        System.out.printf("After appending: %s", sb);

    }
}
