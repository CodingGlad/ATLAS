package com.example.sqlSpring;

import com.sun.istack.NotNull;
import javax.persistence.*;

//Vytvoreni a prace s tabulkou  "Records" - intersection entity pro dokumenty a uzivatele

@Entity
@Table(name = "Records")
public class Record {

    //Prvni foreign+primary key od dokumentu
    @Id
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_opened", referencedColumnName = "document_id")
    private Integer document_id;
    //Druhy foreign+primary key od dokumentu
    @Id
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "opened_by", referencedColumnName = "user_id")
    private Integer user_id;

    public Integer getDocument_id() {
        return document_id;
    }

    public void setDocument_id(Integer document_id) {
        this.document_id = document_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

}