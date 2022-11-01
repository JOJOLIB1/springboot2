package com.jjj.boot;

import ch.qos.logback.core.encoder.ByteArrayUtil;
import com.jjj.boot.pojo.Pet;
import javafx.util.converter.ByteStringConverter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: com.jjj.boot.JJJMessageConverter
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-01 22:04
 */
public class JJJMessageConverter implements HttpMessageConverter<Pet> {
    @Override
    public boolean canRead(Class clazz, MediaType mediaType) {
        return false;
    }

    @Override
    public boolean canWrite(Class clazz, MediaType mediaType) {
        return true;
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return MediaType.parseMediaTypes("application/jjj");
    }

    @Override
    public Pet read(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(Pet pet, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        outputMessage.getBody().write((pet.getName() + "::" + pet.getWeight()).getBytes());
    }
}
