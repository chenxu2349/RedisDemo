package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(RedisDemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApplication.class, args);
        logger.info("****************************************\n");
        logger.info("    RedisDemo Service has started...\n");
        logger.info("****************************************");
    }
}
