package org.example;

import redis.clients.jedis.Jedis;

import java.util.Random;

public class PhoneCode {
    public static void main(String[] args) {
        System.out.println(getCode());
    }

    //1.生成六位随机验证码
    public static String getCode() {
        Random random = new Random();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            int rand = random.nextInt(10);
            str.append(rand);
        }
        return str.toString();
    }

    //2.限制每个手机号每天只能发三次，验证码放入redis中，设置过期时间
    public static void verifyCode(String phoneNum, String code) {
        Jedis jedis = new Jedis("192.168.11.128", 6379);
    }

    //3.对比校验
}
