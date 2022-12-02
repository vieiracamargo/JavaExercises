public class ReversedStrings {
    public static void main(String[] args) {
        String str = "word";
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String newStr = "";

        for(int i = str.length()-1; i >= 0; i--){
            newStr += str.charAt(i);
        }
        return newStr;

    }
}
