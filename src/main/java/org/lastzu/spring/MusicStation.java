package org.lastzu.spring;

import org.lastzu.spring.genres.ClassicMusic;
import org.lastzu.spring.genres.PopMusic;
import org.lastzu.spring.genres.RockMusic;
import org.lastzu.spring.utils.Utils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicStation {
    private List<MusicType> types;
    private String name;
    private int volume;

    public MusicStation(List<MusicType> types) {
        this.types = types;
    }

    public MusicStation() {}

    public String play() {
        MusicType type = Utils.randomElement(types);
        Music music = switch (type) {
            case CLASSICAL -> new ClassicMusic();
            case ROCK -> new RockMusic();
            case POP -> new PopMusic();
        };
        return music.play();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
}
