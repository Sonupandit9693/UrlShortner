package com.urlShortner.domain.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="sort_urls")
public class ShortUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String shortKey;

    @Column(nullable = false)
    private String originalUrl;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User user;
    private boolean isPrivate;
    private LocalDateTime createdAt = LocalDateTime.now();
    private  LocalDateTime expiresAt;
    private long clickCout;
//    public Long getId(){
//        return 0;
//    }


}
