package com.company;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

class Main extends JFrame implements ActionListener {
    static JTextField text;
    static JFrame frame;
    static JButton button;
    static JLabel label;
    ArrayList<String> notes = new ArrayList<String>();

    public static void main(String[] args)
    {
        frame = new JFrame("notes");
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
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            notes.add(text.getText());

            for (int i = 0; i<notes.size(); i++){
                label.setText(notes.get(i));
                System.out.println(notes.get(i));
            }
            //label.setText(text.getText());
            text.setText("  ");
        }
    }
}