import javax.swing.*;
import java.awt.*;

public class CanvasLine extends JComponent {

    public void paint(Graphics graphics)
    {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(1009,480,1520,480);
    }
}
