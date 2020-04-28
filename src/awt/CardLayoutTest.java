package awt;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * �ص�����
 */
public class CardLayoutTest {

    Frame f = new Frame("���Դ���");
    String[] names = {"��һ��","�ڶ���","������","������","������"};
    Panel p1 = new Panel();
    public void init(){
        final var c = new CardLayout();
        p1.setLayout(c);
        for(var n=0;n<names.length;n++){
            //����ʹ�õ����ƣ������·�����show����ʱȥ��Ӧ�ҵ�
            p1.add(names[n],new Button(names[n]));
        }
        var p = new Panel();
        ActionListener listener = e->{
            switch (e.getActionCommand())
            {
                case "��һ��":
                    c.previous(p1);
                    break;
                case "��һ��":
                    c.next(p1);
                    break;
                case "��һ��":
                    c.first(p1);
                    break;
                case "���һ��":
                    c.last(p1);
                    break;
                case "������":
                    c.show(p1,"������");
                    break;
            }
        };
        var button1 = new Button("��һ��");
        button1.addActionListener(listener);
        var button2 = new Button("��һ��");
        button2.addActionListener(listener);
        var button3 = new Button("��һ��");
        button3.addActionListener(listener);
        var button4 = new Button("���һ��");
        button4.addActionListener(listener);
        var button5 = new Button("������");
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
