import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleInTheBus {
//You are provided with a list (or array) of integer pairs
//The first item represent number of people get into bus
//The second item represent number of people get off the bus
//return number of people who are still in the bus after the last bus station (after the last array)
    public static void main(String[] args) {
        List<int[]> stops = new ArrayList<>(Arrays.asList(new int[] {10,0}, new int[] {3,5},new int[] {2,5} ));
        System.out.println(countPassengers(stops));

    }

    public static int countPassengers(List<int[]>stops) {
        int in = 0;
        int out = 0;

        for(int[] stop : stops){
            in += stop[0];
            out += stop[1];
        }

        return in - out;
    }

}
