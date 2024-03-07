package view;
import controller.CancelController;
import controller.RunController;
import controller.SearchController;

public class Main {
    public static void main(String[] args){
        Layout layout = new Layout();
        layout.setVisible(true);
        new RunController(layout, layout.button_ok);
        new CancelController(layout, layout.button_cancelar);
        new SearchController(layout);     
    }
}
