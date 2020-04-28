package awt;

import java.awt.*;

/**
 * 绝对定位
 */
public class NullLayoutTest {

    Frame f = new Frame("测试窗口");
    Button b1 = new Button("按钮一");
    Button b2 = new Button("按钮二");

    public void init(){
        f.setLayout(null);
        b1.setBounds(20,30,90,28);
        b2.setBounds(50,45,120,35);
        f.setBounds(50,50,200,100);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new NullLayoutTest().init();
    }
}
