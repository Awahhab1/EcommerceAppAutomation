package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configProperties {

    public static Properties property;
    private  static String configPath= "src/test/java/Configuration/configsetting.properties";

    public static  void initializePropertyFile()  {
        property = new Properties();
        InputStream instm= null;
        try {
            instm = new FileInputStream(configPath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            property.load(instm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
