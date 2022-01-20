package com.solvd.onlineshop.utils;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.solvd.onlineshop.model.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class UserDeserialization extends StdDeserializer<User> {

    private static final Logger LOGGER = LogManager.getLogger(UserDeserialization.class);

    public UserDeserialization(){
        this(null);
    }

    public UserDeserialization(Class<?> deserialization) {
        super(deserialization);
    }

    @Override
    public User deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        User user = new User();
        ObjectCodec codec = jsonParser.getCodec();
        JsonNode node = codec.readTree(jsonParser);

        try {
            JsonNode firstNameNode = node.get("firstName");
            String firstName = firstNameNode.asText();
            user.setFirstName(firstName);
        } catch (Exception e){
            LOGGER.error(e);
        }
        return user;
    }


}
