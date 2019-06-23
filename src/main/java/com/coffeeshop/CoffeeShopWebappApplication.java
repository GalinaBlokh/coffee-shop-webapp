package com.coffeeshop;

import com.coffeeshop.model.entity.Example;
import com.coffeeshop.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class CoffeeShopWebappApplication implements ApplicationRunner {
    @Autowired
    ExampleRepository exampleRepository;

    public static void main(String[] args) {
        SpringApplication.run(CoffeeShopWebappApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

          List<Example> examples =  Stream.of(
                Example.builder()
                        .id(1L)
                        .name("abc")
                        .build(),
                Example.builder()
                        .id(2L)
                        .name("zyx")
                        .build()
        ).collect(Collectors.toList());

          exampleRepository.saveAll(examples);

    }
}
