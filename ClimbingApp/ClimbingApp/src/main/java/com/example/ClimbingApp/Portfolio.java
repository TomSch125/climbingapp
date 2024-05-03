package com.example.ClimbingApp;
import jakarta.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@IdClass(PortfolioId.class)
public class Portfolio {

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "climb_id", referencedColumnName = "id")
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
}
