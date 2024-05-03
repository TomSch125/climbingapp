package com.example.ClimbingApp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

public class PortfolioId implements Serializable {

    private User user;

    private Climb climb;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Climb getClimb() {
        return climb;
    }

    public void setClimb(Climb climb) {
        this.climb = climb;
    }

    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        PortfolioId pk = (PortfolioId) o;
        return Objects.equals( user, pk.user ) &&
                Objects.equals( climb, pk.climb );
    }
}
