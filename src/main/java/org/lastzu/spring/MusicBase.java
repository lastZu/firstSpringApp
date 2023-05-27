package org.lastzu.spring;

import org.lastzu.spring.utils.Utils;

import java.util.List;

public abstract class MusicBase implements Music{
    private String name;
    private List<String> songs;

    public String play() {
        String musicName = Utils.randomElement(songs);
        return musicName;
    }

    @Override
    public String toString() {
        return getName() + ": " + play();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
