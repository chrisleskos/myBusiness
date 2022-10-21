package com.myBusiness.models;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
abstract public class Property {
    @Id
    @SequenceGenerator(
            name = "property_sequence",
            sequenceName = "property_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "property_sequence"
    )
    @Column(
            name = "property_id"
    )
    private int id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private Date from_date;
    private Date to_date;
}
