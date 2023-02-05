package com.app.miportfolio.payload.response;

import lombok.*;


@Getter @Setter
public class MessageResponse {
    
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    
    
}
