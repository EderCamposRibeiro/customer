package org.acme.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String phone;

    private String email;

    private String address;
    
    private Long age;
    
}
