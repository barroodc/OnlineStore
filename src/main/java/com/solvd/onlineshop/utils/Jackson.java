package com.solvd.onlineshop.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.onlineshop.model.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Jackson {

    private static final Logger LOGGER = LogManager.getLogger(Jackson.class);
    private static String serialization;
    private static ObjectMapper objectMapper = new ObjectMapper();


    public static void main(String[] args) {
        User user = new User();
        String jason = null;
        serialization(user);

        deserialize(jason);
    }

    private static void deserialize(String jason) {
        try {
            Jackson jackson = objectMapper.readValue(jason, Jackson.class);
            LOGGER.info(jackson.toString());
        } catch (JsonProcessingException e) {
            LOGGER.error(e);
        }
    }

    private static void serialization(User user) {
        try {
            serialization = objectMapper.writeValueAsString(user);
            LOGGER.info(serialization);
        } catch (JsonProcessingException e) {
            LOGGER.error(e);
        }
    }
}
