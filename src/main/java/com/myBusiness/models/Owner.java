package com.myBusiness.models;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Owner {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "owner_id"
    )
    private int id;
    private String username;
    private String email;
    private String password;
    private boolean locked = false;
    private boolean enabled = false;
}
