package com.example.ClimbingApp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

public class User_ratingId implements Serializable {
    private User user;

    private Route route;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        User_ratingId pk = (User_ratingId) o;
        return Objects.equals( user, pk.user ) &&
                Objects.equals( route, pk.route );
    }

    @Override
    public int hashCode() {
        Integer uId = user.getId();
        Integer rId = route.getId();
        return Objects.hash( uId, rId );
    }
}
