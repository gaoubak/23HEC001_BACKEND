package com.application.model;

import java.time.LocalDate;

import org.h2.engine.User;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id",nullable = false)
    private User user_id;

    @JoinColumn(name = "user_text", nullable = false)
    private String user_text;

    @ManyToOne
    @JoinColumn(name = "chanel", referencedColumnName = "id", nullable = false)
    private Chanel chanel;

    @Column(name = "createdAt",nullable = false)
    private LocalDate createdAt = LocalDate.now();
}
