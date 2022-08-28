package com.nttdata.bootcamp.batchcorreo.web.controller;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping()
    public Flux<String> test(){

        return Flux.just("Servicio batch correo test ejecutando");
    }

}
