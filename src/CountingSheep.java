public class CountingSheep {
//Consider an array/list of sheep where some sheep may be missing from their place.
//We need a function that counts the number of sheep present in the array (true means present).
//Hint: Don't forget to check for bad values like null/undefined
    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, null,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        System.out.println(countSheeps(array1));

    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int result = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null) {
                result += sheep ? 1 : 0;
            }
        }
        return result;
    }

}
