package com.nttdata.bootcamp.batchcorreo.domain.dto;

import lombok.Data;

@Data
public class NotificationRequest {
    private String userName;
    private String typeNotification;
}