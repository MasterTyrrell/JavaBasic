package awt;

import java.awt.*;

public class FrameTest {

    public static void main(String[] args) {
        var fram = new Frame("测试窗口");
        //设置窗口的大小
        fram.setBounds(30,30,250,200);
        fram.setVisible(true);
    }
}
