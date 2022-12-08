public class Mumbling {
    //This time no story, no theory. The examples below show you how to write function accum:
//Examples:
//accum("abcd") -> "A-Bb-Ccc-Dddd"
//accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//accum("cwAt") -> "C-Ww-Aaa-Tttt"
//The parameter of accum is a string which includes only letters from a..z and A..Z.
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(accum(s));

    }

    public static String accum(String s) {
        String[] newS = s.split("");
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                newString += newS[i].toUpperCase();
                newString += "-";
            } else if( i == s.length()-1) {
                newString += newS[i].toUpperCase();
                newString += newS[i].toLowerCase().repeat(i);
            }else{
                newString += newS[i].toUpperCase();
                newString += newS[i].toLowerCase().repeat(i);
                newString += "-";
            }

        }
        return newString;
    }
}