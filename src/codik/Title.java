package codik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Title extends JPanel implements KeyListener {

    private static final long serialVersionUID = 1L;
    private BufferedImage instructions;
    private WindowGame windowGame;
    private BufferedImage[] playButton = new BufferedImage[2];
    private Timer timer;

    public Title(WindowGame windowGame) {
        instructions = ImageLoader.loadImage("/Arrows.png");
        timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        this.windowGame = windowGame;

    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WindowGame.WIDTH, WindowGame.HEIGHT);
        g.drawImage(instructions, WindowGame.WIDTH / 2 - instructions.getWidth() / 2, 30 - instructions.getHeight() / 2 + 150, null);
        g.setColor(Color.WHITE);
        g.drawString("Press SPACE to continue" , 150, WindowGame.HEIGHT / 2 + 100);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_SPACE){
            windowGame.startTetris();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
