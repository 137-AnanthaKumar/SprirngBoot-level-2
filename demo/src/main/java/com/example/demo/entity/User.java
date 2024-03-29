package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class User {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
    @Column
    private String userName;
    @Column
	private String passWord;
    
        
    
}
