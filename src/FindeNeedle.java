public class FindeNeedle {
//Can you find the needle in the haystack?
//Write a function findNeedle() that takes an array full of junk but containing one "needle"
//After your function finds the needle it should return a message (as a string) that says:
//"found the needle at position " plus the index it found the needle, so:
    public static void main(String[] args) {
        Object[] haystack = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack));
    }

    public static String findNeedle(Object[] haystack) {
        String answer = "";
        for(int i = 0; i < haystack.length; i++){
            if(haystack[i] == "needle"){
                answer = String.format("found the needle at position %d", i);
            }
        }
        return answer;
    }

}
