package com.example.demo.dto;

import java.util.List;

import com.example.demo.enumclass.NotificationChannel;

public class NotificationRequest {

    private String message;
    private List<NotificationChannel> channels;
    
    
    // getters & setters
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<NotificationChannel> getChannels() {
		return channels;
	}
	public void setChannels(List<NotificationChannel> channels) {
		this.channels = channels;
	}

    
}

