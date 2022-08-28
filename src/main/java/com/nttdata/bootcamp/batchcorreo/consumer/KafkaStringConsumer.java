package com.nttdata.bootcamp.batchcorreo.consumer;

import com.google.gson.Gson;
import com.nttdata.bootcamp.batchcorreo.domain.dto.email.NotificationEmailRequest;
import com.nttdata.bootcamp.batchcorreo.domain.service.SendEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaStringConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaStringConsumer.class);

    @Autowired
    private SendEmailService sendEmailService;

    @KafkaListener(topics = "TOPIC-DEMO" , groupId = "group_id")
    public void consume(String message) {
        Gson gson = new Gson();
        NotificationEmailRequest notificationEmailRequest = gson.fromJson(message, NotificationEmailRequest.class);
        sendEmail(notificationEmailRequest);
        logger.info("Mensaje Consumido{}", notificationEmailRequest.getEmailTo());
    }


    private void sendEmail(NotificationEmailRequest request){

        sendEmailService.sendEmail(request.getEmailTo(),
                request.getEmailSubject(),
                request.getEmailBody());
    }

}
