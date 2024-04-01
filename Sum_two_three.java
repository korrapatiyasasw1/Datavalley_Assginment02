import java.util.Arrays;

public class Sum_two_three {
    public static void main(String[] args) {
        int[] values = {9, 30, 53, 39, 60, 44, 21};
        Arrays.sort(values);
        int secondLargest = values[values.length - 2];
        int thirdLargest = values[values.length - 3];
        int sum = secondLargest + thirdLargest;
        System.out.println("The sum is" + sum);
    }
}