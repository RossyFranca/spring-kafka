package com.br.franca.springkafka.controller;

import com.br.franca.springkafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dados-pessoais")
public class ConsultaController {
    @Autowired
    KafkaProducer kafkaProducer;

    @GetMapping("consulta")
    public void realizarConsulta() {
        //Vai no banco realizar uma consulta
        kafkaProducer.sendMessage();

    }
}
