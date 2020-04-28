package awt;

import java.awt.*;

public class ScrollPaneTest {

    public static void main(String[] args) {
        var f = new Frame("测试编码");
        //创建一个ScrollPane容器
        var sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        //向ScrollPane容器，指定总是具有滚动条
        sp.add(new TextField("你好",20));
        //todo:这个按钮吧上面的文本框覆盖了3
        sp.add(new Button("单击我"));
        //将ScrollPane容器添加到Frame对象中
        f.add(sp);
        //设置窗口的大小，位置
        f.setBounds(30,30,250,130);
        f.setVisible(true);
    }
}
