package com.macaron.dstagram.domain.account;

import com.macaron.dstagram.domain.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;
    private String status;

    private LocalDateTime lastLoginAt;

    @Builder
    public Account(String name, String password, String status) {
        this.name = name;
        this.password = password;
        this.status = status;
        this.lastLoginAt = LocalDateTime.now();
    }
}
