package com.example.demo.entity;

@Entity
public class studentEntity{

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    
    @
    private String name;
    
    @Email(message="Email Format is not Valid")


}