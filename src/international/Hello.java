package international;

import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {
    public static void main(String[] args) {
        //取得系统默认的国家
        var myLocale = Locale.getDefault(Locale.Category.FORMAT);
        //根据指定的国家/语言环境加载资源文件
        var bundle = ResourceBundle.getBundle("mess",myLocale);
        //打印从资源文件中取得的消息
        System.out.println(bundle.getString("hello"));
    }
}
