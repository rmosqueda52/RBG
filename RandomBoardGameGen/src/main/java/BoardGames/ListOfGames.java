package BoardGames;

import BoardGames.BoardGame;

import java.util.ArrayList;
import java.util.List;

public class ListOfGames {

    private List<BoardGame> boardGameList = new ArrayList<>();


    public List<BoardGame> getBoardGameList() {
        return boardGameList;
    }

    public void addGameToList(BoardGame boardGame){
        boardGameList.add(boardGame);
    }

    public List<BoardGame> formatList(List<BoardGame> boardGameList, int input, int playerCount){
        List<BoardGame> formattedList = new ArrayList<>();
        for (BoardGame boardGame : boardGameList) {
            if (Integer.parseInt(boardGame.getTimeToPlayMinutesMax()) <= input
                    && Integer.parseInt(boardGame.getPlayerMin()) < playerCount
                    && Integer.parseInt(boardGame.getPlayerMax()) > playerCount) {
                formattedList.add(boardGame);
            }
        }
        return formattedList;
    }
}
