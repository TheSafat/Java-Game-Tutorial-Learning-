import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class Player {
    int x;
    int y;


    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void update(){
        x += 2;
        y += 1;
    }

    public void draw(Graphics2D g2d){
        //System.out.println("Hello from draw");
        g2d.drawImage(getPlayerImage(), x, y, null);

        //g2d.fillRect(40, 50, 60, 80);

    }

    Image getPlayerImage(){
        ImageIcon i = new ImageIcon(getClass().getResource("/player.png"));

        return i.getImage();
    }
}
