import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrackerGUI implements ActionListener {
    TrackerGUI() {
        JFrame frame = new JFrame("Finance Tracker");


        JTextField tf = new JTextField("Left: ");
        tf.setBounds(315, 30, 35, 20);
        tf.setEditable(false);

        JTextField tf1 = new JTextField("Total Income: ");
        tf1.setBounds(15, 30, 90, 20);
        tf1.setEditable(false);

        JTextField tf2 = new JTextField("Total Expense: ");
        tf2.setBounds(165, 30, 90, 20);
        tf2.setEditable(false);

        JTextField tf3 = new JTextField();
        tf3.setBounds(165, 150, 90, 20);
        JButton button1 = new JButton("Add income");
        button1.setBounds(15, 150, 110, 20);

        JTextField tf4 = new JTextField();
        tf4.setBounds(165, 175, 90, 20);
        JButton button2 = new JButton("Add expense");
        button2.setBounds(15, 175, 110, 20);



        button1.addActionListener(this);
        frame.add(button1);
        frame.add(button2);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);
        frame.add(tf);


        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}