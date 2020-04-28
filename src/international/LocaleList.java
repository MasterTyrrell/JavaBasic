package international;

import java.util.Locale;

public class LocaleList {
    public static void main(String[] args) {
        //返回java所支持的所有国家和语言的数组
        Locale[] localeList  = Locale.getAvailableLocales();
        for(Locale locale:localeList){
            //输出所支持的国家和语言
            System.out.println(new StringBuilder(locale.getDisplayCountry()).append("=").append(locale.getCountry()).append(" ").append(locale.getDisplayLanguage()).append("=").append(locale.getLanguage()));
        }
    }
}
