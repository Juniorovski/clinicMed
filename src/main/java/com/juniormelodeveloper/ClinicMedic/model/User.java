package com.juniormelodeveloper.ClinicMedic.model;

import jakarta.persistence.*;
import java.util.Calendar;

@Entity(name = "tb-user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @Temporal(TemporalType.TIMESTAMP)
   private Calendar dateSave = Calendar.getInstance();
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Calendar getDateSave() {
        return dateSave;
    }

    public void setDateSave(Calendar dateSave) {
        this.dateSave = dateSave;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
