package Lab4;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private static Window myWindow;
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    JButton realButton = new JButton("Real Madrid");
    JButton milanButton = new JButton("AC Milan");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");


    private Window() {
        super("GUI app");
        setLayout(new FlowLayout());
        setSize(640, 640);
    }

    public static Window getInstance() {
        if (myWindow == null)
            myWindow = new Window();
        return myWindow;
    }




}
