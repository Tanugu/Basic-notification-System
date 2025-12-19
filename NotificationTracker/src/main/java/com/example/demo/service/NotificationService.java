package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.NotificationRequest;
import com.example.demo.entity.Notification;
import com.example.demo.enumclass.*;

@Service
public class NotificationService {

    private final NotificationProcessor notificationProcessor;

    public NotificationService(NotificationProcessor notificationProcessor) {
        this.notificationProcessor = notificationProcessor;
    }

    public void processNotification(NotificationRequest request) {

        for (NotificationChannel channel : request.getChannels()) {

            Notification notification =
                    new Notification(request.getMessage(), channel);

            notificationProcessor.sendAsync(notification);
        }
    }
}
