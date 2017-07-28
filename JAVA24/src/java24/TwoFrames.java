package java24;

import javax.swing.*;
import java.awt.*;

public class TwoFrames extends JFrame {
    public TwoFrames(){
        super("First Frame");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        SecondFrame two = new SecondFrame();
        setVisible(true);
        two.setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // iqnore error
        }
    }
    
    public static void main(String[] args) {
        TwoFrames tf = new TwoFrames();
    }
}

class SecondFrame extends JFrame {
    SecondFrame() {
        super("Second Frame");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}