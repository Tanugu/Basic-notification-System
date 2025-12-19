package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Notification;
import com.example.demo.enumclass.NotificationChannel;
import com.example.demo.enumclass.NotificationStatus;

@Service
public class NotificationProcessor {

    @Async
    public void sendAsync(Notification notification) {

        try {
            if (notification.getChannel() == NotificationChannel.EMAIL) {
                sendEmail(notification.getMessage());
            } else if (notification.getChannel() == NotificationChannel.SMS) {
                sendSms(notification.getMessage());
            }

            notification.setStatus(NotificationStatus.SENT);

        } catch (Exception e) {
            notification.setStatus(NotificationStatus.FAILED);
        }

        // log status
        System.out.println(
            "Notification via " + notification.getChannel() +
            " status: " + notification.getStatus()
        );
    }

    private void sendEmail(String message) {
        System.out.println("Sending EMAIL: " + message);
    }

    private void sendSms(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

