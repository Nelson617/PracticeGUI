
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Homework1 {

    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label;
    private JTextArea textArea;
    private JButton button1;
    private JButton button2;

        public static void main(String[] args) {
            Example1 ex = new Example1();
        }

        public Homework1() {
            mainFrame = new JFrame();
            mainFrame.setSize(400, 400);

            panel = new JPanel();

            panel.setLayout(new BorderLayout());

            panel.setLayout(new GridLayout(3, 1));

        }
    }

