package com.app.miportfolio.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter @Setter
public class LoginRequest {
    
    @NotBlank
    private String username;

    @NotBlank
    private String password;    
    
}
