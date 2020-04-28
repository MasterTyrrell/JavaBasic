package format;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        //需要被格式化的时间
        var dt = new Date();
        //创建两个Locale，分别代表中国，美国
        Locale[] locales = {Locale.CHINA,Locale.US};
        var df = new DateFormat[16];
        for(var i=0;i<locales.length;i++){
            df[8*i] = DateFormat.getDateInstance(DateFormat.SHORT, locales[i]);
            df[8*i+1] = DateFormat.getDateInstance(DateFormat.MEDIUM,locales[i]);
            df[8*i+2] = DateFormat.getDateInstance(DateFormat.LONG,locales[i]);
            df[8*i+3] = DateFormat.getDateInstance(DateFormat.FULL,locales[i]);
            df[8*i+4] = DateFormat.getTimeInstance(DateFormat.SHORT,locales[i]);
            df[8*i+5] = DateFormat.getTimeInstance(DateFormat.MEDIUM,locales[i]);
            df[8*i+6] = DateFormat.getTimeInstance(DateFormat.LONG,locales[i]);
            df[8*i+7] = DateFormat.getTimeInstance(DateFormat.FULL,locales[i]);
          }
        for(var i= 1;i<locales.length;i++){
            var tip = i==0?"---中文格式---":"---美国格式---";
            System.out.println(tip);
            System.out.println("SHORT格式的日期格式："+df[8*i].format(dt));
            System.out.println("MEDIUM格式的日期格式："+df[8*i+1].format(dt));
            System.out.println("LONG格式的日期格式："+df[8*i+2].format(dt));
            System.out.println("FULL格式的日期格式："+df[8*i+3].format(dt));
            System.out.println("SHORT格式的时间格式："+df[8*i+4].format(dt));
            System.out.println("MEDIUM格式的时间格式："+df[8*i+5].format(dt));
            System.out.println("LONG格式的时间格式："+df[8*i+6].format(dt));
            System.out.println("FULL格式的时间格式："+df[8*i+7].format(dt));
        }
    }
}
