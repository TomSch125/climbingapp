package com.example.ClimbingApp;

import jakarta.persistence.*;

@Entity
public class H_B_Link {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "beta_id", referencedColumnName = "id")
    private Beta beta;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hold_id", referencedColumnName = "id")
    private Hold hold;

    public Beta getBeta() {
        return beta;
    }

    public void setBeta(Beta beta) {
        this.beta = beta;
    }

    public Hold getHold() {
        return hold;
    }

    public void setHold(Hold hold) {
        this.hold = hold;
    }
}
