package main.GUI;

import main.Grid;
import main.GridBuilder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Properties;

public class GameOfLifeGUI extends JFrame {
    private JPanel panel;
    private Grid grid;
    private GameOfLifeView gameView;



    public GameOfLifeGUI () {
        panel = new JPanel();
        setTitle("Conway's Game of Life");
        setSize(600, 600);         //To Do - Figure out a way for the width and height to not be the same


        grid = (new GridBuilder(BoardProperties.BOARD_ROWS, BoardProperties.BOARD_COLUMNS).getGrid());
        gameView = new GameOfLifeView(grid);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new BorderLayout());

        panel.add(gameView, BorderLayout.CENTER);
        add(panel);


    }


    public static void main(String[] args) {
        new GameOfLifeGUI().setVisible(true);
    }
}





