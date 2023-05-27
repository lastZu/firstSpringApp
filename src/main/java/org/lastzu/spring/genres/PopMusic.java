package org.lastzu.spring.genres;

import org.lastzu.spring.MusicBase;

import java.util.ArrayList;
import java.util.List;

public class PopMusic extends MusicBase {
    public PopMusic() {
        setName("POP");
        List<String> songs = new ArrayList<>();
        songs.add("LaLaLa");
        songs.add("TuTuTu");
        songs.add("KiKiKi");
        setSongs(songs);
    }
}
