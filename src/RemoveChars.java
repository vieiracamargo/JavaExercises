import java.util.Arrays;

public class RemoveChars {
//    Your goal is to create a function that removes the first and last characters of a string.
//    You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
    public static void main(String[] args) {
        String str = "eloquent";
        System.out.println(remover(str));
    }

    //first attempt
    public static String firstA(String str) {
        String[] strSplit = str.split("");
        String newString ="";

        for(int i =0; i< strSplit.length; i++){
            if( i != 0 && i != strSplit.length -1){
                newString += strSplit[i];
            }
        }
        return newString;
    }

    //second attempt
    public static String remover(String str) {
        return str.substring(1,str.length()-1);
    }
}
