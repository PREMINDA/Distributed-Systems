package com.example.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("notification")
public interface NotificationClient {
}
