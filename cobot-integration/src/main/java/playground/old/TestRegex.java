package playground.old;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adri on 12/9/16.
 */
public class TestRegex {
    public static void main(String[] args) {
        String iaka = "Micada 1 randomdom 2. si iaka 3. mai mult no problem Iaia bre.";
//        iaka = iaka.replaceAll("(\\d+\\.)", "\n$1");
//        System.out.println(iaka);
        Pattern pattern = Pattern.compile("ia");
        Matcher matcher = pattern.matcher(iaka);
        /*StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb,"-iaia-");
        }
        System.out.println(sb);*/
        while (matcher.find()){
            iaka = matcher.replaceFirst("-some-");
            matcher = pattern.matcher(iaka);
        }
        //String iakaNew = matcher.replaceAll("oioi");
        System.out.println(iaka);


    }
}
