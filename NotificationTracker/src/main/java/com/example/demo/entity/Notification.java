package com.example.demo.entity;

import com.example.demo.enumclass.NotificationChannel;
import com.example.demo.enumclass.NotificationStatus;

public class Notification {

    private Long id;
    private String message;
    private NotificationChannel channel;
    private NotificationStatus status;

    public Notification(String message, NotificationChannel channel) {
        this.message = message;
        this.channel = channel;
        this.status = NotificationStatus.PENDING;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NotificationChannel getChannel() {
		return channel;
	}

	public void setChannel(NotificationChannel channel) {
		this.channel = channel;
	}

	public NotificationStatus getStatus() {
		return status;
	}

	public void setStatus(NotificationStatus status) {
		this.status = status;
	}

    
}

