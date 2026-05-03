package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtils {

    Properties properties;

    public void initProperty() {

        properties = new Properties();
        try {
            properties.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }


}
