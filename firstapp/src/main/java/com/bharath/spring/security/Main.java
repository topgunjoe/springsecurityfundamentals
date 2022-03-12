package com.bharath.spring.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author topgunjoe
 * created 08/03/2022 20:08
 */
public class Main {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        System.out.println(encoder.encode("pass"));
    }

}
