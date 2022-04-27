package com.macaron.dstagram.domain;

import com.macaron.dstagram.common.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Post extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long accountId;

    private String status;

    private String content;

    private Long geoInfoId;

    @Builder
    public Post(Long accountId, String status, String content, Long geoInfoId) {
        this.accountId = accountId;
        this.status = status;
        this.content = content;
        this.geoInfoId = geoInfoId;
    }

}
