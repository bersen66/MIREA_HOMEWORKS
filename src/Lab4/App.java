package Lab4;

import javax.swing.*;

public class App {
    private Window window;
    private StatisticKeeper statisticKeeper;




    App() {
        window = Window.getInstance();
        statisticKeeper = new StatisticKeeper();

        statisticKeeper.addTeam("Madrid");
        statisticKeeper.addTeam("Real");



       // window.addButton("Madrid");
       // window.addButton("Real");

        window.setVisible(true);

    }

    public static void main(String[] args) {
        new App();
    }
}
