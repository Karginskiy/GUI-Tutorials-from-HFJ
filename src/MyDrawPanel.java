import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(Color.RED);
        g.fillRect(20, 50, 100, 100);

    }
}
