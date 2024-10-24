import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 implements ActionListener {

    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label, label2;
    private JTextArea textArea;
    private JButton button1;
    private JButton button2;
    private int count = 0;

    public static void main(String[] args) {
        Example1 ex = new Example1();
    }

    public Example1() {
        mainFrame = new JFrame();
        mainFrame.setSize(400,400);

        panel = new JPanel();

        panel.setLayout(new BorderLayout());

        panel.setLayout(new GridLayout(3, 1));

        label = new JLabel("Label 1");

        label2 = new JLabel("Label 2");

        textArea = new JTextArea();



        button1 = new JButton("Button 1 ");
        button1.addActionListener(this);

        button2 = new JButton("Button 2 ");
        button2.addActionListener(this);

        panel.add(textArea, BorderLayout.SOUTH);

        panel.add(button1, BorderLayout.NORTH);

        panel.add(label, BorderLayout.CENTER);

        mainFrame.add(panel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();


        mainFrame.setTitle("Touch The Button");

        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Button 1")){
            System.out.println("Button 1 clicked");
            count++;
            label.setText("Number of clicks" + count);
        }

        else if (command.equals("Button 2")) {
            String text = textArea.getText();

            label.setText(text);
        }

    }
}
