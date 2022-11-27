public class ReturnNegative {
// In this simple assignment you are given a number and have to make it negative.
// But maybe the number is already negative?

    public static void main(String[] args) {
        int x = 1;
        System.out.println(makeNegative(x));
    }

    public static int makeNegative(final int x) {
        return x < 0? x : x*-1;
    }
}
