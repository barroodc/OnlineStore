package com.solvd.onlineshop.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;


public class Jackson {

    private static final Logger LOGGER = LogManager.getLogger(Jackson.class);



    /*public static String serialize(File file){
        String json = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            file = new File(file.toString());
            json = objectMapper.writeValueAsString(file);
        } catch (JsonProcessingException e) {
            LOGGER.error(e);
        }

        return json;
    }

     */

    /*public static <T> T deserialize(String jsonString, Class<T> cls){
        T result = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            result = objectMapper.readValue(jsonString,cls);
        } catch (JsonProcessingException e) {
            LOGGER.error(e);
        }
        return result;
    }

     */

    public static void main(String[] args) {

    }

}
