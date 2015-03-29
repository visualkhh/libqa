package com.libqa.web.domain;

import com.libqa.application.enums.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by yion on 2015. 1. 25..
 */
@Data
@Entity
@EqualsAndHashCode
public class User {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(length = 80, nullable = false, unique = true)
    private String userEmail;

    @Column(length = 40, nullable = false, unique = true)
    private String userNick;

    @Column(length = 100, nullable = false)
    private String userSite;

    @Column(length = 40, nullable = false)
    private String userImageName;

    @Column(length = 80)
    private String userImagePath;

    @Column(length = 40, nullable = false)
    private String userThumbnailImageName;

    @Column(length = 80)
    private String userThumbnailImagePath;

    @Column(columnDefinition = "TINYINT(1) DEFAULT 0")
    private boolean isDeleted;  // (Y : 탈퇴, N: 활성)

    @Column(length = 255, nullable = false)
    private String userPass;

    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer visiteCount;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date lastVisiteDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date insertDate;

    @Temporal(TemporalType.DATE)
    private Date updateDate;

    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer userTotalPoint;

    @Column(columnDefinition = "TINYINT(1) DEFAULT 0", nullable = false)
    private boolean isCertification;

    @Column(length = 255, nullable = false)
    private String certificationKey;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<UserKeyword> userKeywords;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<UserPoint> userPoints;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<UserFavorite> userFavorites;

}
