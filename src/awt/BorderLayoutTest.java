package awt;

import java.awt.*;

import static java.awt.BorderLayout.*;

public class BorderLayoutTest {

    public static void main(String[] args) {
        var f = new Frame("测试窗口");
        f.setLayout(new BorderLayout(30,5));
        f.add(new Button("南"),SOUTH);
        f.add(new Button("北"),NORTH);
        f.add(new Button("中"));
        f.add(new Button("西"),WEST);
        f.add(new Button("东"),EAST);
        f.pack();
        f.setVisible(true);
    }
}
