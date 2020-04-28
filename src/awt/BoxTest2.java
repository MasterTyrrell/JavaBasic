package awt;

import javax.swing.*;
import java.awt.*;

public class BoxTest2 {
    private Frame f = new Frame();
    private Box b1 = Box.createHorizontalBox();

    private Box b2 = Box.createVerticalBox();
    public void init(){

        Box.createVerticalStrut(2);
        b1.add(new Button("��ťһ"));
        b1.add(Box.createHorizontalGlue());
        b1.add(new Button("��ť��"));
        b2.add(new Button("��ť��"));
        b2.add(Box.createVerticalGlue());
        b2.add(new Button("��ť��"));
        f.add(b1,BorderLayout.NORTH);
        f.add(b2);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxTest2().init();
    }
}
