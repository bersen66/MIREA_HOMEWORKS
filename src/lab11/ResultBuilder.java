package lab11;

import java.util.ArrayList;

public class ResultBuilder {
    ArrayList<HorseRunner> results;

    public ResultBuilder() {
        this.results = new ArrayList<>();
    }

    public synchronized void AddEntry(HorseRunner h) {
        results.add(h);
    }

    ArrayList<HorseRunner> getResults() {
        return results;
    }
}
