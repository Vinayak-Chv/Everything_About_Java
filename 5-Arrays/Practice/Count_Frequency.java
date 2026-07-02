public class Count_Frequency {
    public static void main(String[] args) {
        int nums[] = {2, 3, 2, 4, 3, 2};

        for (int i = 0; i <= nums.length - 1; i++) {
            boolean alreadySeen = false;

            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    alreadySeen = true;
                    break;
                }
            }

            if (!alreadySeen) {
                int count = 0;
                for (int k = i; k < nums.length; k++) {
                    if (nums[k] == nums[i]) {
                        count++;
                    }
                }
                System.out.printf("%d occurs %d times\n", nums[i], count);
            }
        }
    }
}
