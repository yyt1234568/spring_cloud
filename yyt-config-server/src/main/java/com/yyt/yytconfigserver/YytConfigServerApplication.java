package com.yyt.yytconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class YytConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YytConfigServerApplication.class, args);
    }
}
