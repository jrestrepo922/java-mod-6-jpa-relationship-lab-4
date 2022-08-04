package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ACTORS")
public class Actor {

    @Id
    @GeneratedValue
    private int id;

    private String first_name;

    private String last_name;

    @OneToMany(mappedBy = "actor")
    private List<Character> characters = new ArrayList<Character>();

    public void addCharacter(Character character){
        this.characters.add(character);
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacter(List<Character> character) {
        this.characters = character;
    }
}
