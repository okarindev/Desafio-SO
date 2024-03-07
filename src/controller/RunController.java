package controller;
import view.Layout;
import view.WindowError;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class RunController {
    public RunController(Layout frame, JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionSearch(frame);
            }
        });
    }

    public void actionSearch(Layout frame){
        try {
            runCmd(frame.textField.getText());
            frame.dispose();

        } catch (Exception e) {
            new WindowError(frame,frame.textField.getText());
        }

    }

    public void runCmd(String param) throws Exception{
        
        if(param.length() == 0){
            throw new Exception();
        }

        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "start", param);
        Process processo = processBuilder.start();
        processo.waitFor();
    }
}
