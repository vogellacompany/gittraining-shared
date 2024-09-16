package org.eclipse.example.calc;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hack {
    public static void main(String[] args) {
        System.out.println("Not a hack!"); //$NON-NLS-1$
    }
    
    public static void hackMe(JFrame frame) {
        JOptionPane.showMessageDialog(frame, "You are hacked!"); //$NON-NLS-1$
    }
}
