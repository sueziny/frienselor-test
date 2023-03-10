package com.ideans.frienselor.client;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_seq")
    private Long clientSeq;

    @Column(name = "client_id", length = 50)
    private String clientId;

   /* @Column(name = "token", length = 1000)
    private String token;*/

    @Column(name = "nickname", length = 50)
    private String nickname;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<ClientKeyword> clientKeywords = new ArrayList<>();

    /*

    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<ClientInquiry> clientInquiries = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Counseling> clientCounselings = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Review> clientReviews = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Best> clientBest = new ArrayList<>();

     */


}
