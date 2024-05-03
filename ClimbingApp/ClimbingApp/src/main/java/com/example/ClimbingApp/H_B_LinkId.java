package com.example.ClimbingApp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

public class H_B_LinkId implements Serializable {
    private Beta beta;

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

    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        H_B_LinkId pk = (H_B_LinkId) o;
        return Objects.equals( beta, pk.beta ) &&
                Objects.equals( hold, pk.hold );
    }

    @Override
    public int hashCode() {
        Integer hId = hold.getId();
        Integer bId = beta.getId();
        return Objects.hash( hId, bId );
    }
}
