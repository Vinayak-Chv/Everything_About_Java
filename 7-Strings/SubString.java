public class SubString {
    public static void main(String[] args) {

        //Start with 1 not 0
        String gmail = "vinayakchavan@gmail.com";
        String sub = gmail.substring(13, 14);
        String extension = gmail.substring(13, gmail.length());

        System.out.println(sub);
        System.out.println(extension);
    }
}
