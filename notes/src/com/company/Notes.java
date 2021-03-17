package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


class Main extends JFrame implements ActionListener {
    static JTextField text;
    static JFrame frame;
    static JButton button;
    static JLabel label;

    ArrayList<String> notes = new ArrayList<>();

    public static void main(String[] args)
    {
        frame = new JFrame("notes");
        frame.setLayout(new FlowLayout());
        label = new JLabel("nothing entered");
        button = new JButton("submit");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Main main = new Main();



        button.addActionListener(main);

        text = new JTextField(16);

        JPanel p = new JPanel();
            p.add(text);
            p.add(button);
            p.add(label);

        frame.add(p);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        if (s.equals("submit")) {

            notes.add(text.getText());
            JLabel[] labels;

            labels = new JLabel[notes.size()];
            JPanel panel = new JPanel();


            for (int i = 0; i<notes.size(); i++){

                labels[i] = new JLabel(notes.get(i));
                labels[i].setText(notes.get(i));
                panel.add(labels[i]);

                frame.add(panel);
                System.out.println(notes.get(i));
            }

            //label.setText(text.getText());
            text.setText("  ");
        }
    }
}