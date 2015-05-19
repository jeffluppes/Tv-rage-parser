package com.example.myapplication.Activities.dummy;

import com.example.myapplication.Entities.Show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ShowList {

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static List<Show> SHOWS = new ArrayList<Show>();

    public static Show getShowById(String id) {
        for (Show show : SHOWS) {
            if (show.getShowid().equals(id)) {
                return show;
            }
        }

        return null;
    }
}
