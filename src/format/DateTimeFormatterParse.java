package format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterParse {

    public static void main(String[] args) {
        //定义一个任一格式的日期，时间字符串
        var str1 = "2014==04==12 01时06分09秒";
        //根据需要解析的日期，时间字符串定义解析所用的格式器
        var formatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
        //执行解析
        var dt1 = LocalDateTime.parse(str1,formatter1);
        System.out.println(dt1);

    }
}
