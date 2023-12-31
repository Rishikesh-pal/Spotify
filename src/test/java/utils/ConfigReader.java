package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static String readPropData(String propertyTobeRead) throws IOException {
//        Properties properties = new Properties();
//        FileInputStream fileInputStream =
//                new FileInputStream(System.getProperty(("user.dir")+"src/test/resources/config.properties"));
//        properties.load(fileInputStream);
//        return properties.getProperty(propertyTobeRead);
        Properties prop = new Properties();

        String path = System.getProperty("user.dir")+"//src//test//resources//config.properties";

        FileInputStream fis = new FileInputStream(path);

        prop.load(fis);

        String value = prop.getProperty(propertyTobeRead);

        return value;


    }
}
