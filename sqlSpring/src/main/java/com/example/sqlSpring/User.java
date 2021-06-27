package com.example.sqlSpring;

import com.sun.istack.NotNull;

import javax.persistence.*;

//Vytvoreni a prace s tabulkou  "Users"

@Entity
@Table(name = "Users")
public class User {
    //Primary key user_id, automaticka hodnota pomoci sequence
    @Id
    @NotNull
    @Column(name = "user_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "user_name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}