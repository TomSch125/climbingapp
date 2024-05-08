package com.example.ClimbingApp.Entities;

import com.example.ClimbingApp.Entities.Beta;
import com.example.ClimbingApp.Entities.Hold;
import jakarta.persistence.*;

@Entity
//@IdClass(H_B_LinkId.class)
public class H_B_Link {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "beta_id", referencedColumnName = "id")
    private Beta beta;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
