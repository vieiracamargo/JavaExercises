public class PaperWork {
    public static void main(String[] args) {
// You know that there are 'n' classmates and the paperwork has 'm' pages.
// Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.

        System.out.println(paperWork(3,5));
    }

    public static int paperWork(int n, int m) {
        return n < 0 || m < 0 ? 0 :  n * m;
    }
}
