package com.ideans.frienselor.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
public class ClientInquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_inquiry_seq")
    private Long clientInquirySeq;

    private String clientInquiryCategory;

    private String clientInquiryTitle;

    private String clientInquiryContent;

    private Date inquiryCreateDate;

    private Date inquiryModifyDate;




}
