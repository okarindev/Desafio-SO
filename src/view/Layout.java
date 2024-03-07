package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class Layout extends JFrame{
    private Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int SCALE = 2;
    private final int WIDTH = 210*SCALE;
    private final int HEIGHT = 100*SCALE;
    private final int screen_w = (int)screensize.getWidth();
    private final int screen_h = (int)screensize.getHeight();
    public JTextField textField = new JTextField(20);
    public JButton button_ok = new JButton("OK");
    public JButton button_cancelar = new JButton("Cancelar");
    public JButton button_procurar = new JButton("Procurar");

    public Layout(){

        //System.out.println("Width: " + screen_w + " Height: " + screen_h);
        int scale = 2;
        String osName = System.getProperty("os.name");
        setFrame(scale,osName);
        setLayout();
    }
   
    public void setFrame(int scale, String osName){
        this.setTitle("Executar - " + osName);
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.MAGENTA);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLocation(50, screen_h - (HEIGHT + 50));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setLayout(){
        JLabel textTitle = new JLabel("Digite o caminho do executavél ou clique em procurar");
        JLabel textInput = new JLabel("Abrir:");
        String userDir = System.getProperty("user.dir");
        ImageIcon image = new ImageIcon(new ImageIcon(
            userDir+"\\src\\resources\\icon.png"
        )
        .getImage()
        .getScaledInstance(50, 50, Image.SCALE_DEFAULT));
                                                          
        JLabel icon = new JLabel(image);
        JPanel panel = new JPanel();  

        panel.setLayout(null);
        icon.setBounds(-24, -24, 100,100);
        textTitle.setBounds((WIDTH/7) + 10, 0, WIDTH, 50);
        textInput.setBounds(19, HEIGHT/4, WIDTH, 50);
        textField.setBounds(WIDTH/2 - 150, HEIGHT/3, 325, 20);
        button_ok.setBounds(WIDTH/4 - (45),HEIGHT/3 + (50),75,25);
        button_cancelar.setBounds(WIDTH/4 + (55),HEIGHT/3 + (50),100,25);
        button_procurar.setBounds(WIDTH/4 + (175),HEIGHT/3 + (50),100,25);

        panel.add(textField);
        panel.add(button_ok);
        panel.add(button_cancelar);
        panel.add(button_procurar);
        panel.add(textTitle);
        panel.add(textInput);
        panel.add(icon);

        this.add(panel);
    }
    
}
