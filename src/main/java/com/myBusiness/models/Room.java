package com.myBusiness.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Room extends Property {
    int beds;

    Room() {
        super();
    }
}
