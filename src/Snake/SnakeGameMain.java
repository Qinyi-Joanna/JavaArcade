package Snake;
import javax.swing.JFrame;

public class SnakeGameMain {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public static void main(String[] args) {
        final JFrame frame = new JFrame("--- Snake Game ---");
        frame.setSize(WIDTH, HEIGHT);
        final SnakeGame game = new SnakeGame(WIDTH, HEIGHT);
        frame.add(game);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
        game.startGame();
    }
}