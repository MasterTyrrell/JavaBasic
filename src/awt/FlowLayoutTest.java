package awt;

import java.awt.*;


/**
 * 流水线布局，一流一流的
 */
public class FlowLayoutTest {
    public static void main(String[] args) {
        var f = new Frame("测试窗口");
        f.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
        for(var i=0;i<10;i++)   {
            f.add(new Button("按钮"+i));
        }
        f.pack();
        f.setVisible(true);
    }
}
