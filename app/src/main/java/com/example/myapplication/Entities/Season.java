package com.example.myapplication.Entities;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

/**
 * Created by Jeff on 20-4-2015.
 */
public class Season {
    private String episodeNo;
    private String type;
    private List<Episode> Episodes;

    public String getEpisodeNo() {
        return episodeNo;
    }

    public void setEpisodeNo(String episodeNo) {
        this.episodeNo = episodeNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Episode> getEpisodes() {
        return Episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        Episodes = episodes;
    }

    @Override
    public String toString() {
        return "Season{" +
                "episodeNo='" + episodeNo + '\'' +
                '}';
    }
}
