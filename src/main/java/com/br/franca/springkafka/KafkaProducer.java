package com.br.franca.springkafka;

import com.br.franca.springkafka.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private StreamBridge streamBridge;


    public void sendMessage(){
        streamBridge.send("producer-out-0",new Message(" jack from Stream bridge"));
    }
}
