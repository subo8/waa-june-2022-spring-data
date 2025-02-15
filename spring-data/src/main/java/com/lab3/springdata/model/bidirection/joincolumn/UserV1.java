package com.lab3.springdata.model.bidirection.joincolumn;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserV1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    //  Create UserV1 and AddressV1 mapping with Join Column
    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressV1 address;

    //  Create UserV1 and ReviewV1 mapping with Join Column
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<ReviewV1> review;
}