package com.solvd.onlineshop.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CredentialValues {

    public CredentialValues(String s) {
    }

    private static final Logger logger = LogManager.getLogger(CredentialValues.class);
    private final Properties properties = new Properties();
    private String driverName;
    private String url;
    private String name;
    private String password;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void getPropValues(String value) throws IOException {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(value);
            if (inputStream != null) {
                properties.load(inputStream);
            }
            url = properties.getProperty("url");
            driverName = properties.getProperty("drivername");
            name = properties.getProperty("name");
            password = properties.getProperty("password");
        } catch (IOException e) {
            logger.error("Exception:  " + e);
        }
    }
}
