package org.lastzu.spring;

import org.lastzu.spring.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            SpringConfig.class
        );

        MusicStation station = context.getBean("musicStation", MusicStation.class);
        System.out.println(station.play());
        System.out.println(station.getName());

        context.close();
    }
}
