import BoardGames.BoardGame;

import java.util.List;
import java.util.Random;

public class UserOutput {

    public static void randomGamePicked(List<BoardGame> formattedList){
        System.out.println();
        Random random = new Random();
        int upperBound = formattedList.size();

        if (upperBound == 0){
            System.out.println("Sorry there are no games within your time constraint and player count.");
            System.out.println("Have a good day!");
            System.exit(0);
        }
        int randomGame = random.nextInt(upperBound);

        System.out.println(formattedList.get(randomGame).getName() + ": "
                + formattedList.get(randomGame).getTimeToPlayMinutesMax() + "min "
                + formattedList.get(randomGame).getPlayerMin() + "-"
                + formattedList.get(randomGame).getPlayerMax() + "p");

    }
}
