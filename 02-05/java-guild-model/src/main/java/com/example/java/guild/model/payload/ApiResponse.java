package com.example.java.guild.model.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ApiResponse {
    private Boolean success;
    private String message;
    private HttpStatus status;
}
