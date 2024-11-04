package Enemy;
import javax.swing.*;
import java.awt.*;
public class PostureEnemy2 {
    Image attack;
    Image stunt;
    Image dead;
    Image run;

    public PostureEnemy2() {
        attack = new ImageIcon(PostureEnemy2.class.getResource("/image/Enemy2Attack.gif")).getImage();
        stunt = new ImageIcon(PostureEnemy2.class.getResource("/image/Enemy2stunt.png")).getImage();
        dead = new ImageIcon(PostureEnemy2.class.getResource("/image/Enemy2Dead.png")).getImage();
        run = new ImageIcon(PostureEnemy2.class.getResource("/image/Enemy2Run.gif")).getImage();
    }
    public void draw(Graphics g, Enemy.Enemy2_Charactor enemy2, int x, int y, boolean Flipped) {
        if (enemy2.Dead) {
            drawFlippedImage(g, dead, x, y, 450, 450, Flipped);
        } else if (enemy2.Stunned) {
            drawFlippedImage(g, stunt, x, y+70, 400, 400, Flipped);
        } else if (enemy2.Attacking) {
            drawFlippedImage(g, attack, x, y, 450, 450, Flipped);
        } else{
            drawFlippedImage(g, run, x, y+45, 450, 400, Flipped);
        } 
    }
    private void drawFlippedImage(Graphics g, Image img, int x, int y, int width, int height, boolean flip) {
        Graphics2D g2d = (Graphics2D) g;
        if (flip) {
            g2d.drawImage(img, x + width, y, -width, height, null);
        } else {
            g2d.drawImage(img, x, y, width, height, null);
        }
    }
}
