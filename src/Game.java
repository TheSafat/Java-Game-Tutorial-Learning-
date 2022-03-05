import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {
    Timer timer;
    Player p;
    public Game(){
        setFocusable(true);
        timer = new Timer(35, this);
        timer.start();
        p = new Player(100, 100);
        addKeyListener(new KeyInput(p));
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        p.draw(g2d);
        //g2d.setBackground(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //System.out.println("action performed");
        p.update();
        repaint();
    }
}
