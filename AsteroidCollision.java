import java.util.*;

public class AsteroidCollision {
    public static int[] FindCollision(int[] asteroids){
        Stack<Integer> stack = new Stack<>();

        for (int i : asteroids){
            if (i > 0)
            {
                stack.push(i);
            }
            else
            {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -i){
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0){
                    stack.push(i);
                }
                if (stack.peek() == -i){
                    stack.pop();
                }
            }
        }

        int[] result = new int[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty())
        {
            result[i--] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] asteroid = {5, 10, -5};
        System.out.println(Arrays.toString(FindCollision(asteroid)));
    }
}
