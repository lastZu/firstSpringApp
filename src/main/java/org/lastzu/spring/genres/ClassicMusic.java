package org.lastzu.spring.genres;

import org.lastzu.spring.MusicBase;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicMusic extends MusicBase {
    public ClassicMusic() {
        setName("Classic");
        List<String> songs = new ArrayList<>();
        songs.add("Moon song");
        songs.add("Chai v dvoem");
        songs.add("Bakh");
        setSongs(songs);
    }
}
