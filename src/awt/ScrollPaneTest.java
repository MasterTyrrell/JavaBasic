package awt;

import java.awt.*;

public class ScrollPaneTest {

    public static void main(String[] args) {
        var f = new Frame("���Ա���");
        //����һ��ScrollPane����
        var sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        //��ScrollPane������ָ�����Ǿ��й�����
        sp.add(new TextField("���",20));
        //todo:�����ť��������ı��򸲸���3
        sp.add(new Button("������"));
        //��ScrollPane������ӵ�Frame������
        f.add(sp);
        //���ô��ڵĴ�С��λ��
        f.setBounds(30,30,250,130);
        f.setVisible(true);
    }
}
