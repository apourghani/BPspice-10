import javax.swing.*;
import java.awt.*;

public class ResistorLabel extends JLabel {
    int orientation = 0, x1, x2, y1, y2;

    public ResistorLabel(int orientation, int x1, int y1, int x2, int y2) {
        this.orientation = orientation;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
   //   ImageIcon resistorHorizontal=new ImageIcon("resistorHorizontal");
   //   ImageIcon resistorVertical=new ImageIcon("resistorVertical");
   //   if(orientation==0)
   //       this.add(resistorHorizontal);

    }









  //  @Override
 // public void paintComponent(Graphics g) {


 //     setPreferredSize(new Dimension (800,200));

 //     super.paintComponent(g);
 // //850,60,670,420
 //     Graphics2D g2d = (Graphics2D) g;
 //     g2d.setStroke(new BasicStroke(2));
 //     g2d.setColor(Color.black);

 //     Image resistorImage;
 //     //setBounds(x1*111-56, y1*84-48, x2*84-48, y2*84-48);

 //     //a*111-56  b*84-48

 //     g2d.drawLine(800,1000,200,600);

 //     if (orientation == 0) {

 //         Toolkit t=Toolkit.getDefaultToolkit();
 //         resistorImage=t.getImage("resistorHorizontal");
 //         g2d.drawImage(resistorImage, 900,200,this);

 //     }
 //     else {
 //         Toolkit t=Toolkit.getDefaultToolkit();
 //         resistorImage=t.getImage("resistorVertical");
 //         g.drawImage(resistorImage, 120,100,this);
 //     }
 // }
}
