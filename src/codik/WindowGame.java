package codik;

import javax.swing.*;

public class WindowGame {
    private Board board ;
    private Title title;
    private JFrame jFrame;

    public WindowGame() {
        jFrame = new JFrame("Tetris");
        jFrame.setSize(WIDTH, HEIGHT);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        board = new Board();
        title = new Title(this);
        jFrame.addKeyListener(board);
        jFrame.addKeyListener(title);
        jFrame.add(title);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        WindowGame windowGame = new WindowGame();
    }

    public static final int WIDTH = 445;
        public static final int HEIGHT = 629;
    public void startTetris() {
        jFrame.remove(title);
        jFrame.addMouseMotionListener(board);
        jFrame.addMouseListener(board);
        jFrame.add(board);
        board.startGame();
        jFrame.revalidate();
    }
}
