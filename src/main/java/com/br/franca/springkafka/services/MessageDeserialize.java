package com.br.franca.springkafka.services;

import com.br.franca.springkafka.dto.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

public class MessageDeserialize implements Deserializer<Message> {

    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public Message deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(new String(data), Message.class);
        } catch (JsonProcessingException e) {
            throw new SerializationException(e);
        }
    }
}
