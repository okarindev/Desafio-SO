package controller;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import view.Layout;

public class SearchController {

    public SearchController(Layout frame){

        JButton searchButton = frame.button_procurar;
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile(frame);
            }
        });
    }

    public void openFile(Layout frame){         
        JFileChooser fileChooser = new JFileChooser();
        int fileOpen = fileChooser.showOpenDialog(null);
        if (fileOpen == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            //System.out.println(selectedFile.getAbsolutePath());
            frame.textField.setText(selectedFile.getAbsolutePath());
        }
    }
}
