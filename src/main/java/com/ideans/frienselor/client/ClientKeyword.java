package com.ideans.frienselor.client;

import com.ideans.frienselor.client.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class ClientKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_keyword_seq")
    private Long clientKeywordSeq;

    @Column(name = "client_keyword_num")
    private int clientKeywordNum;

    @Column(name = "client_keyword_type", length = 50)
    private String clientKeywordType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_seq")
    private Client client;

}
