import java.awt.*;
import java.util.LinkedList;

public class Controller {
    LinkedList <Enemy> e = new LinkedList<>();

    Enemy tempEnemy;

    public Controller(){
        addEnemy(new Enemy(100, 100));
        addEnemy(new Enemy(200, 100));
        addEnemy(new Enemy(300, 100));
        addEnemy(new Enemy(300, 50));
    }

    public void draw(Graphics2D g2d){
        for(int i=0 ; i<e.size() ; i++){
            tempEnemy = e.get(i);
            tempEnemy.draw(g2d);
        }
    }
    public void update(){
        for(int i=0 ; i<e.size() ; i++){
            tempEnemy = e.get(i);
            tempEnemy.update();
        }
    }

    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }

    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }

}
