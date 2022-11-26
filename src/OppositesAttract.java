public class OppositesAttract {
// Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
// If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

//Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
    public static void main(String[] args) {
        int flower1 = 2;
        int flower2 = 3;
        System.out.println(isLove(flower1, flower2));

    }

    public static boolean isLove(final int flower1, final int flower2) {
        int even = 0;
        int odd = 0;

        int[] flowers = {flower1, flower2};
        for(int flower: flowers){
            even += flower %2 == 0? 1 : 0;
            odd += flower %2 != 0? 1: 0;
        }

        return even == odd;
    }

    public static boolean BestLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }
}
