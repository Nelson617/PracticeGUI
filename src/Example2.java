import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 implements ActionListener {

    //declare Variables
    private JFrame mainFrame;
    private JPanel borderPanel;
    private JPanel gridPanel;
    private JButton button1, button2, button3, button4, button5;
    private JLabel label1, label2, label3, label4, label5, label6, label7;


    public static void main(String[] args) {
        Example2 ex = new Example2();
    }

    public Example2(){

        gridPanel = new JPanel(new GridLayout (2, 3));
        mainFrame = new JFrame("Example with grid inside boarder layout");
        borderPanel = new JPanel(new BorderLayout());


        button1 = new JButton("Button 1 ");
        button1.addActionListener(this);

        button2 = new JButton("Button 2 ");
        button2.addActionListener(this);

        button3 = new JButton("Button 3 ");
        button3.addActionListener(this);

        button4 = new JButton("Button 4 ");
        button4.addActionListener(this);

        button5 = new JButton("Button 5 ");
        button5.addActionListener(this);

        label1 = new JLabel("Label 1");

        label2 = new JLabel("Label 2");

        label3 = new JLabel("https://gotchab.com");

        label4 = new JLabel("label4");

        label5 = new JLabel("");

        label6 = new JLabel("");

        label7 = new JLabel("");


        gridPanel.setLayout(new GridLayout(2,3));
        gridPanel.add(button1);
        gridPanel.add(label5);
        gridPanel.add(button2);
        gridPanel.add(label6);
        gridPanel.add(label4);
        gridPanel.add(label7);

        mainFrame.add(borderPanel);

        borderPanel.add(gridPanel, BorderLayout.CENTER);
        borderPanel.add(label1, BorderLayout.WEST);
        borderPanel.add(label2, BorderLayout.EAST);
        borderPanel.add(label3, BorderLayout.NORTH);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 400);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
