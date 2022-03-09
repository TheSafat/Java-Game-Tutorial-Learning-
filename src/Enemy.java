import javax.swing.*;
import java.awt.*;

public class Enemy {
    int x;
    int y;

    public Enemy (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void update()
    {
        x -= 2;
        if(x < 0) x = 600;
        //y -= 5;
    }

    public void draw(Graphics2D g2d){
        System.out.println("hello from enemy");
        g2d.drawImage(getEnemyImage(), x, y, null);
    }

    Image getEnemyImage(){
        ImageIcon i = new ImageIcon(getClass().getResource("/enemy.png"));
        return i.getImage();
    }
}
