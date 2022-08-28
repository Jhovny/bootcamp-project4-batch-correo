package com.nttdata.bootcamp.batchcorreo.domain.dto.email;


import com.nttdata.bootcamp.batchcorreo.domain.dto.NotificationResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationEmailResponse extends NotificationResponse {

    private String messageDetail;

}
