package com.example.ClimbingApp.Entities;
import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column(unique=true)
    private String name;
    @Column(unique=true)
    private String email;

    private String password;

    private Integer privilege;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}