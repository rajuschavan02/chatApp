package com.example.chatApp.model;

import lombok.Data;

@Data
public class ChatMessage {
    private Integer id;
    private String sender;
    private String content;  // ✔ correct field

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ChatMessage(Integer id, String sender, String content) {
        this.id = id;
        this.sender = sender;
        this.content = content;
    }

    public ChatMessage() {
    }
}

