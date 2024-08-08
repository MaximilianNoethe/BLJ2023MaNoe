import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailedGUI {
    JFrame frame = new JFrame("Finance Tracker");
    JLabel lb;
    Tracker t = new Tracker();

    DetailedGUI() {
        lb = new JLabel("TEST");
        lb.setBounds(0, 0, 100, 50);
        lb.setFont(new Font(null, Font.PLAIN, 25)); // IMPORTANT FOR TRACKERGUI CLASS

        frame.add(lb);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(450, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
