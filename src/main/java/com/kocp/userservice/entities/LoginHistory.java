package com.kocp.userservice.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class LoginHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime loginTimestamp;
    private String ipAddress;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}