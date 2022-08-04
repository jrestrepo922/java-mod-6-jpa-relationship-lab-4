package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "NETWORKS")
public class Network {

    @Id
    @GeneratedValue
    private int id;

    private String call_Letters;

    private Integer channel;

    @OneToMany(mappedBy = "network")
    private List<Show> shows = new ArrayList<Show>();

    public void addShows(Show show){
        this.shows.add(show);
    }

    public String getCall_Letters() {
        return call_Letters;
    }

    public void setCall_Letters(String call_Letters) {
        this.call_Letters = call_Letters;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
