import java.util.ListResourceBundle;

/**
 * 国际化配置文件类，
 * TODO:
 * 代码会先扫描配置类，在扫描配置文件
 */
public class MyMess_zh_CN extends ListResourceBundle {

    private final Object[][] myData={
            {"msg","{0},你好！今天的日期是{1}"}
    };
    @Override
    protected Object[][] getContents() {
        return myData;
    }
}
