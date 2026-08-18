package starcraft.ver_5;

public class GameTest2 {
    public static void main(String[] args) {
        Unit team1 = new Marine("마린1");
        Unit team2 = new Zealot("질럿1");
        Unit team3 = new Zergling("저글링1");

        team1.TeamMate(team2);
        team1.TeamMate(team3);
        team2.TeamMate(team3);
    }
}
