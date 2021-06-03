package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import sk.stuba.fei.uim.oop.Tree;

public class ExamRT {
    public static void main(String[] args) {
        JFrame f = new JFrame("Draw Box Mouse 2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(new Tree());
        f.setSize(300, 300);
        f.setVisible(true);
    }
//
//    public ExamRT() {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//                    ex.printStackTrace();
//                }
//
//                JFrame frame = new JFrame("Testing");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                Tree t = new Tree();
//                frame.add(t);
//                t.drawShape(frame.getGraphics());
//                frame.pack();
//                frame.setLocationRelativeTo(null);
//                frame.setVisible(true);
//            }
//        });
//    }
}
