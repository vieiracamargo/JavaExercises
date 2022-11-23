public class SumArrays {
//    Write a function that takes an array of numbers and returns the sum of the numbers.
//    The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.

    public static void main(String[] args) {
        double[] numbers = {1, 5.2, 4, 0, -1};
        System.out.println(sum(numbers));
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
