package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "CHARACTERS")
public class Character {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String catchphrase;

    @ManyToOne
    private Actor actor;

    @ManyToOne
    private Show show;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
