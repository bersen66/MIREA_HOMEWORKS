package Lab4;

import java.util.HashMap;

public class StatisticKeeper {
    private HashMap<String, Integer>  teamsInfo = new HashMap<String, Integer>();

    public void addTeam(String teamTitle) {
        teamsInfo.put(teamTitle, 0);
    }

    public void incrementScore(String teamTitle) {
        teamsInfo.put(teamTitle, teamsInfo.get(teamTitle) + 1);
    }

    public String getResult() {
        return teamsInfo.toString();
    }
}
