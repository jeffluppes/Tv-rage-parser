package com.example.myapplication.Entities;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
/**
 * Created by Jeff on 20-4-2015.
 */
@Root(strict=false)
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
