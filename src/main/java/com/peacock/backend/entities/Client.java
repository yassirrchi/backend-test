package com.peacock.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    @OneToMany(mappedBy = "client",orphanRemoval = true)

    private List<Bill> bills=new ArrayList<Bill>();
}
