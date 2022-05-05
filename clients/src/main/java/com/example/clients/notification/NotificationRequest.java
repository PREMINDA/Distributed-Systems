package com.example.clients.notification;

import lombok.ToString;

@ToString
public record NotificationRequest(Integer toCustomerId,
        String toCustomerEmail,
        String sender, String message
        ) {
}
