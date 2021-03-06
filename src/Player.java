import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player {
    int x;
    int y;
    int velX = 0;
    int velY = 0;

    private LinkedList<Enemy> e = Controller.getEnemyBounds();


    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void update(){
        x += velX;
        y += velY;

        // basic collision
        if(x < 0) x=1;
        if(x > 600-16) x = 600-16;  // if(x > 600-16) x = -(600-16);

        if(y < 0) y=1;
        if(y > 348) y = 348;  // if(x > 400-16) x = -(400-16);

        // collision checking
        for(int i=0 ; i<e.size(); i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                System.out.println("Collision");
            }
        }

    }

    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_RIGHT){
            velX += 5;
        } else if (code == KeyEvent.VK_LEFT) {
            velX -= 5;
        } else if (code == KeyEvent.VK_UP) {
            velY -= 5;
        } else if (code == KeyEvent.VK_DOWN){
            velY += 5;
        }
    }

    public void keyReleased(KeyEvent e){
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_RIGHT){
            velX = 0;
        } else if (code == KeyEvent.VK_LEFT) {
            velX = 0;
        } else if (code == KeyEvent.VK_UP) {
            velY = 0;
        } else if (code == KeyEvent.VK_DOWN){
            velY = 0;
        }
    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, 16, 16);
    }

    public void draw(Graphics2D g2d){
        //System.out.println("Hello from draw");
        g2d.drawImage(getPlayerImage(), x, y, null);
        g2d.draw(getBounds());

        //g2d.fillRect(40, 50, 60, 80);

    }

    Image getPlayerImage(){
        ImageIcon i = new ImageIcon(getClass().getResource("/player.png"));

        return i.getImage();
    }
}
