package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SHOWS")
public class Show {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Column(name = "show_day")
    private String showDay;

    private String season;

    private String genre;

    @OneToMany(mappedBy = "show")
    private List<Character> characters = new ArrayList<Character>();

    public void  addCharacter(Character character){
        this.characters.add(character);
    }

    @ManyToOne
    private Network network;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
