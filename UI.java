import javax.swing.*;
import java.awt.*;

public class UI {
    //Interface du jeu
    private JFrame userInterface;
    private int longueur = 500;
    private int largeur = 700;
    private JPanel titlePanel;
    private JPanel gamePanel;
    private JPanel scorePanel;

    public UI(){
        userInterface = new JFrame();
        userInterface.setSize(longueur, largeur);
        userInterface.setLocationRelativeTo(null);
        userInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel de titre :
        titlePanel = new JPanel();
        titlePanel.setBackground(Color.decode("#CCCCFF"));
        titlePanel.setPreferredSize(new Dimension(longueur, 100));
        userInterface.getContentPane().add(BorderLayout.NORTH, titlePanel);

        //Panel de jeu :
        gamePanel = new JPanel();
        gamePanel.setBackground(Color.decode("#E5E8E8"));
        userInterface.getContentPane().add(BorderLayout.CENTER, gamePanel);

        //Panel de score :
        scorePanel = new JPanel();
        scorePanel.setBackground(Color.decode("#CCCCFF"));
        scorePanel.setPreferredSize(new Dimension(longueur, 100));
        userInterface.getContentPane().add(BorderLayout.SOUTH, scorePanel);


        userInterface.setVisible(true);
    }
}
