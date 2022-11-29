public class BooleanToString {
// Complete the method that takes a boolean value and return a "Yes" string for true,
// or a "No" string for false.
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(boolToWord(b));
    }

    public static String boolToWord(boolean b){
        return b? "Yes" : "No";
    }

}
