package com.example.myapplication.Entities;

/**
 * Created by Jeff on 20-4-2015.
 */
public class Episode {
    private String title;
    private String airdate;
    private String link;
    private String epnum;
    private String seasonnum;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAirdate() {
        return airdate;
    }

    public void setAirdate(String airdate) {
        this.airdate = airdate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getEpnum() {
        return epnum;
    }

    public void setEpnum(String epnum) {
        this.epnum = epnum;
    }

    public String getSeasonnum() {
        return seasonnum;
    }

    public void setSeasonnum(String seasonnum) {
        this.seasonnum = seasonnum;
    }
}
