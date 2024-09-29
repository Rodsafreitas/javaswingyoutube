package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Screen extends JFrame implements ItemListener {

    public Screen() {
        setTitle("Aula JCheckBox");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JCheckBox c1 = new JCheckBox("concordo com os termos", true);
        c1.setName("c1");

        JCheckBox c2 = new JCheckBox("exemplo 2", true);
        c2.setName("c2");

        c1.addItemListener(this);
        c2.addItemListener(this);

        add(c1);
        add(c2);
        setVisible(true);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getItem().getClass() == JCheckBox.class) {
            JCheckBox jCheckBox = (JCheckBox) e.getSource();
            System.out.println(jCheckBox.getName() + " - " + jCheckBox.isSelected());
        }
    }
}
