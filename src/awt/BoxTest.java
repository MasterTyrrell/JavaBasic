package awt;

import javax.swing.*;
import java.awt.*;

public class BoxTest {
    private Frame f = new Frame();
    private Box b1 = Box.createHorizontalBox();
    private Box b2 = Box.createVerticalBox();
    public void init(){
        b1.add(new Button("��ťһ"));
        b1.add(new Button("��ť��"));
        b2.add(new Button("��ť��"));
        b2.add(new Button("��ť��"));
        f.add(b1,BorderLayout.NORTH);
        f.add(b2);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxTest().init();
    }
}
