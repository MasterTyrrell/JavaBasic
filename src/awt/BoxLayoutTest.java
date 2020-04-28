package awt;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    private Frame f = new Frame("测试窗口");

    public void init(){
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        f.add(new Button("按钮一"));
        f.add(new Button("按钮二"));
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest().init();
    }
}
