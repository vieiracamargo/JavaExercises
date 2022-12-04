public class BeginnerSeries {
    public static void main(String[] args) {
        int h = 0, m = 1, s = 1;
        System.out.println(Past(h, m, s));
    }

    public static int Past(int h, int m, int s) {
       s = s * 1000;
       m =  m * 60000;
       h = (h * 60) * 60000;

       return s+m+h;

    }

}
