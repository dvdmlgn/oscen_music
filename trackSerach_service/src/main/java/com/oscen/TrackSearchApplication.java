package com.oscen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TrackSearchApplication {

    public static void main(String[] argss) {
        SpringApplication.run(TrackSearchApplication.class);
    }
}
