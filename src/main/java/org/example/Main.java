package org.example;

import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.11.128", 6379);
        System.out.println(jedis.ping());
    }
}