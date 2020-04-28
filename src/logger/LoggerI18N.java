package logger;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerI18N {

    public static void main(String[] args) throws IOException {
        //加载国家化资源包
        var rc = ResourceBundle.getBundle("logMess", Locale.getDefault(Locale.Category.FORMAT));
        var logger = System.getLogger("fkjava",rc);
        Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
        Logger.getLogger("fkjava").setLevel(Level.INFO);
        logger.log(System.Logger.Level.DEBUG,"debug");
        logger.log(System.Logger.Level.INFO,"info");
        logger.log(System.Logger.Level.ERROR,"error");
    }
}
