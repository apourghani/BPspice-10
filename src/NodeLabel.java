import javax.swing.*;
import java.awt.*;

public class NodeLabel extends JPanel {
    int x1, x2, y1, y2;

    public NodeLabel(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        setBounds(x1*111-56, y1*84-48, x2*84-48, y2*84-48);

        g.setColor(Color.RED);

        g.fillOval(0,0,3,3);

    }
}