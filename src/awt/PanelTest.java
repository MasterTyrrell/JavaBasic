package awt;

import java.awt.*;

public class PanelTest {

    public static void main(String[] args) {
        var f = new Frame("���Դ���");
        var p = new Panel();
        p.add(new TextField(20));
        p.add(new Button("������"));
        f.add(p);
        f.setBounds(30,30,250,120);
        f.setVisible(true);
    }

}
