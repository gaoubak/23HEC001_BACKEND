package com.application.model;

import org.h2.engine.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Association {
       
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

   @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "id",nullable = false)
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "chanel_id", referencedColumnName = "id", nullable = false)
    private Chanel chanel;


}
