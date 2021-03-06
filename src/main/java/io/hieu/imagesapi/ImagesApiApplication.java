package io.hieu.imagesapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ImagesApiApplication {
    private final Logger logger = LoggerFactory.getLogger(ImagesApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ImagesApiApplication.class, args);
    }
}