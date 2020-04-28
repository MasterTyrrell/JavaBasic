package format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //直接使用常量创建DateTimeFormatter格式器
        var dateFormatters = new DateTimeFormatter[]{
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                //使用本地化的不同风格来创建DateTimeFormatter格式器
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
        DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
        //根据模式字符串来创建DateTimeFormatter格式器
        DateTimeFormatter.ofPattern("Gyyyy%%MM%dd HH:mm:ss")
        };
        var date = LocalDateTime.now();

        for(var n=0;n<dateFormatters.length;n++){
            System.out.println(date.format(dateFormatters[n]));
            System.out.println(dateFormatters[n].format(date));
        }
    }
}
