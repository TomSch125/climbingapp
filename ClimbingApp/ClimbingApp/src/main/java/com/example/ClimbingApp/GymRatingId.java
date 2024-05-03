package com.example.ClimbingApp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

public class GymRatingId implements Serializable {
//    @Id
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

//    @Id
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "gym_id", referencedColumnName = "id")
    private Location gym;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Location getGym() {
        return gym;
    }

    public void setGym(Location gym) {
        this.gym = gym;
    }

    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        GymRatingId pk = (GymRatingId) o;
        return Objects.equals( user, pk.user ) &&
                Objects.equals( gym, pk.gym );
    }
}
