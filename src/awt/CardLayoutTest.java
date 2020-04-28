package awt;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * 重叠布局
 */
public class CardLayoutTest {

    Frame f = new Frame("测试窗口");
    String[] names = {"第一张","第二张","第三张","第四张","第五张"};
    Panel p1 = new Panel();
    public void init(){
        final var c = new CardLayout();
        p1.setLayout(c);
        for(var n=0;n<names.length;n++){
            //这里使用的名称，是在下方调用show方法时去对应找的
            p1.add(names[n],new Button(names[n]));
        }
        var p = new Panel();
        ActionListener listener = e->{
            switch (e.getActionCommand())
            {
                case "上一张":
                    c.previous(p1);
                    break;
                case "下一张":
                    c.next(p1);
                    break;
                case "第一张":
                    c.first(p1);
                    break;
                case "最后一张":
                    c.last(p1);
                    break;
                case "第三张":
                    c.show(p1,"第三张");
                    break;
            }
        };
        var button1 = new Button("上一张");
        button1.addActionListener(listener);
        var button2 = new Button("下一张");
        button2.addActionListener(listener);
        var button3 = new Button("第一张");
        button3.addActionListener(listener);
        var button4 = new Button("最后一张");
        button4.addActionListener(listener);
        var button5 = new Button("第三张");
        button5.addActionListener(listener);
        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);
        p.add(button5);
        f.add(p1);
        f.add(p,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutTest().init();
    }
}
