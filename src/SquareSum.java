public class SquareSum {
//
// .
//For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2};
        System.out.println(squareSum(numbers));
    }

    public static int squareSum(int[] numbers) {
       int sum = 0;

       for(int n: numbers){
           sum += n * n;
       }

        return sum;
    }
}
