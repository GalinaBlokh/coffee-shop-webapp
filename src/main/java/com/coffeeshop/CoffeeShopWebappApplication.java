package com.coffeeshop;

import com.coffeeshop.model.entity.Example;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class CoffeeShopWebappApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeShopWebappApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

            Stream.of(
                Example.builder()
                        .id(1L)
                        .name("abc")
                        .build(),
                Example.builder()
                        .id(2L)
                        .name("zyx")
                        .build()
        ).collect(Collectors.toList());

    }
}
