import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBirdClone implements ActionListener, KeyListener {
    private JFrame frame;
    private GamePanel gamePanel;
    private Timer timer;
    private ArrayList<Rectangle> pipes;
    private int birdY, birdVelocity, score;
    private boolean gameOver, started;
    private static final int WIDTH = 800, HEIGHT = 600, PIPE_WIDTH = 100, PIPE_HEIGHT = 50, GAP = 200;

    public FlappyBirdClone() {
        frame = new JFrame("Flappy Bird Clone");
        gamePanel = new GamePanel();
        timer = new Timer(20, this);
        pipes = new ArrayList<>();
        birdY = HEIGHT / 2;
        birdVelocity = 0;
        score = 0;
        gameOver = false;
        started = false;

        frame.add(gamePanel);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.setVisible(true);

        addPipe(true);
        addPipe(true);
        addPipe(true);
        addPipe(true);

        timer.start();
    }

    public static void main(String[] args) {
        new FlappyBirdClone();
    }

    private void addPipe(boolean start) {
        int space = HEIGHT / 5;
        int pipeHeight = 50 + new Random().nextInt(space);
        if (start) {
            pipes.add(new Rectangle(WIDTH + PIPE_WIDTH + pipes.size() * 300, HEIGHT - pipeHeight - PIPE_HEIGHT, PIPE_WIDTH, PIPE_HEIGHT));
            pipes.add(new Rectangle(WIDTH + PIPE_WIDTH + (pipes.size() - 1) * 300, 0, PIPE_WIDTH, HEIGHT - pipeHeight - GAP));
        } else {
            pipes.add(new Rectangle(pipes.get(pipes.size() - 1).x + 600, HEIGHT - pipeHeight - PIPE_HEIGHT, PIPE_WIDTH, PIPE_HEIGHT));
            pipes.add(new Rectangle(pipes.get(pipes.size() - 1).x, 0, PIPE_WIDTH, HEIGHT - pipeHeight - GAP));
        }
    }

    private void paintPipe(Graphics g, Rectangle pipe) {
        g.setColor(Color.GREEN);
        g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
    }

    private void jump() {
        if (gameOver) {
            birdY = HEIGHT / 2;
            pipes.clear();
            birdVelocity = 0;
            score = 0;

            addPipe(true);
            addPipe(true);
            addPipe(true);
            addPipe(true);

            gameOver = false;
        }

        if (!started) {
            started = true;
        }

        birdVelocity = -10;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int speed = 10;
        if (started) {
            for (int i = 0; i < pipes.size(); i++) {
                Rectangle pipe = pipes.get(i);
                pipe.x -= speed;
            }

            if (pipes.size() > 0 && pipes.get(0).x + PIPE_WIDTH < 0) {
                pipes.remove(0);
                pipes.remove(0);
                addPipe(false);
            }

            birdVelocity += 2;
            birdY += birdVelocity;

            for (Rectangle pipe : pipes) {
                if (pipe.intersects(new Rectangle(WIDTH / 4, birdY, 20, 20))) {
                    gameOver = true;
                }
            }

            if (birdY > HEIGHT - 120 || birdY < 0) {
                gameOver = true;
            }

            if (!gameOver && started) {
                score++;
            }
        }

        gamePanel.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            jump();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    private class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.CYAN);
            g.fillRect(0, 0, WIDTH, HEIGHT);

            g.setColor(Color.ORANGE);
            g.fillRect(0, HEIGHT - 120, WIDTH, 120);

            g.setColor(Color.GREEN);
            g.fillRect(0, HEIGHT - 120, WIDTH, 20);

            g.setColor(Color.RED);
            g.fillRect(WIDTH / 4, birdY, 20, 20);

            for (Rectangle pipe : pipes) {
                paintPipe(g, pipe);
            }

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.PLAIN, 100));

            if (!started) {
                g.drawString("Press SPACE to Start", 75, HEIGHT / 2 - 50);
            }

            if (gameOver) {
                g.drawString("Game Over", 200, HEIGHT / 2 - 50);
            }

            if (!gameOver && started) {
                g.drawString(String.valueOf(score), WIDTH / 2 - 25, 100);
            }
        }
    }
}
