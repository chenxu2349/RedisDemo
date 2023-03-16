package org.example;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.11.128", 6379);
        System.out.println(jedis.ping());
        List<String> s = new LinkedList<>();
        s.get(0);
        jedis.close();
    }

    @Test
    public void demo1() {
        Jedis jedis = new Jedis("192.168.11.128", 6379);
        jedis.set("k1", "Jack");
        jedis.mset("k2", "v2", "k3", "v3");
        Set<String> keys = jedis.keys("*");
        for(String key : keys) {
            System.out.println(key);
            System.out.println(jedis.get(key));
        }
    }
}