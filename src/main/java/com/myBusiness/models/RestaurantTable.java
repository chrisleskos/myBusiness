package com.myBusiness.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class RestaurantTable extends Property {
    int seats;
}
