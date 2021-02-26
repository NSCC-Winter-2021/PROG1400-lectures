package Functions;

public class Functions {

    private static int addNumbers(int a, int b) {
        // a, b are parameters
        a += 1;
        return a + b;
    }

    private static int addArrayOfNumbers(int[] nums) {
        int sum = 0;
//        for (int n: nums) {
//            sum += n;
//        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] += 1;
        }
        return sum;
    }

    public static void main(String[] args) {

        // local variables
        int a = 1;
        int b = 2;

        // add two numbers
        int c = addNumbers(a, b);

        // print out the answer
        System.out.printf("%d + %d = %d\n", a, b, c);

        int[] nums = {1, 2, 3, 4, 5};

        int sum = addArrayOfNumbers(nums);

        int i = 0;
        for (; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " + ");
        }
        System.out.println(nums[i] + " = " + sum);
    }
}
