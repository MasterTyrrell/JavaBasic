package awt;

import java.awt.*;

/**
 * ���Զ�λ
 */
public class NullLayoutTest {

    Frame f = new Frame("���Դ���");
    Button b1 = new Button("��ťһ");
    Button b2 = new Button("��ť��");

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
