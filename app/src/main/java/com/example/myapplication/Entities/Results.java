package com.example.myapplication.Entities;

import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Jeff on 13-5-2015.
 * ITS A LIST OF SHOWS. WOW SUCH SURPRISE.
 */
@Root(strict=false)
public class Results {

    private List<Show> shows;

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
