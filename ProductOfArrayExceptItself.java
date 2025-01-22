import java.util.Arrays.*;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int size = nums.length;
        int[] answer = new int[size];

        for (int i = 0; i < nums.length; i++)
        {
            int product = 1;
            for (int j = 0; j < nums.length; j++)
            {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            answer[i] = product;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
