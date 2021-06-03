package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import sk.stuba.fei.uim.oop.Tree;

public class ExamRT {
    public static void main(String[] args) {
        Graphic graphic = new Graphic();
        graphic.Paint();
    }

    public ExamRT() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Tree());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
