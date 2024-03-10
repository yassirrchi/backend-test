package com.peacock.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Bill {

    //client
    //product with quantity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "bill",orphanRemoval = true)

    private List<BillItem> billItems=new ArrayList<BillItem>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;



    private Date dateFacture;

}
