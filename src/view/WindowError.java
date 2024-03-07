package view;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowError {



    public WindowError(Layout frame, String param){
        showError(param,"Ocorreu um erro!");
    }

    public void showError(String title, String errorMessage) {
        JFrame frame = new JFrame(title);
        JLabel label = new JLabel(errorMessage);
        frame.setLayout(new BorderLayout());
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
