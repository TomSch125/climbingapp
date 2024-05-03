package com.example.ClimbingApp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;
import java.util.Objects;

public class ConnectionId implements Serializable {
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "friend_id", referencedColumnName = "id")
    private User friend;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        ConnectionId pk = (ConnectionId) o;
        return Objects.equals( user, pk.user ) &&
                Objects.equals( friend, pk.friend );
    }
}
