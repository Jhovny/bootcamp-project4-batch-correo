package com.nttdata.bootcamp.batchcorreo.domain.dto.email;


import com.nttdata.bootcamp.batchcorreo.domain.dto.NotificationRequest;
import lombok.Data;

@Data
public class NotificationEmailRequest extends NotificationRequest {


    private String emailTo;
    private String emailSubject;
    private String emailBody;



}
