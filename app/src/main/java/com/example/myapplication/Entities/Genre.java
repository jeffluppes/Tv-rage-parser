package com.example.myapplication.Entities;

/**
 * Created by Jeff on 20-4-2015.
 */
public class Genre {
    // the genre
    private String value;

    @Override
    public String toString() {
        return "Genre{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
