package util;

import bot.CobotFactory;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by avrabie on 12/6/2016.
 */
public class ResourcesPath {
    private static String resourcePath;

    private ResourcesPath(){}

    public static String getResourcePath(){
        String os = System.getProperty("os.name");
        if(os.contains("Windows")){
            resourcePath = CobotFactory.class.getClassLoader().getResource("").getPath().substring(1);
        }
        else {
            resourcePath = CobotFactory.class.getClassLoader().getResource("").getPath();
        }
        return resourcePath;
    }

    public static String getResourcePath(String server) {
        String os = System.getProperty("os.name");
        /*if(os.contains("Windows")){
            resourcePath = "D:\\Work\\GitProjects\\cobot3\\cobot-integration\\src\\main\\resources";
            return resourcePath;
        }*/

        if (os.contains("Windows")){
            if(server.contains("cat")){
                resourcePath = "..\\webapps\\cobot\\WEB-INF\\classes";
            }
            else{
                resourcePath = "WEB-INF\\classes\\";
            }
        } else {
            if (server.contains("cat")) {
                resourcePath = "../webapps/cobot/WEB-INF/classes";
            }
            else {
                resourcePath = "/WEB-INF/classes/";

            }
        }
        return resourcePath;
    }



}
