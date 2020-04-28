package awt;

import java.awt.*;

public class CommonComponent {
    Frame f = new Frame("测试");
    //定义一个按钮
    Button ok = new Button("确认");
    CheckboxGroup cbg = new CheckboxGroup();
    //定义一个单选框（处于cbg一组）初始化被选中
    Checkbox male = new Checkbox("男",cbg,true);
    //定义一个单选框（处于cbg一组）初始化未被选中
    Checkbox female = new Checkbox("女",cbg,false);
    //定义一个复选框，初始处于没有选中状态
    Checkbox married = new Checkbox("是否已婚？",false);
    //定义一个下拉选择框
    Choice  colorChooser = new Choice();
    //定义一个列表选择框
    List colorList = new List(6,true);
    //定义一个5行、20列的多行文本框
    TextArea ta = new TextArea(5,20);
    TextField name = new TextField(50);
   public void init(){
       colorChooser.add("红色");
       colorChooser.add("绿色");
       colorChooser.add("蓝色");

       colorList.add("红色");
       colorList.add("绿色");
       colorList.add("蓝色");

       //创建一个撞他文本框，按钮的Panel
       var bottom = new Panel();
       bottom.add(name);
       bottom.add(ok);
       f.add(bottom,BorderLayout.SOUTH);
       //创建一个装载下拉选择框，三个CheckBox的Panel
       var checkPanel = new Panel();
       checkPanel.add()
    }

    public static void main(String[] args) {

    }
}
