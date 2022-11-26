public class TheFeastOfManyBeasts {
//All of the animals are having a feast! Each animal is bringing one dish.
// There is just one rule: the dish must start and end with the same letters as the animal's name.
// For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
//
//Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.

    public static void main(String[] args) {
        String animalName = "chickadee";
        String dish = "chocolate cake";

        System.out.println(feast(animalName, dish));
    }

    public static boolean feast(String beast, String dish) {

        String newName = ""+beast.charAt(0)+beast.charAt(beast.length()-1);
        String newDish = ""+dish.charAt(0)+dish.charAt(dish.length()-1);

        return newName.equals(newDish);

    }
}
