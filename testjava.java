public class testjava {

    public static int twoSum(int nums[], int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] + nums[j + 1] == target) {
                        int m = j + 1;
                        System.out.println("[" + j + "," + m + "]");

                    }
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4, 5 };
        int target = 7;

        System.out.println(twoSum(nums, target));

    }

}
