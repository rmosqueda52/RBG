import BoardGames.BoardGame;
import BoardGames.ListOfGames;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    File boardGameFile = new File("Board Game FormattedPlayer.csv");
    ListOfGames listOfGames = new ListOfGames();

    public void run(){
        try{
            boardGameFileReader();
        } catch (IOException e){
            System.out.println("File not found");
        }

        int playerInput = UserInput.displayPlayerCount(listOfGames.getBoardGameList());

        int input = UserInput.displayTimeToPlay();

        List<BoardGame> formattedList = listOfGames.formatList(listOfGames.getBoardGameList(), input, playerInput);

        UserOutput.randomGamePicked(formattedList);
    }

        public void boardGameFileReader() throws FileNotFoundException {
            Scanner fileReader = new Scanner(boardGameFile);
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                String[] boardGameArray = currentLine.split(","); // Split by comma to get board game parameters
                BoardGame boardGame = new BoardGame(boardGameArray[0], boardGameArray[1], boardGameArray[2]
                        ,boardGameArray[3], boardGameArray[4]);
                listOfGames.addGameToList(boardGame);
            }
         }



}
