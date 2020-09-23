package Example_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class front extends JFrame {
    int x = 0, y = 0;
    private JButton ACMilan = new JButton("AC Milan");
    private JButton RealMadrid = new JButton("Real Madrid");
    private JLabel Result = new JLabel("              Result:");
    private JLabel LastScorer = new JLabel("Last Scorer: N/A");
    private Label Win = new Label("Winner: DRAW");
    private JLabel EmptyContainer = new JLabel("");



    public front() {
        super("FOOTBALL SCORER");
        this.setBounds(100, 100, 500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2, 3, 2, 2));
        container.add(ACMilan);
        container.add(Result);
        container.add(RealMadrid);
        container.add(LastScorer);
        container.add(EmptyContainer);
        container.add(Win);
        ButtonGroup buttonGroup = new ButtonGroup();
        ACMilan.addActionListener(new ButtonEventListener1());
        RealMadrid.addActionListener(new ButtonEventListener2());
    }

    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent Event) {
            x++;
            LastScorer.setText("Last Scorer: AC Milan");
            Result.setText("              Result: " + String.valueOf(x) + " X " + String.valueOf(y));
            Win(x,y);
        }
    }

    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent Event) {
            y++;
            LastScorer.setText("Last Scorer: Real Madrid");
            Result.setText("              Result: " + String.valueOf(x) + " X " + String.valueOf(y));
            Win(x,y);
        }
    }

    public void Win (int x,int y)
    {
        if (x>y)
        {
            Win.setText("Winner: AC Milan");
        }
        if (x<y)
        {
            Win.setText("Winner: Real Madrid");
        }
        if (x==y)
        {
            Win.setText("Winner: DRAW");
        }
    }
}