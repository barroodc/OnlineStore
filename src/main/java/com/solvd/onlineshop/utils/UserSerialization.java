package com.solvd.onlineshop.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.solvd.onlineshop.model.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class UserSerialization extends StdSerializer<User> {




    public UserSerialization(){
        this(null);
    }
    public UserSerialization(Class<User> t) {
        super(t);
    }

    @Override
    public void serialize(User user, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectId("id");
        jsonGenerator.writeObject("employeesId");
        jsonGenerator.writeStringField("firstName", user.getFirstName());
        jsonGenerator.writeStringField("middleName", user.getMiddleName());
        jsonGenerator.writeStringField("lastName", user.getLastName());
        jsonGenerator.writeStringField("mobile", user.getMobile());
        jsonGenerator.writeStringField("email", user.getEmail());
        jsonGenerator.writeStringField("password", user.getPassword());
        jsonGenerator.writeStringField("userName", user.getUserName());


        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");
        objectMapper.setDateFormat(dateFormat);
        String timeCreated = objectMapper.writeValueAsString(user.getTimeCreated());
        String lastLogin = objectMapper.writeValueAsString(user.getLastLogin());
        jsonGenerator.writeStringField("timeCreated",timeCreated);
        jsonGenerator.writeStringField("lastLogin", lastLogin);
        SimpleModule module = new SimpleModule("UserSerializer");
        module.addSerializer(User.class, new UserSerialization());
        objectMapper.registerModule(module);
    }

}
