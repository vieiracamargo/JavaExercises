import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvertValues {
//    Given a set of numbers, return the additive inverse of each.
//    Each positive becomes negatives, and the negatives become positives.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(invert(array)));

    }

    public static int[] invert(int[] array) {
        int[] arr = new int[array.length];

        for(int i = 0; i < array.length; i++){
            arr[i] = array[i]*-1;
        }

        return arr;
    }

    public static int[] inverted(int[] array) {
        return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }
}
