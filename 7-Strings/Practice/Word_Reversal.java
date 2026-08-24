package Practice;

public class Word_Reversal {
    public static void main(String[] args) {
        String word = "java is fun";
        String words[] = word.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }
       
        System.out.printf("%s ", sb.toString().trim());

    }
}
