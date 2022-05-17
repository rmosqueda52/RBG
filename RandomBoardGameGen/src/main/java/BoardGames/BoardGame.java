package BoardGames;

public class BoardGame {

    private String name;
    private String timeToPlayMinutesMin;
    private String timeToPlayMinutesMax;
    private String playerMin;
    private String playerMax;


    public BoardGame (String name, String timeToPlayMinutesMin, String timeToPlayMinutesMax){
        this.name = name;
        this.timeToPlayMinutesMin = timeToPlayMinutesMin;
        this.timeToPlayMinutesMax = timeToPlayMinutesMax;
    }

    public BoardGame (String name, String playerMin, String playerMax, String timeToPlayMinutesMin, String timeToPlayMinutesMax){
        this.name = name;
        this.timeToPlayMinutesMin = timeToPlayMinutesMin;
        this.timeToPlayMinutesMax = timeToPlayMinutesMax;
        this.playerMin = playerMin;
        this.playerMax = playerMax;
    }

    public String getPlayerMin() {
        return playerMin;
    }

    public String getPlayerMax() {
        return playerMax;
    }

    public String getName() {
        return name;
    }

    public String getTimeToPlayMinutesMin(){
        return timeToPlayMinutesMin;
    }

    public String getTimeToPlayMinutesMax() {
        return timeToPlayMinutesMax;
    }
}
