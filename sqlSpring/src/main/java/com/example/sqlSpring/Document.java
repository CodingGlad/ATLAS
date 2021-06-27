package com.example.sqlSpring;

import com.sun.istack.NotNull;

import javax.persistence.*;

//Vytvoreni a prace s tabulkou  "Documents"

@Entity
@Table(name = "Documents")
public class Document{
    @Id
    @NotNull
    @Column(name = "document_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "document_name")
    private String nazev;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }
}
