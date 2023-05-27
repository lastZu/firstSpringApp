package org.lastzu.spring.genres;

import org.lastzu.spring.MusicBase;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic extends MusicBase {

    public RockMusic() {
        setName("Rock");
        List<String> songs = new ArrayList<>();
        songs.add("AC/DC");
        songs.add("Cha cha");
        songs.add("Linkin Park");
        setSongs(songs);
    }
}
