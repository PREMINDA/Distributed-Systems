package com.example.clients.notification;

public record NotificationRequest(Integer toCustomerId,
        String toCustomerEmail,
        String sender, String message
        ) {
}
