package com.juniormelodeveloper.ClinicMedic.model;

import com.juniormelodeveloper.ClinicMedic.GenerateCard.CardGenerate;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique=true)
     private String numCard;

    public Card() {
        this.numCard = CardGenerate.gerarNumeroCartao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumCard() {
        return numCard;
    }

    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }
}
