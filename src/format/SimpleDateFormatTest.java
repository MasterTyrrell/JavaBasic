package format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        var d = new Date();
        var sdf1 = new SimpleDateFormat("Gyyyy年中第D天");
        var dateStr = sdf1.format(d);
        System.out.println(dateStr);
        var str = "14###3月##21";
        var sdf2 = new SimpleDateFormat("y###MMM##d");
        System.out.println(sdf2.parse(str));
    }
}
