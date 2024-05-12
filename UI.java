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
        titlePanel.setBackground(Color.decode("#E1C9DF"));
        titlePanel.setPreferredSize(new Dimension(longueur, 100));
        titlePanel.setLayout(null);
        JLabel gameTitleLabel = new JLabel();
        gameTitleLabel.setText("Snake, the game");
        gameTitleLabel.setForeground(Color.WHITE);
        gameTitleLabel.setFont(new Font("Avenir", Font.BOLD, 28));
        gameTitleLabel.setBounds(150, 40, 300,40);
        titlePanel.add(gameTitleLabel);
        userInterface.getContentPane().add(BorderLayout.NORTH, titlePanel);

        //Panel de jeu :
        gamePanel = new JPanel();
        gamePanel.setBackground(Color.decode("#E5E8E8"));
        userInterface.getContentPane().add(BorderLayout.CENTER, gamePanel);

        //Panel de score :
        scorePanel = new JPanel();
        scorePanel.setBackground(Color.decode("#E1C9DF"));
        scorePanel.setPreferredSize(new Dimension(longueur, 100));
        userInterface.getContentPane().add(BorderLayout.SOUTH, scorePanel);


        userInterface.setVisible(true);
    }
}
