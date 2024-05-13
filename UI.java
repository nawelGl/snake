import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UI implements KeyListener {
    //Interface du jeu
    private JFrame userInterface;
    private int longueur = 500;
    private int largeur = 700;
    private JPanel titlePanel;
    private JPanel gamePanel;
    private JPanel scorePanel;
    private GridBagConstraints gbc;
    private Snake snake;

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
        gameTitleLabel.setBounds(145, 40, 300,40);
        titlePanel.add(gameTitleLabel);
        userInterface.getContentPane().add(BorderLayout.NORTH, titlePanel);

        //Panel de jeu :
        gamePanel = new JPanel();
        gamePanel.setBackground(Color.decode("#E5E8E8"));
        gamePanel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                JLabel caseJeu = new JLabel();
                caseJeu.setOpaque(true);
                if ((i + j) % 2 == 0) {
                    caseJeu.setBackground(Color.decode("#D8E7B5"));
                } else {
                    caseJeu.setBackground(Color.decode("#F2BDE3"));
                }
                gbc.gridx = j;
                gbc.gridy = i;
                gbc.fill = GridBagConstraints.BOTH;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gamePanel.add(caseJeu, gbc);

                caseJeu.setPreferredSize(new Dimension(50, 50));
            }
        }
        snake = new Snake();
        snake.displaySnake(gbc, gamePanel);
        userInterface.getContentPane().repaint();
        userInterface.getContentPane().revalidate();
        userInterface.getContentPane().add(BorderLayout.CENTER, gamePanel);

        //Panel de score :
        scorePanel = new JPanel();
        scorePanel.setBackground(Color.decode("#E1C9DF"));
        scorePanel.setPreferredSize(new Dimension(longueur, 100));
        scorePanel.setLayout(null);
        JLabel scoreLabelTitre = new JLabel();
        scoreLabelTitre.setText("Votre score :");
        scoreLabelTitre.setForeground(Color.WHITE);
        scoreLabelTitre.setFont(new Font("Avenir", Font.BOLD, 20));
        scoreLabelTitre.setBounds(200, 25, 200,40);
        scorePanel.add(scoreLabelTitre);
        userInterface.getContentPane().add(BorderLayout.SOUTH, scorePanel);

        userInterface.addKeyListener(this);
        userInterface.setVisible(true);
        userInterface.requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                System.out.println("Flèche haut pressée");
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("Flèche bas pressée");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("Flèche gauche pressée");
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("Flèche droite pressée");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}
