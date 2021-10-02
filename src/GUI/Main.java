package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    int realScore = 0;
    int milanScore = 0;

    private String LastScorer;

    JButton realButton = new JButton("Real Madrid");
    JButton milanButton = new JButton("AC Milan");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    JPanel[] pannel = new JPanel[4];

    Main() {
        super("GUI app");
        setLayout(new GridLayout(5, 1));
        setSize(640, 640);
        for (int i = 0; i < 4; i++) {
            pannel[i] = new JPanel();
            add(pannel[i]);
        }
        pannel[0].add(realButton);
        pannel[0].add(milanButton);
        pannel[1].add(result);
        pannel[2].add(lastScorer);
        pannel[3].add(winner);

        setVisible(true);

        realButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                realScore++;
                updateResult();
                updateWinner();
                LastScorer = "Real Madrid";
                updateLastScorer();

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        milanButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                updateResult();
                updateWinner();
                LastScorer = "AC Milan";
                updateLastScorer();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void updateLastScorer() {
        this.lastScorer.setText("Last Scorer: " + LastScorer);
    }


    void updateResult() {
        this.result.setText("Result: " + realScore + ":" + milanScore);
    }

    void updateWinner() {
        String newWinner;
        if (realScore == milanScore) {
            this.winner.setText("Winner: : DRAW");
        } else {
            if (realScore > milanScore) {
                this.winner.setText("Winner: : Real Madrid");
            } else {
                this.winner.setText("Winner: : AC Milan");
            }
        }


    }

    public static void main(String[] args) {
        new Main();
    }
}
