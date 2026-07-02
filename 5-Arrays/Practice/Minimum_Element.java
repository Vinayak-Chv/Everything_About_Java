public class Minimum_Element {
    public static void main(String[] args) {
        int prices[] = {450, 299, 600, 150, 350};
        int minPrice = prices[0];

        for (int i = 1; i <= prices.length - 1; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        System.out.println(minPrice);
    }
}
