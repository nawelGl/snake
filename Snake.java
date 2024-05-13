import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Snake {
    //Classe serpent
    //ArrayList pour les cases du serpent
    private ArrayList<Case> snake;

    public Snake(){
        snake = new ArrayList<>();
        Case case1 = new Case(1,3);
        Case case2 = new Case(1,4);
        Case case3 = new Case(1,5);
        snake.add(case1);
        snake.add(case2);
        snake.add(case3);
    }

    public void displaySnake(GridBagConstraints gbc, JPanel gamePanel){
        for (int i = 0; i < snake.size(); i++){
            JLabel partOfTheSnake = new JLabel();
            partOfTheSnake.setOpaque(true);
            partOfTheSnake.setBackground(Color.RED);
            gbc.gridx = snake.get(i).getX();
            gbc.gridy = snake.get(i).getY();
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gamePanel.add(partOfTheSnake, gbc);
            partOfTheSnake.setPreferredSize(new Dimension(50, 50));
        }
        gamePanel.repaint();
        gamePanel.revalidate();
    }
}
