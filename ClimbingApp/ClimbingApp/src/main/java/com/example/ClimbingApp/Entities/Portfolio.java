package com.example.ClimbingApp.Entities;
import jakarta.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
//@IdClass(PortfolioId.class)
public class Portfolio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
