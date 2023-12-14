package com.teamsearch.teamsearchbackend;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeamsearchBackendApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(TeamsearchBackendApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.setLogStartupInfo(false);
        springApplication.run(args);
    }

}
