package org.lastzu.spring.config;

import org.lastzu.spring.*;
import org.lastzu.spring.genres.ClassicMusic;
import org.lastzu.spring.genres.PopMusic;
import org.lastzu.spring.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.lastzu.spring")
@PropertySource("classpath:MusicStation.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<MusicType> musicTypes() {
        List<MusicType> types = new ArrayList<>();
        types.add(MusicType.ROCK);
        types.add(MusicType.CLASSICAL);
        types.add(MusicType.POP);

        return types;
    }

    @Bean
    public MusicStation musicStation() {
        return new MusicStation(musicTypes());
    }
}
