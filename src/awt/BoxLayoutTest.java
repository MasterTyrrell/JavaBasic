package awt;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    private Frame f = new Frame("���Դ���");

    public void init(){
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        f.add(new Button("��ťһ"));
        f.add(new Button("��ť��"));
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest().init();
    }
}
