import BoardGames.BoardGame;
import BoardGames.ListOfGames;

import java.util.List;
import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int displayPlayerCount(List<BoardGame> boardGameList){
        int maxPlayerCount = 0;

        for (BoardGame boardGame : boardGameList){
            if(Integer.parseInt(boardGame.getPlayerMax()) > maxPlayerCount){
                maxPlayerCount = Integer.parseInt(boardGame.getPlayerMax());
            }
        }

        boolean goodInput = false;
        int playerCount = 0;
        while (!goodInput) {
            System.out.println("How many players do you have to play?");
            String stringIntParse = scanner.nextLine();
            if (NumberUtils.isNumber(stringIntParse)) {
                playerCount = Integer.parseInt(stringIntParse);

                if(playerCount > maxPlayerCount){
                    System.out.println("\nWe do not have games with that many players, please input a game with "
                            + maxPlayerCount + " players or less.\n");
                }
                else if (playerCount > 0) {
                    goodInput = true;
                } else {
                    System.out.println("\nPlease enter a valid number.\n");
                }
            }
            else
                System.out.println("\nPlease enter numeric digits.\n");
        }
        return playerCount;
    }

   public static int displayTimeToPlay(){
       boolean goodInput = false;
       int userTime = 0;
       while (!goodInput) {
           System.out.println("How much time do you have for a game? Enter amount in minutes please.");
           String stringIntParse = scanner.nextLine();
           if (NumberUtils.isNumber(stringIntParse)) {
               userTime = Integer.parseInt(stringIntParse);
               if (userTime > 0) {
                   goodInput = true;
               } else {
                   System.out.println("\nPlease enter a valid time to play in minutes.\n");
               }
           }
           else
               System.out.println("Please enter numeric digits.");
       }
       return userTime;
   }
}
