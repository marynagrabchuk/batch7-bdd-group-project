package com.academy.techcenture.config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    private static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/config.properties";
    private ConfigReader(){}

    static {
        try {
            FileInputStream inputStream = new FileInputStream(CONFIG_FILE_PATH);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyName){
        return properties.getProperty(keyName);

    }
}
