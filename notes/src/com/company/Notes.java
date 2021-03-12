package com.company;
import java.awt.event.*;
import javax.swing.*;

class Main extends JFrame implements ActionListener {
    static JTextField text;
    static JFrame frame;
    static JButton button;
    static JLabel label;

    public static void main(String[] args)
    {
        frame = new JFrame("notes");
        label = new JLabel("nothing entered");
        button = new JButton("submit");
        Main no = new Main();
        button.addActionListener(no);
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
            label.setText(text.getText());
            text.setText("  ");
        }
    }
}